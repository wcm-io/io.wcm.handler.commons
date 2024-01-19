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
 * Html video (video) element.
 */
@ProviderType
@SuppressWarnings("java:S110") // # parent inheritance
public final class Video extends AbstractNonSelfClosingHtmlElement {
  private static final long serialVersionUID = 1L;

  private static final String ELEMENT_NAME = "video";

  private static final String ATTRIBUTE_AUTOPLAY = "autoplay";
  private static final String ATTRIBUTE_CONTROLS = "controls";
  private static final String ATTRIBUTE_HEIGHT = "height";
  private static final String ATTRIBUTE_LOOP = "loop";
  private static final String ATTRIBUTE_MUTED = "muted";
  private static final String ATTRIBUTE_POSTER = "poster";
  private static final String ATTRIBUTE_PRELOAD = "preload";
  private static final String ATTRIBUTE_SRC = "src";
  private static final String ATTRIBUTE_WIDTH = "width";

  /**
   * Initializes html element.
   */
  public Video() {
    super(ELEMENT_NAME);
  }

  /**
   * Html "autoplay" attribute.
   * @return Value of attribute
   */
  public boolean isAutoPlay() {
    return getEmptyAttributeValueAsBoolean(ATTRIBUTE_AUTOPLAY);
  }

  /**
   * Html "autoplay" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Video setAutoPlay(boolean value) {
    setEmptyAttributeValueAsBoolean(ATTRIBUTE_AUTOPLAY, value);
    return this;
  }

  /**
   * Html "controls" attribute.
   * @return Value of attribute
   */
  public boolean isControls() {
    return getEmptyAttributeValueAsBoolean(ATTRIBUTE_CONTROLS);
  }

  /**
   * Html "controls" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Video setControls(boolean value) {
    setEmptyAttributeValueAsBoolean(ATTRIBUTE_CONTROLS, value);
    return this;
  }

  /**
   * Html "loop" attribute.
   * @return Value of attribute
   */
  public boolean isLoop() {
    return getEmptyAttributeValueAsBoolean(ATTRIBUTE_LOOP);
  }

  /**
   * Html "loop" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Video setLoop(boolean value) {
    setEmptyAttributeValueAsBoolean(ATTRIBUTE_LOOP, value);
    return this;
  }

  /**
   * Html "muted" attribute.
   * @return Value of attribute
   */
  public boolean isMuted() {
    return getEmptyAttributeValueAsBoolean(ATTRIBUTE_MUTED);
  }

  /**
   * Html "muted" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Video setMuted(boolean value) {
    setEmptyAttributeValueAsBoolean(ATTRIBUTE_MUTED, value);
    return this;
  }

  /**
   * Html "poster" attribute.
   * @return Value of attribute
   */
  public String getPoster() {
    return getAttributeValue(ATTRIBUTE_POSTER);
  }

  /**
   * Html "poster" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Video setPoster(String value) {
    setAttribute(ATTRIBUTE_POSTER, value);
    return this;
  }

  /**
   * Html "preload" attribute.
   * @return Value of attribute
   */
  public String getPreload() {
    return getAttributeValue(ATTRIBUTE_PRELOAD);
  }

  /**
   * Html "preload" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Video setPreload(String value) {
    setAttribute(ATTRIBUTE_PRELOAD, value);
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
  public Video setSrc(String value) {
    setAttribute(ATTRIBUTE_SRC, value);
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
  public Video setHeight(long value) {
    setAttributeValueAsLong(ATTRIBUTE_HEIGHT, value);
    return this;
  }

  /**
   * Html "poster" attribute.
   * @return Value of attribute
   */
  public long getWidth() {
    return getAttributeValueAsLong(ATTRIBUTE_WIDTH);
  }

  /**
   * Html "poster" attribute.
   * @param value Value of attribute
   * @return Self reference
   */
  public Video setWidth(long value) {
    setAttributeValueAsLong(ATTRIBUTE_WIDTH, value);
    return this;
  }

  // -- overwrite methods for builder pattern with covariant return types --

  @Override
  protected Video setEmptyAttributeValueAsBoolean(String attributeName, boolean value) {
    return (Video)super.setEmptyAttributeValueAsBoolean(attributeName, value);
  }

  @Override
  public Video setId(String value) {
    return (Video)super.setId(value);
  }

  @Override
  public Video setCssClass(String value) {
    return (Video)super.setCssClass(value);
  }

  @Override
  public Video addCssClass(String value) {
    return (Video)super.addCssClass(value);
  }

  @Override
  public Video setStyleString(String value) {
    return (Video)super.setStyleString(value);
  }

  @Override
  public Video setStyle(String styleAttribute, String styleValue) {
    return (Video)super.setStyle(styleAttribute, styleValue);
  }

  @Override
  public Video setTitle(String value) {
    return (Video)super.setTitle(value);
  }

  @Override
  public Video setData(String attributeName, String value) {
    return (Video)super.setData(attributeName, value);
  }

  @Override
  public Video setAttributeValueAsLong(String name, long value) {
    return (Video)super.setAttributeValueAsLong(name, value);
  }

  @Override
  public Video setText(String text) {
    return (Video)super.setText(text);
  }

}
