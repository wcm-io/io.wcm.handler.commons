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
 * Html anchor (a) element.
 */
@ProviderType
@SuppressWarnings("java:S110") // # parent inheritance
public final class Anchor extends AbstractNonSelfClosingHtmlElement {
  private static final long serialVersionUID = 1L;

  private static final String ELEMENT_NAME = "a";

  private static final String ATTRIBUTE_REL = "rel";
  private static final String ATTRIBUTE_HREF = "href";
  private static final String ATTRIBUTE_TARGET = "target";
  private static final String ATTRIBUTE_TABINDEX = "tabindex";
  private static final String ATTRIBUTE_ACCESSKEY = "accesskey";

  /**
   * Initializes html element.
   */
  public Anchor() {
    super(ELEMENT_NAME);
  }

  /**
   * Initializes html element.
   * @param href Html "href" attribute.
   */
  public Anchor(String href) {
    this();
    setHRef(href);
  }

  /**
   * Initializes html element.
   * @param href Html "href" attribute.
   * @param target Html "target" attribute.
   */
  public Anchor(String href, String target) {
    this();
    setHRef(href);
    setTarget(target);
  }

  /**
   * Html "rel" attribute.
   * @return Value of attribute
   */
  public String getRel() {
    return getAttributeValue(ATTRIBUTE_REL);
  }

  /**
   * Html "rel" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Anchor setRel(String value) {
    setAttribute(ATTRIBUTE_REL, value);
    return this;
  }

  /**
   * Html "href" attribute.
   * @return Value of attribute
   */
  public String getHRef() {
    return getAttributeValue(ATTRIBUTE_HREF);
  }

  /**
   * Html "href" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Anchor setHRef(String value) {
    setAttribute(ATTRIBUTE_HREF, value);
    return this;
  }

  /**
   * Html "target" attribute.
   * @return Value of attribute
   */
  public String getTarget() {
    return getAttributeValue(ATTRIBUTE_TARGET);
  }

  /**
   * Html "target" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Anchor setTarget(String value) {
    setAttribute(ATTRIBUTE_TARGET, value);
    return this;
  }

  /**
   * Html "tabindex" attribute.
   * @return Value of attribute
   */
  public int getTabIndex() {
    return getAttributeValueAsInteger(ATTRIBUTE_TABINDEX);
  }

  /**
   * Html "tabindex" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Anchor setTabIndex(int value) {
    setAttributeValueAsInteger(ATTRIBUTE_TABINDEX, value);
    return this;
  }

  /**
   * Html "accesskey" attribute.
   * @return Value of attribute
   */
  public String getAccessKey() {
    return getAttributeValue(ATTRIBUTE_ACCESSKEY);
  }

  /**
   * Html "accesskey" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Anchor setAccessKey(String value) {
    setAttribute(ATTRIBUTE_ACCESSKEY, value);
    return this;
  }

  // -- overwrite methods for builder pattern with covariant return types --

  @Override
  protected Anchor setEmptyAttributeValueAsBoolean(String attributeName, boolean value) {
    return (Anchor)super.setEmptyAttributeValueAsBoolean(attributeName, value);
  }

  @Override
  public Anchor setId(String value) {
    return (Anchor)super.setId(value);
  }

  @Override
  public Anchor setCssClass(String value) {
    return (Anchor)super.setCssClass(value);
  }

  @Override
  public Anchor addCssClass(String value) {
    return (Anchor)super.addCssClass(value);
  }

  @Override
  public Anchor setStyleString(String value) {
    return (Anchor)super.setStyleString(value);
  }

  @Override
  public Anchor setStyle(String styleAttribute, String styleValue) {
    return (Anchor)super.setStyle(styleAttribute, styleValue);
  }

  @Override
  public Anchor setTitle(String value) {
    return (Anchor)super.setTitle(value);
  }

  @Override
  public Anchor setData(String attributeName, String value) {
    return (Anchor)super.setData(attributeName, value);
  }

  @Override
  public Anchor setAttributeValueAsLong(String name, long value) {
    return (Anchor)super.setAttributeValueAsLong(name, value);
  }

  @Override
  public Anchor setText(String text) {
    return (Anchor)super.setText(text);
  }

}
