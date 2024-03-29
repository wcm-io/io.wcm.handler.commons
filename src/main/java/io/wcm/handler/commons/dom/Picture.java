/*
 * #%L
 * wcm.io
 * %%
 * Copyright (C) 2019 wcm.io
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
 * Html picture element.
 */
@ProviderType
@SuppressWarnings("java:S110") // # parent inheritance
public final class Picture extends AbstractNonSelfClosingHtmlElement {
  private static final long serialVersionUID = 1L;

  private static final String ELEMENT_NAME = "picture";

  /**
   * Initializes html element.
   */
  public Picture() {
    super(ELEMENT_NAME);
  }

  // -- overwrite methods for builder pattern with covariant return types --

  @Override
  protected Picture setEmptyAttributeValueAsBoolean(String attributeName, boolean value) {
    return (Picture)super.setEmptyAttributeValueAsBoolean(attributeName, value);
  }

  @Override
  public Picture setId(String value) {
    return (Picture)super.setId(value);
  }

  @Override
  public Picture setCssClass(String value) {
    return (Picture)super.setCssClass(value);
  }

  @Override
  public Picture addCssClass(String value) {
    return (Picture)super.addCssClass(value);
  }

  @Override
  public Picture setStyleString(String value) {
    return (Picture)super.setStyleString(value);
  }

  @Override
  public Picture setStyle(String styleAttribute, String styleValue) {
    return (Picture)super.setStyle(styleAttribute, styleValue);
  }

  @Override
  public Picture setTitle(String value) {
    return (Picture)super.setTitle(value);
  }

  @Override
  public Picture setData(String attributeName, String value) {
    return (Picture)super.setData(attributeName, value);
  }

  @Override
  public Picture setAttributeValueAsLong(String name, long value) {
    return (Picture)super.setAttributeValueAsLong(name, value);
  }

  @Override
  public Picture setText(String text) {
    return (Picture)super.setText(text);
  }

}
