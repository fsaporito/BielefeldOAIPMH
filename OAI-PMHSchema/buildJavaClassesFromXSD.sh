mkdir -p ../OAIPMHXmlParser/src/main/java
rm -rf ../OAIPMHXmlParser/src/main/java/*

xjc -d "../OAIPMHXmlParser/src/main/java/" OAI-PMH.xsd
xjc -d "../OAIPMHXmlParser/src/main/java/" metadata.xsd
