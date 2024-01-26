/*
 * #%L
 * wcm.io
 * %%
 * Copyright (C) 2024 wcm.io
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

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jetbrains.annotations.NotNull;

final class TestUtil {

  private static final String TEST_STRING = "test";

  private TestUtil() {
    // static methods only
  }

  static <T extends HtmlElement> void assertDefaultMethodsSkipText(@NotNull T element) {
    element.setEmptyAttributeValueAsBoolean(TEST_STRING, true);
    assertEquals(TEST_STRING, element.getAttributeValue(TEST_STRING));

    element.setAttributeValueAsLong(TEST_STRING, 8L);
    assertEquals("8", element.getAttributeValue(TEST_STRING));

    element.setId(TEST_STRING);
    assertEquals(TEST_STRING, element.getId());

    element.setCssClass("class1");
    element.addCssClass("class2");
    assertEquals("class1 class2", element.getCssClass());

    element.setStyleString("style1:true;");
    element.setStyle("style2", "false");
    assertEquals("style1:true;style2:false;", element.getStyleString());

    element.setTitle(TEST_STRING);
    assertEquals(TEST_STRING, element.getTitle());

    element.setData(TEST_STRING, "1");
    assertEquals("1", element.getData(TEST_STRING));
  }

  static <T extends HtmlElement> void assertDefaultMethods(@NotNull T element) {
    assertDefaultMethodsSkipText(element);

    element.setText(TEST_STRING);
    assertEquals(TEST_STRING, element.getText());
  }

}
