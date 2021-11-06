package BielefeldOAIPMH.records;

public class Author {
	
	protected String authorGivenName;
	protected String authorFamilyName;
	protected String ORCID;

	public Author() 
	{}
	
	public Author(String authorGivenName, String authorFamilyName) 
	{
		this(authorGivenName, authorFamilyName, null);		
	}
	
	public Author(String authorGivenName, String authorFamilyName, String ORCID) {
		setAuthorGivenName(authorGivenName);
		setAuthorFamilyName(authorFamilyName);
		setORCID(ORCID);
	}

	public String getAuthorGivenName() {
		return authorGivenName;
	}

	public void setAuthorGivenName(String authorGivenName) {
		if (authorGivenName == null)
			throw new IllegalArgumentException("Author Given Name cannot be null");
		this.authorGivenName = authorGivenName;
	}

	public String getAuthorFamilyName() {
		return authorFamilyName;
	}

	public void setAuthorFamilyName(String authorFamilyName) {
		if (authorFamilyName == null)
			throw new IllegalArgumentException("Author Family Name cannot be null");
		this.authorFamilyName = authorFamilyName;
	}

	public String getORCID() {
		return ORCID;
	}

	public void setORCID(String oRCID) {
		ORCID = oRCID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ORCID == null) ? 0 : ORCID.hashCode());
		result = prime * result + ((authorFamilyName == null) ? 0 : authorFamilyName.hashCode());
		result = prime * result + ((authorGivenName == null) ? 0 : authorGivenName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (ORCID == null) {
			if (other.ORCID != null)
				return false;
		} else if (!ORCID.equals(other.ORCID))
			return false;
		if (authorFamilyName == null) {
			if (other.authorFamilyName != null)
				return false;
		} else if (!authorFamilyName.equals(other.authorFamilyName))
			return false;
		if (authorGivenName == null) {
			if (other.authorGivenName != null)
				return false;
		} else if (!authorGivenName.equals(other.authorGivenName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Author [authorGivenName=" + authorGivenName + ", authorFamilyName=" + authorFamilyName + ", ORCID="
				+ ORCID + "]";
	}
	
	

}
