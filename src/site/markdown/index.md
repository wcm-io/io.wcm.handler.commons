## About Handler Commons

Functionality shared by the handler implementations.

[![Maven Central](https://img.shields.io/maven-central/v/io.wcm/io.wcm.handler.commons)](https://repo1.maven.org/maven2/io/wcm/io.wcm.handler.commons/)


### Documentation

* [API documentation][apidocs]
* [Changelog][changelog]


### AEM Version Support Matrix

|Handler Commons version |AEM version supported
|------------------------|----------------------
|2.0.x or higher         |AEM 6.5.17+, AEMaaCS
|1.5.x or higher         |AEM 6.5.7+, AEMaaCS
|1.4.x                   |AEM 6.4.5+, AEMaaCS
|1.1.x - 1.3.x           |AEM 6.2+
|1.0.x                   |AEM 6.1+
|0.x                     |AEM 6.0+


### Dependencies

To use this module you have to deploy also:

|---|---|---|
| [wcm.io Sling Commons](https://repo1.maven.org/maven2/io/wcm/io.wcm.sling.commons/) | [![Maven Central](https://img.shields.io/maven-central/v/io.wcm/io.wcm.sling.commons)](https://repo1.maven.org/maven2/io/wcm/io.wcm.sling.commons/) |
| [wcm.io AEM Sling Models Extensions](https://repo1.maven.org/maven2/io/wcm/io.wcm.sling.models/) | [![Maven Central](https://img.shields.io/maven-central/v/io.wcm/io.wcm.sling.models)](https://repo1.maven.org/maven2/io/wcm/io.wcm.sling.models/) |
| [wcm.io WCM Commons](https://repo1.maven.org/maven2/io/wcm/io.wcm.wcm.commons/) | [![Maven Central](https://img.shields.io/maven-central/v/io.wcm/io.wcm.wcm.commons)](https://repo1.maven.org/maven2/io/wcm/io.wcm.wcm.commons/) |
| [wcm.io WCM Granite UI Extensions](https://repo1.maven.org/maven2/io/wcm/io.wcm.wcm.ui.granite/) | [![Maven Central](https://img.shields.io/maven-central/v/io.wcm/io.wcm.wcm.ui.granite)](https://repo1.maven.org/maven2/io/wcm/io.wcm.wcm.ui.granite/) |


### Usage of deprecated APIs

This module uses the API `org.apache.sling.commons.json` which is marked as deprecated in AEM. However, it's also baked into the AEM product API itself ([DropTarget](https://developer.adobe.com/experience-manager/reference-materials/cloud-service/javadoc/com/day/cq/wcm/api/components/DropTarget.html) extends [JSONItem](https://developer.adobe.com/experience-manager/reference-materials/cloud-service/javadoc/com/day/cq/commons/JSONItem.html) which references [JSONWriter](https://developer.adobe.com/experience-manager/reference-materials/cloud-service/javadoc/org/apache/sling/commons/json/io/JSONWriter.html)). So this is unavoidable, unless Adobe changes the AEM product API.


### GitHub Repository

Sources: https://github.com/wcm-io/io.wcm.handler.commons


[apidocs]: apidocs/
[changelog]: changes.html
