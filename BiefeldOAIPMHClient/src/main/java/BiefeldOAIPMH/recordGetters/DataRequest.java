package BiefeldOAIPMH.recordGetters;

import java.util.HashMap;

public class DataRequest {

	protected long id;
	protected HashMap<String, String> data;
	
	public DataRequest(long id, HashMap<String, String> data) 
	{
		this.id = id;
		this.data = data;
	}
	
	public long getId()
	{
		return this.id;
	}
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	public HashMap<String, String> getData()
	{
		return this.data;
	}
	
	public void setData(HashMap<String, String> data)
	{
		this.data = data;
	}

}
