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
 * Html source (source) element.
 */
@ProviderType
@SuppressWarnings("java:S110") // # parent inheritance
public class Source extends HtmlElement {
  private static final long serialVersionUID = 1L;

  private static final String ELEMENT_NAME = "source";

  private static final String ATTRIBUTE_MEDIA = "media";
  private static final String ATTRIBUTE_SRC = "src";
  private static final String ATTRIBUTE_SRCSET = "srcset";
  private static final String ATTRIBUTE_SIZES = "sizes";
  private static final String ATTRIBUTE_TYPE = "type";

  /**
   * Initializes html element.
   */
  public Source() {
    super(ELEMENT_NAME);
  }

  /**
   * Html "media" attribute.
   * @return Value of attribute
   */
  public String getMedia() {
    return getAttributeValue(ATTRIBUTE_MEDIA);
  }

  /**
   * Html "media" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Source setMedia(String value) {
    setAttribute(ATTRIBUTE_MEDIA, value);
    return this;
  }

  /**
   * Html "src" attribute.
   * @return Value of attribute
   */
  public String getSrc() {
    return getAttributeValue(ATTRIBUTE_SRC);
  }

  /**
   * Html "src" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Source setSrc(String value) {
    setAttribute(ATTRIBUTE_SRC, value);
    return this;
  }

  /**
   * Html "srcset" attribute.
   * @return Value of attribute
   */
  public String getSrcSet() {
    return getAttributeValue(ATTRIBUTE_SRCSET);
  }

  /**
   * Html "srcset" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Source setSrcSet(String value) {
    setAttribute(ATTRIBUTE_SRCSET, value);
    return this;
  }

  /**
   * Html "sizes" attribute.
   * @return Value of attribute
   */
  public String getSizes() {
    return getAttributeValue(ATTRIBUTE_SIZES);
  }

  /**
   * Html "sizes" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Source setSizes(String value) {
    setAttribute(ATTRIBUTE_SIZES, value);
    return this;
  }

  /**
   * Html "type" attribute.
   * @return Value of attribute
   */
  public String getType() {
    return getAttributeValue(ATTRIBUTE_TYPE);
  }

  /**
   * Html "type" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Source setType(String value) {
    setAttribute(ATTRIBUTE_TYPE, value);
    return this;
  }

  // -- overwrite methods for builder pattern with covariant return types --

  @Override
  protected Source setEmptyAttributeValueAsBoolean(String attributeName, boolean value) {
    return (Source)super.setEmptyAttributeValueAsBoolean(attributeName, value);
  }

  @Override
  public Source setId(String value) {
    return (Source)super.setId(value);
  }

  @Override
  public Source setCssClass(String value) {
    return (Source)super.setCssClass(value);
  }

  @Override
  public Source addCssClass(String value) {
    return (Source)super.addCssClass(value);
  }

  @Override
  public Source setStyleString(String value) {
    return (Source)super.setStyleString(value);
  }

  @Override
  public Source setStyle(String styleAttribute, String styleValue) {
    return (Source)super.setStyle(styleAttribute, styleValue);
  }

  @Override
  public Source setTitle(String value) {
    return (Source)super.setTitle(value);
  }

  @Override
  public Source setData(String attributeName, String value) {
    return (Source)super.setData(attributeName, value);
  }

  @Override
  public Source setAttributeValueAsLong(String name, long value) {
    return (Source)super.setAttributeValueAsLong(name, value);
  }

  @Override
  public Source setText(String text) {
    return (Source)super.setText(text);
  }

}
