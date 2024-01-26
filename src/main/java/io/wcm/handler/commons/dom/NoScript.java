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

import org.osgi.annotation.versioning.ProviderType;

/**
 * Html noscript element.
 */
@ProviderType
@SuppressWarnings("java:S110") // # parent inheritance
public final class NoScript extends AbstractNonSelfClosingHtmlElement {

  private static final long serialVersionUID = 1L;

  private static final String ELEMENT_NAME = "noscript";

  /**
   * Initializes html element.
   */
  public NoScript() {
    super(ELEMENT_NAME);
  }

  // -- overwrite methods for builder pattern with covariant return types --

  @Override
  protected NoScript setEmptyAttributeValueAsBoolean(String attributeName, boolean value) {
    return (NoScript)super.setEmptyAttributeValueAsBoolean(attributeName, value);
  }

  @Override
  public NoScript setId(String value) {
    return (NoScript)super.setId(value);
  }

  @Override
  public NoScript setCssClass(String value) {
    return (NoScript)super.setCssClass(value);
  }

  @Override
  public NoScript addCssClass(String value) {
    return (NoScript)super.addCssClass(value);
  }

  @Override
  public NoScript setStyleString(String value) {
    return (NoScript)super.setStyleString(value);
  }

  @Override
  public NoScript setStyle(String styleAttribute, String styleValue) {
    return (NoScript)super.setStyle(styleAttribute, styleValue);
  }

  @Override
  public NoScript setTitle(String value) {
    return (NoScript)super.setTitle(value);
  }

  @Override
  public NoScript setData(String attributeName, String value) {
    return (NoScript)super.setData(attributeName, value);
  }

  @Override
  public NoScript setAttributeValueAsLong(String name, long value) {
    return (NoScript)super.setAttributeValueAsLong(name, value);
  }

  @Override
  public NoScript setText(String text) {
    return (NoScript)super.setText(text);
  }

}
