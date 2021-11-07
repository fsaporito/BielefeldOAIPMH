# BielefeldOAIPMH

This project connects to the institutional repository of the University of Bielefeld. This repository is accessed via the [OAI-PMH protocol][!https://www.openarchives.org/OAI/openarchivesprotocol.html] and contains the whole set of bibliographic records of the University of Bielefeld.

This projects contains the functionalities for doing the following analytics operation on this repository:

* Number of Records per Author
* Number of Records per Author with ORCID
* Number of Records per Publication Year
* Number of Records per Typology
------------

Installation
------------

# Xml Parser
The Rest Controller depends on the XML parser library that implements classes for downloading and parsing the OAI-PMH data.
To build and install this library, run the following commands from terminal starting from the root directory of the project
    cd OAIPMHXmlParser
    mvn package
    mvn install

## Rest Controller
The backend can be communicated with using the given rest interface.
To start the backend server, run the following commands from terminal starting from the root directory of the project
    cd restBackend
    ./mvnw spring-boot:run


Interacting with the backend
------------
The rest backend offers the following APIs
+ **Greetings**: http://localhost:8080/greetings
* **Number of Records per Author**: http://localhost:8080/numberOfRecordsPerAuthor
* **Number of Records per ORCID Author**: http://localhost:8080/numberOfRecordsPerOrcidAuthor
* **NUmber of Records per Publication Year** http://localhost:8080/numberOfRecordsPerPublicationYear
* **Number of Records per Typology**: http://localhost:8080/numberOfRecordsPerTypology
* **Number of Records of Type Journal since** *startYear* **divided in range of** *yearRange* **years**: http://localhost:8080/numberOfJournalRecordsSinceYearGrouperByYear?startYear=1985&yearRange=5

Furthermore, to see directly the background H2 DB, there is a specific rest API at the following location

http://localhost:8080/h2

This has to be accessed by using the userID and Password specified in the *application.properties* file of the rest backend project.

## Console Client




## Update XML Schema
The XML parsing is done by automatically generating the necessary classes via xjc, using the [OAIPMH's xsd file][!https://www.openarchives.org/OAI/openarchivesprotocol.html#OAIPMHschema].
To Automatically regenerate the classes, for example in the case of an update of the xsd, a simple script using linux bash language is present in the OAI-PMHSchema folder.
The xjc program has to be present in the path to use this script.
For example on Ubuntu it can be installed by using the following command

sudo apt-get install jaxb