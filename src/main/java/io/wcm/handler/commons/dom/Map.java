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
 * Html map element.
 */
@ProviderType
@SuppressWarnings("java:S110") // # parent inheritance
public final class Map extends AbstractNonSelfClosingHtmlElement {
  private static final long serialVersionUID = 1L;

  private static final String ELEMENT_NAME = "map";
  private static final String ATTRIBUTE_NAME = "name";

  /**
   * Initializes html element.
   */
  public Map() {
    super(ELEMENT_NAME);
  }

  /**
   * Html "name" attribute.
   * @return Value of attribute
   */
  public String getMapName() {
    return getAttributeValue(ATTRIBUTE_NAME);
  }

  /**
   * Html "name" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Map setMapName(String value) {
    setAttribute(ATTRIBUTE_NAME, value);
    return this;
  }

  // -- overwrite methods for builder pattern with covariant return types --

  @Override
  protected Map setEmptyAttributeValueAsBoolean(String attributeName, boolean value) {
    return (Map)super.setEmptyAttributeValueAsBoolean(attributeName, value);
  }

  @Override
  public Map setId(String value) {
    return (Map)super.setId(value);
  }

  @Override
  public Map setCssClass(String value) {
    return (Map)super.setCssClass(value);
  }

  @Override
  public Map addCssClass(String value) {
    return (Map)super.addCssClass(value);
  }

  @Override
  public Map setStyleString(String value) {
    return (Map)super.setStyleString(value);
  }

  @Override
  public Map setStyle(String styleAttribute, String styleValue) {
    return (Map)super.setStyle(styleAttribute, styleValue);
  }

  @Override
  public Map setTitle(String value) {
    return (Map)super.setTitle(value);
  }

  @Override
  public Map setData(String attributeName, String value) {
    return (Map)super.setData(attributeName, value);
  }

  @Override
  public Map setAttributeValueAsLong(String name, long value) {
    return (Map)super.setAttributeValueAsLong(name, value);
  }

  @Override
  public Map setText(String text) {
    return (Map)super.setText(text);
  }

}
