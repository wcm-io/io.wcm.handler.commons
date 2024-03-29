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
 * Html image (img) element.
 */
@ProviderType
@SuppressWarnings("java:S110") // # parent inheritance
public final class Image extends HtmlElement {
  private static final long serialVersionUID = 1L;

  private static final String ELEMENT_NAME = "img";

  private static final String ATTRIBUTE_SRC = "src";
  private static final String ATTRIBUTE_SRCSET = "srcset";
  private static final String ATTRIBUTE_SIZES = "sizes";
  private static final String ATTRIBUTE_ALT = "alt";
  private static final String ATTRIBUTE_WIDTH = "width";
  private static final String ATTRIBUTE_HEIGHT = "height";
  private static final String ATTRIBUTE_BORDER = "border";
  private static final String ATTRIBUTE_HSPACE = "hspace";
  private static final String ATTRIBUTE_VSPACE = "vspace";
  private static final String ATTRIBUTE_USEMAP = "usemap";

  /**
   * Initializes html element.
   */
  public Image() {
    super(ELEMENT_NAME);
  }

  /**
   * Initializes html element.
   * @param src Html "src" attribute.
   */
  public Image(String src) {
    this();
    setSrc(src);
  }

  /**
   * Initializes html element.
   * @param src Html "src" attribute.
   * @param alt Html "alt" attribute.
   */
  public Image(String src, String alt) {
    this();
    setSrc(src);
    setAlt(alt);
  }

  /**
   * Initializes html element.
   * @param src Html "src" attribute.
   * @param width Html "width" attribute.
   * @param height Html "height" attribute.
   */
  public Image(String src, long width, long height) {
    this();
    setSrc(src);
    setWidth(width);
    setHeight(height);
  }

  /**
   * Initializes html element.
   * @param src Html "src" attribute.
   * @param alt Html "alt" attribute.
   * @param width Html "width" attribute.
   * @param height Html "height" attribute.
   */
  public Image(String src, String alt, long width, long height) {
    this();
    setSrc(src);
    setAlt(alt);
    setWidth(width);
    setHeight(height);
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
  public Image setSrc(String value) {
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
  public Image setSrcSet(String value) {
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
  public Image setSizes(String value) {
    setAttribute(ATTRIBUTE_SIZES, value);
    return this;
  }

  /**
   * Html "alt" attribute.
   * @return Value of attribute
   */
  public String getAlt() {
    return getAttributeValue(ATTRIBUTE_ALT);
  }

  /**
   * Html "alt" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Image setAlt(String value) {
    setAttribute(ATTRIBUTE_ALT, value);
    return this;
  }

  /**
   * Html "width" attribute.
   * @return Value of attribute
   */
  public long getWidth() {
    return getAttributeValueAsLong(ATTRIBUTE_WIDTH);
  }

  /**
   * Html "width" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Image setWidth(long value) {
    setAttributeValueAsLong(ATTRIBUTE_WIDTH, value);
    return this;
  }

  /**
   * Html "height" attribute.
   * @return Value of attribute
   */
  public long getHeight() {
    return getAttributeValueAsLong(ATTRIBUTE_HEIGHT);
  }

  /**
   * Html "height" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Image setHeight(long value) {
    setAttributeValueAsLong(ATTRIBUTE_HEIGHT, value);
    return this;
  }

  /**
   * Html "border" attribute.
   * @return Value of attribute
   */
  public int getBorder() {
    return getAttributeValueAsInteger(ATTRIBUTE_BORDER);
  }

  /**
   * Html "border" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Image setBorder(int value) {
    setAttributeValueAsInteger(ATTRIBUTE_BORDER, value);
    return this;
  }

  /**
   * Html "hspace" attribute.
   * @return Value of attribute
   */
  public int getHSpace() {
    return getAttributeValueAsInteger(ATTRIBUTE_HSPACE);
  }

  /**
   * Html "hspace" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Image setHSpace(int value) {
    setAttributeValueAsInteger(ATTRIBUTE_HSPACE, value);
    return this;
  }

  /**
   * Html "vspace" attribute.
   * @return Value of attribute
   */
  public int getVSpace() {
    return getAttributeValueAsInteger(ATTRIBUTE_VSPACE);
  }

  /**
   * Html "vspace" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Image setVSpace(int value) {
    setAttributeValueAsInteger(ATTRIBUTE_VSPACE, value);
    return this;
  }

  /**
   * Html "usemap" attribute.
   * @return Value of attribute
   */
  public String getUseMap() {
    return getAttributeValue(ATTRIBUTE_USEMAP);
  }

  /**
   * Html "usemap" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Image setUseMap(String value) {
    setAttribute(ATTRIBUTE_USEMAP, value);
    return this;
  }

  // -- overwrite methods for builder pattern with covariant return types --

  @Override
  protected Image setEmptyAttributeValueAsBoolean(String attributeName, boolean value) {
    return (Image)super.setEmptyAttributeValueAsBoolean(attributeName, value);
  }

  @Override
  public Image setId(String value) {
    return (Image)super.setId(value);
  }

  @Override
  public Image setCssClass(String value) {
    return (Image)super.setCssClass(value);
  }

  @Override
  public Image addCssClass(String value) {
    return (Image)super.addCssClass(value);
  }

  @Override
  public Image setStyleString(String value) {
    return (Image)super.setStyleString(value);
  }

  @Override
  public Image setStyle(String styleAttribute, String styleValue) {
    return (Image)super.setStyle(styleAttribute, styleValue);
  }

  @Override
  public Image setTitle(String value) {
    return (Image)super.setTitle(value);
  }

  @Override
  public Image setData(String attributeName, String value) {
    return (Image)super.setData(attributeName, value);
  }

  @Override
  public Image setAttributeValueAsLong(String name, long value) {
    return (Image)super.setAttributeValueAsLong(name, value);
  }

  @Override
  public Image setText(String text) {
    return (Image)super.setText(text);
  }

}
