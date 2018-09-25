Purpose

Show usage of Proto buffer {@link - Refer Google ProtoBuf} - This is language agnostic serialization tool

Technical Reason - {@link https://github.com/eishay/jvm-serializers/wiki}

How this can help eliminate lot of Boiler plate overhead from GETTER SETTER.

Protocol buffers have many advantages over JSON or XML for serializing structured data.

- About 9% smaller than JSON. 
- Easy to use and can define complex logic. 
- About 5 times faster. Clearer structural definition. 
- Generated data is easier to use programmatically. 
- Highly scalable even with massive data.

Steps as followed

- Step 1: Created Spring boot starter project 
- Step 2: Generated Json random object. https://next.json-generator.com/EkSxfRzKr
- Template file names as template.json is stored in resources. 
- Step 3: Convert the Json generated (file.json with 100 different request) to ProtoBuf file. 
- https://www.site24x7.com/tools/json-to-protobuf.html
- Install protoc on local system using brew install protoc
- protoc --java_out=../model profile.proto
