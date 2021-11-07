 
DROP TABLE IF EXISTS RecordsXAuthor;
CREATE TABLE RecordsXAuthor(
  id INT AUTO_INCREMENT PRIMARY KEY,
  authorName VARCHAR(250),
  recordNum INT NOT NULL
);


DROP TABLE IF EXISTS RecordsXORCIDAuthor;
CREATE TABLE RecordsXORCIDAuthor(
  id INT AUTO_INCREMENT PRIMARY KEY,
  authorORCID VARCHAR(250),
  recordNum INT NOT NULL
);



DROP TABLE IF EXISTS RecordsXPublicationYear;
CREATE TABLE RecordsXPublicationYear(
  id INT AUTO_INCREMENT PRIMARY KEY,
  publicationYear INT,
  recordNum INT NOT NULL
);



DROP TABLE IF EXISTS RecordsXTypology;
CREATE TABLE RecordsXTypology(
  id INT AUTO_INCREMENT PRIMARY KEY,
  typology VARCHAR(250),
  recordNum INT NOT NULL
);


DROP TABLE IF EXISTS RecordsJournalsXPublicationYear;
CREATE TABLE RecordsJournalsXPublicationYear(
  id INT AUTO_INCREMENT PRIMARY KEY,
  publicationYear INT,
  recordNum INT NOT NULL
);
