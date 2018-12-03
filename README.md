# JsonToJava Library

Library to generate Java POJO from JSON files or JSON string.

## Getting Started
Add library as a dependency to your project to get started.

### Prerequisites

  - Java 1.8 or higher

### Installing

Simply build project and add jar to classpath or configure with a dependency management tool.

Example with maven:

    <dependencies>
       <dependency>
            <groupId>com.edds.opensource</groupId>
            <artifactId>jsontojava</artifactId>
            <version>1.0-SNAPSHOT</version>
       </dependency>
    </dependencies>


## Usage

```
String simpleJson = "{\"prop1\": \"value\"}";
JsonToJava jsonToJava = new JsonToJava();
jsonToJava.jsonToJava(simpleJson, "MyJsonToJavaObject", "org.example.jsontojava", "jsontojava/output");

// MyJsonToJavaObject.java will be generated in jsontojava/output.
```

Only .json and .txt files supported
```
String pathToJsonFile = "input/MyJsonToJavaObject.json";
JsonToJava jsonToJava = new JsonToJava();
List<JsonClassResult> jsonResult = jsonToJava.jsonToJava(pathToJsonFile, "MyJsonToJavaObject", "org.example.jsontojava");

//Do something with generated list of classes created.
//Class JsonClassResult holds 2 String properties: The object name and the generated class in a string.
```

## Usage example:
 
 * [JsonToPojoGenerator](https://github.com/Sharelison/JsonToPojoGenerator)

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Sharelison** - [Sharelison](https://github.com/Sharelison)
