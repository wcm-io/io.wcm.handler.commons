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
package io.wcm.handler.commons.dom;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * Html element wrapper tags that must not rendered self-closing to avoid problems in certain browsers.
 * Mosf of the elements that extend from this class are block-level elements, but not all of them.
 */
@ConsumerType
@SuppressWarnings("java:S110") // # parent inheritance
public abstract class AbstractNonSelfClosingHtmlElement extends HtmlElement {
  private static final long serialVersionUID = 1L;

  /**
   * Initializes html element.
   * @param pName Element name
   */
  protected AbstractNonSelfClosingHtmlElement(String pName) {
    super(pName);

    // always initialize block-level elements with empty string to avoid self-closing elements
    // which make problems in some browsers
    setText("");
  }

}
