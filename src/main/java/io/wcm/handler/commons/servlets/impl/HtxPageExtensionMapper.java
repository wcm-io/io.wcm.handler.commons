/*
 * #%L
 * wcm.io
 * %%
 * Copyright (C) 2014 wcm.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package io.wcm.handler.commons.servlets.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.request.RequestPathInfo;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.jetbrains.annotations.NotNull;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.wcm.api.NameConstants;

import io.wcm.wcm.commons.contenttype.FileExtension;

/**
 * Virtually maps an *.htx request to a cq:Page resource to a *.html request internally (because components
 * and JSPs are normally only registered to *.html extension). Mapping can be enabled or disabled.
 */
@Component(service = Servlet.class, configurationPolicy = ConfigurationPolicy.REQUIRE)
@SlingServletResourceTypes(
    resourceTypes = NameConstants.NT_PAGE,
    methods = HttpConstants.METHOD_GET,
    extensions = FileExtension.HTML_UNCACHED
)
@Designate(ocd = HtxPageExtensionMapper.Config.class)
public class HtxPageExtensionMapper extends SlingSafeMethodsServlet {
  private static final long serialVersionUID = 1L;

  @ObjectClassDefinition(name = "wcm.io htx Page Extension Mapper",
      description = "Mapps all *.htx requests on Pages to *.html view.")
  @interface Config {

    @AttributeDefinition(name = "Enabled", description = "Enable mapping.")
    boolean enabled() default false;

  }

  private static final Logger log = LoggerFactory.getLogger(HtxPageExtensionMapper.class);

  private boolean enabled;

  // ---------- SCR Integration ----------------------------------------------

  protected void activate(Config config) {
    // read config
    this.enabled = config.enabled();
  }

  @Override
  protected void doGet(@NotNull SlingHttpServletRequest request, @NotNull SlingHttpServletResponse response) throws ServletException, IOException {

    // if not enabled: sent http 404
    if (!enabled) {
      response.sendError(HttpServletResponse.SC_NOT_FOUND);
      return;
    }

    // rebuild requested url, but use "html" as extension instead of "htx"
    // to allow re-using all component definitions that are registered to "html"
    RequestPathInfo info = request.getRequestPathInfo();
    StringBuilder url = new StringBuilder();
    url.append(info.getResourcePath());
    if (info.getSelectorString() != null) {
      url.append('.').append(info.getSelectorString());
    }
    url.append('.').append(FileExtension.HTML); // use html extension instead of .htx extension
    if (info.getSuffix() != null) {
      url.append('/').append(info.getSuffix());
    }

    if (log.isDebugEnabled()) {
      log.debug("Dispatch request {} to {}", request.getRequestURI(), url);
    }

    // execute request with *.html extension
    RequestDispatcher requestDispatcher = request.getRequestDispatcher(url.toString());
    if (requestDispatcher != null) {
      requestDispatcher.include(request, response);
    }
    else {
      throw new ServletException("No Request Dispatcher.");
    }

  }

}
