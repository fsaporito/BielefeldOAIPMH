rm -f OAI-PMH.xsd
wget http://www.openarchives.org/OAI/2.0/OAI-PMH.xsd


rm -f metadata.xsd
wget http://schema.datacite.org/meta/kernel-4.1/metadata.xsd
 
rm 
mkdir -p "include"
cd include
rm -f *.xsd

wget http://schema.datacite.org/meta/kernel-4.1/include/datacite-titleType-v4.xsd
wget http://schema.datacite.org/meta/kernel-4.1/include/datacite-contributorType-v4.xsd
wget http://schema.datacite.org/meta/kernel-4.1/include/datacite-dateType-v4.1.xsd
wget http://schema.datacite.org/meta/kernel-4.1/include/datacite-resourceType-v4.1.xsd
wget http://schema.datacite.org/meta/kernel-4.1/include/datacite-relationType-v4.1.xsd
wget http://schema.datacite.org/meta/kernel-4.1/include/datacite-relatedIdentifierType-v4.xsd
wget http://schema.datacite.org/meta/kernel-4.1/include/datacite-funderIdentifierType-v4.xsd
wget http://schema.datacite.org/meta/kernel-4.1/include/datacite-descriptionType-v4.xsd
wget http://schema.datacite.org/meta/kernel-4.1/include/datacite-nameType-v4.1.xsd
