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
package io.wcm.handler.commons.editcontext;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.StringWriter;
import java.util.Map;
import java.util.TreeMap;

import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.io.JSONWriter;
import org.junit.jupiter.api.Test;

import com.day.cq.wcm.api.components.DropTarget;

@SuppressWarnings("deprecation")
class DropTargetImplTest {

  @Test
  void testDefaultProperties() {
    DropTargetImpl underTest = new DropTargetImpl("testName", "prop1");
    assertEquals("testName", underTest.getName());
    assertEquals(DropTarget.CSS_CLASS_PREFIX + "testName", underTest.getId());
    assertEquals("prop1", underTest.getPropertyName());
    assertArrayEquals(new String[0], underTest.getGroups());
    assertArrayEquals(new String[] {
        "*"
    }, underTest.getAccept());
    assertTrue(underTest.getParameters().isEmpty());
  }

  @Test
  void testProperties() throws JSONException {
    String[] groups = new String[] {
        "group1",
        "group2"
    };
    String[] accept = new String[] {
        "image/gif"
    };
    Map<String, String> params = new TreeMap<>(Map.of("param1", "value1", "param2", "value2"));

    DropTargetImpl underTest = new DropTargetImpl("testName", "prop1");
    underTest.setGroups(groups);
    underTest.setAccept(accept);
    underTest.setParameters(params);

    assertArrayEquals(groups, underTest.getGroups());
    assertArrayEquals(accept, underTest.getAccept());
    assertEquals(params, underTest.getParameters());

    StringWriter writer = new StringWriter();
    JSONWriter jsonWriter = new JSONWriter(writer);
    underTest.write(jsonWriter);
    assertEquals(
        "{\"id\":\"testName\","
            + "\"name\":\"prop1\","
            + "\"accept\":[\"image/gif\"],"
            + "\"groups\":[\"group1\",\"group2\"],"
            + "\"params\":{\"param1\":\"value1\",\"param2\":\"value2\"}}",
            writer.toString());
  }

}
