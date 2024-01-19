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
 * Html span element.
 */
@ProviderType
@SuppressWarnings("java:S110") // # parent inheritance
public final class Span extends AbstractNonSelfClosingHtmlElement {
  private static final long serialVersionUID = 1L;

  private static final String ELEMENT_NAME = "span";

  /**
   * Initializes html element.
   */
  public Span() {
    super(ELEMENT_NAME);
  }

  /**
   * Initializes html element.
   * @param text Text
   */
  public Span(String text) {
    super(ELEMENT_NAME);
    setText(text);
  }

  // -- overwrite methods for builder pattern with covariant return types --

  @Override
  protected Span setEmptyAttributeValueAsBoolean(String attributeName, boolean value) {
    return (Span)super.setEmptyAttributeValueAsBoolean(attributeName, value);
  }

  @Override
  public Span setId(String value) {
    return (Span)super.setId(value);
  }

  @Override
  public Span setCssClass(String value) {
    return (Span)super.setCssClass(value);
  }

  @Override
  public Span addCssClass(String value) {
    return (Span)super.addCssClass(value);
  }

  @Override
  public Span setStyleString(String value) {
    return (Span)super.setStyleString(value);
  }

  @Override
  public Span setStyle(String styleAttribute, String styleValue) {
    return (Span)super.setStyle(styleAttribute, styleValue);
  }

  @Override
  public Span setTitle(String value) {
    return (Span)super.setTitle(value);
  }

  @Override
  public Span setData(String attributeName, String value) {
    return (Span)super.setData(attributeName, value);
  }

  @Override
  public Span setAttributeValueAsLong(String name, long value) {
    return (Span)super.setAttributeValueAsLong(name, value);
  }

  @Override
  public Span setText(String text) {
    return (Span)super.setText(text);
  }

}
