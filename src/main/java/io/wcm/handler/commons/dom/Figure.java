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
 * Html figure (figure) element.
 */
@ProviderType
@SuppressWarnings("java:S110") // # parent inheritance
public final class Figure extends AbstractNonSelfClosingHtmlElement {
  private static final long serialVersionUID = 1L;

  private static final String ELEMENT_NAME = "figure";

  /**
   * Initializes html element.
   */
  public Figure() {
    super(ELEMENT_NAME);
  }

  // -- overwrite methods for builder pattern with covariant return types --

  @Override
  protected Figure setEmptyAttributeValueAsBoolean(String attributeName, boolean value) {
    return (Figure)super.setEmptyAttributeValueAsBoolean(attributeName, value);
  }

  @Override
  public Figure setId(String value) {
    return (Figure)super.setId(value);
  }

  @Override
  public Figure setCssClass(String value) {
    return (Figure)super.setCssClass(value);
  }

  @Override
  public Figure addCssClass(String value) {
    return (Figure)super.addCssClass(value);
  }

  @Override
  public Figure setStyleString(String value) {
    return (Figure)super.setStyleString(value);
  }

  @Override
  public Figure setStyle(String styleAttribute, String styleValue) {
    return (Figure)super.setStyle(styleAttribute, styleValue);
  }

  @Override
  public Figure setTitle(String value) {
    return (Figure)super.setTitle(value);
  }

  @Override
  public Figure setData(String attributeName, String value) {
    return (Figure)super.setData(attributeName, value);
  }

  @Override
  public Figure setAttributeValueAsLong(String name, long value) {
    return (Figure)super.setAttributeValueAsLong(name, value);
  }

  @Override
  public Figure setText(String text) {
    return (Figure)super.setText(text);
  }

}
