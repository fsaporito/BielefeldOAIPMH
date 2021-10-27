package BielefeldOAIPMH.restBackend.greetings;

public class Greetings {

	private long id;
	private final String content = "Hi, \n"
			+ "I am the Biefield REST API \n"
			+ "My task is doing analytics over the bibliographic resources of Biefeld University via OAIPMH";
	
	public Greetings(long id) 
	{
		this.id = id;
	}

	public long getId()
	{
		return this.id;
	}
	
	public String getContent()
	{
		return this.content;
	}
}
