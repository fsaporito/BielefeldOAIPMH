package BiefeldOAIPMH.recordGetters;

public class Greetings {

	protected long id;
	protected String content;	
	
	public Greetings(long id, String content) 
	{
		this.id = id;
		this.content = content;
	}

	public long getId()
	{
		return this.id;
	}
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	public String getContent()
	{
		return this.content;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}

}
