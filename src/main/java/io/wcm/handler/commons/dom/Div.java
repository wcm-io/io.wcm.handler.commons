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
 * Html div element.
 */
@ProviderType
@SuppressWarnings("java:S110") // # parent inheritance
public final class Div extends AbstractNonSelfClosingHtmlElement {
  private static final long serialVersionUID = 1L;

  private static final String ELEMENT_NAME = "div";

  /**
   * Initializes html element.
   */
  public Div() {
    super(ELEMENT_NAME);
  }

  // -- overwrite methods for builder pattern with covariant return types --

  @Override
  protected Div setEmptyAttributeValueAsBoolean(String attributeName, boolean value) {
    return (Div)super.setEmptyAttributeValueAsBoolean(attributeName, value);
  }

  @Override
  public Div setId(String value) {
    return (Div)super.setId(value);
  }

  @Override
  public Div setCssClass(String value) {
    return (Div)super.setCssClass(value);
  }

  @Override
  public Div addCssClass(String value) {
    return (Div)super.addCssClass(value);
  }

  @Override
  public Div setStyleString(String value) {
    return (Div)super.setStyleString(value);
  }

  @Override
  public Div setStyle(String styleAttribute, String styleValue) {
    return (Div)super.setStyle(styleAttribute, styleValue);
  }

  @Override
  public Div setTitle(String value) {
    return (Div)super.setTitle(value);
  }

  @Override
  public Div setData(String attributeName, String value) {
    return (Div)super.setData(attributeName, value);
  }

  @Override
  public Div setAttributeValueAsLong(String name, long value) {
    return (Div)super.setAttributeValueAsLong(name, value);
  }

  @Override
  public Div setText(String text) {
    return (Div)super.setText(text);
  }

}
