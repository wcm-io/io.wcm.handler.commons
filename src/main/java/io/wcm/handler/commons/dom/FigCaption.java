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
 * Html figure caption (figcaption) element.
 */
@ProviderType
@SuppressWarnings("java:S110") // # parent inheritance
public final class FigCaption extends AbstractNonSelfClosingHtmlElement {
  private static final long serialVersionUID = 1L;

  private static final String ELEMENT_NAME = "figcaption";

  /**
   * Initializes html element.
   */
  public FigCaption() {
    super(ELEMENT_NAME);
  }

  // -- overwrite methods for builder pattern with covariant return types --

  @Override
  protected FigCaption setEmptyAttributeValueAsBoolean(String attributeName, boolean value) {
    return (FigCaption)super.setEmptyAttributeValueAsBoolean(attributeName, value);
  }

  @Override
  public FigCaption setId(String value) {
    return (FigCaption)super.setId(value);
  }

  @Override
  public FigCaption setCssClass(String value) {
    return (FigCaption)super.setCssClass(value);
  }

  @Override
  public FigCaption addCssClass(String value) {
    return (FigCaption)super.addCssClass(value);
  }

  @Override
  public FigCaption setStyleString(String value) {
    return (FigCaption)super.setStyleString(value);
  }

  @Override
  public FigCaption setStyle(String styleAttribute, String styleValue) {
    return (FigCaption)super.setStyle(styleAttribute, styleValue);
  }

  @Override
  public FigCaption setTitle(String value) {
    return (FigCaption)super.setTitle(value);
  }

  @Override
  public FigCaption setData(String attributeName, String value) {
    return (FigCaption)super.setData(attributeName, value);
  }

  @Override
  public FigCaption setAttributeValueAsLong(String name, long value) {
    return (FigCaption)super.setAttributeValueAsLong(name, value);
  }

  @Override
  public FigCaption setText(String text) {
    return (FigCaption)super.setText(text);
  }

}
