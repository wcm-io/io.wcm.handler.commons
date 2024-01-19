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

import org.osgi.annotation.versioning.ConsumerType;


/**
 * Contains factory methods for creating and adding Html elements and specialized types.
 * This class cannot be instanciated directly, but provides factory methods for HtmlElement-based classes.
 */
@ConsumerType
public abstract class AbstractHtmlElementFactory extends AbstractElement {
  private static final long serialVersionUID = 1L;

  /**
   * Initializes html element factory.
   * @param name Element name
   */
  protected AbstractHtmlElementFactory(String name) {
    super(name);
  }

  /**
   * Creates and adds html element.
   * @param elementName Element name
   * @return Html element.
   */
  public final HtmlElement create(String elementName) {
    return this.add(new HtmlElement(elementName));
  }

  /**
   * Creates and adds html comment.
   * @param text Comment
   * @return Html comment.
   */
  public final HtmlComment createComment(String text) {
    HtmlComment comment = new HtmlComment(text);
    this.addContent(comment);
    return comment;
  }

  /**
   * Creates and adds div element.
   * @return Html element.
   */
  public final Div createDiv() {
    return this.add(new Div());
  }

  /**
   * Creates and adds span element.
   * @return Html element.
   */
  public final Span createSpan() {
    return this.add(new Span());
  }

  /**
   * Creates and adds span element.
   * @param text Text
   * @return Html element.
   */
  public final Span createSpan(String text) {
    return this.add(new Span(text));
  }

  /**
   * Creates and adds anchor (a) element.
   * @return Html element.
   */
  public final Anchor createAnchor() {
    return this.add(new Anchor());
  }

  /**
   * Creates and adds anchor (a) element.
   * @param href Html "href" attribute.
   * @return Html element.
   */
  public final Anchor createAnchor(String href) {
    return this.add(new Anchor(href));
  }

  /**
   * Creates and adds anchor (a) element.
   * @param href Html "href" attribute.
   * @param target Html "target" attribute.
   * @return Html element.
   */
  public final Anchor createAnchor(String href, String target) {
    return this.add(new Anchor(href, target));
  }

  /**
   * Creates and adds imgage (img) element.
   * @return Html element.
   */
  public final Image createImage() {
    return this.add(new Image());
  }

  /**
   * Creates and adds imgage (img) element.
   * @param src Html "src" attribute.
   * @return Html element.
   */
  public final Image createImage(String src) {
    return this.add(new Image(src));
  }

  /**
   * Creates and adds imgage (img) element.
   * @param src Html "src" attribute.
   * @param alt Html "alt" attribute.
   * @return Html element.
   */
  public final Image createImage(String src, String alt) {
    return this.add(new Image(src, alt));
  }

  /**
   * Creates and adds imgage (img) element.
   * @param src Html "src" attribute.
   * @param width Html "width" attribute.
   * @param height Html "height" attribute.
   * @return Html element.
   */
  public final Image createImage(String src, int width, int height) {
    return this.add(new Image(src, width, height));
  }

  /**
   * Creates and adds imgage (img) element.
   * @param src Html "src" attribute.
   * @param alt Html "alt" attribute.
   * @param width Html "width" attribute.
   * @param height Html "height" attribute.
   * @return Html element.
   */
  public final Image createImage(String src, String alt, int width, int height) {
    return this.add(new Image(src, alt, width, height));
  }

  /**
   * Creates and adds script element.
   * @return Html element.
   */
  public final Script createScript() {
    return this.add(new Script());
  }

  /**
   * Creates and adds script element.
   * @param script Script block
   * @return Html element.
   */
  public final Script createScript(String script) {
    return this.add(new Script(script));
  }

  /**
   * Creates and adds noscript element.
   * @return Html element.
   */
  public final NoScript createNoScript() {
    return this.add(new NoScript());
  }

  /**
   * Creates and adds figure element.
   * @return Html element.
   */
  public final Figure createFigure() {
    return this.add(new Figure());
  }

  /**
   * Creates and adds figure caption element.
   * @return Html element.
   */
  public final FigCaption createFigCaption() {
    return this.add(new FigCaption());
  }

  /**
   * Creates and adds video element.
   * @return Html element.
   */
  public final Video createVideo() {
    return this.add(new Video());
  }

  /**
   * Creates and adds audio element.
   * @return Html element.
   */
  public final Audio createAudio() {
    return this.add(new Audio());
  }

  /**
   * Creates and adds source element.
   * @return Html element.
   */
  public final Source createSource() {
    return this.add(new Source());
  }

}
