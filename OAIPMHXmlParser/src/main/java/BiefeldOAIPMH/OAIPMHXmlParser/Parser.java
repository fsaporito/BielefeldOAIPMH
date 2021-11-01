package BiefeldOAIPMH.OAIPMHXmlParser;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.openarchives.oai._2.OAIPMHtype;

public class Parser {

	public Parser() 
	{}
	
	protected static Unmarshaller buildOAIPMUnmarshaller() throws JAXBException
	{
		JAXBContext jaxbContext = JAXBContext.newInstance(OAIPMHtype.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return jaxbUnmarshaller;
	}
	
	public static OAIPMHtype parseFromFile(String xmlFilePath) 
			throws JAXBException
	{
		File file = new File(xmlFilePath);
		Unmarshaller jaxbUnmarshaller = buildOAIPMUnmarshaller();
		OAIPMHtype element = (OAIPMHtype) jaxbUnmarshaller.unmarshal(file);
		return element;
	}
	
	public static OAIPMHtype parseFromUrl(String urlStr) 
			throws JAXBException, MalformedURLException
	{
		URL url = new URL(urlStr);
		Unmarshaller jaxbUnmarshaller = buildOAIPMUnmarshaller();
		var urlUnmarshalled = jaxbUnmarshaller.unmarshal(url);
		@SuppressWarnings("unchecked")
		JAXBElement<OAIPMHtype> element = (JAXBElement<OAIPMHtype>) urlUnmarshalled;
		return element.getValue();
	}

}
