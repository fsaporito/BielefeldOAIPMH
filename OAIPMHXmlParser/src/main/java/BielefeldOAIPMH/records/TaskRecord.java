package BielefeldOAIPMH.records;

import java.util.ArrayList;

public class TaskRecord {

	protected String recordID;
	protected String recordTypology;
	protected int publicationYear;
	protected ArrayList<Author> authors;
	
	public TaskRecord() {
	}
	public TaskRecord(String recordID, String recordTypology, int publicationYear, ArrayList<Author> authors) 
	{
		setRecordID(recordID);
		setRecordTypology(recordTypology);
		setPublicationYear(publicationYear);
		setAuthors(authors);
	}


	public String getRecordID() {
		return recordID;
	}

	public void setRecordID(String recordID) {
		if (recordID == null)
			throw new NullPointerException("Record ID cannot be null");
		if (recordID.isEmpty())
			throw new IllegalArgumentException("Record ID cannot be empty");
		this.recordID = recordID;
	}

	public String getRecordTypology() {
		return recordTypology;
	}

	public void setRecordTypology(String recordTypology) {
		if (recordTypology == null)
			throw new IllegalArgumentException("Record Typology cannot be null");
		if (recordTypology.isEmpty())
			throw new IllegalArgumentException("Record Typology cannot be empty");
		this.recordTypology = recordTypology;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		if (publicationYear < 0)
			throw new IllegalArgumentException("Publication Year cannot be negative");
		if (publicationYear == 0)
			throw new IllegalArgumentException("Publication Year cannot be zero");
		this.publicationYear = publicationYear;
	}

	public ArrayList<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<Author> authors) {
		if (authors == null)
			throw new IllegalArgumentException("Authors list cannot be null");
		this.authors = authors;
	}
	
	
	@Override
	public String toString() {
		return "Record [recordID=" + recordID + ", recordTypology=" + recordTypology + ", publicationYear="
				+ publicationYear + ", authors=" + authors.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + publicationYear;
		result = prime * result + ((recordID == null) ? 0 : recordID.hashCode());
		result = prime * result + ((recordTypology == null) ? 0 : recordTypology.hashCode());
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
		TaskRecord other = (TaskRecord) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (publicationYear != other.publicationYear)
			return false;
		if (recordID == null) {
			if (other.recordID != null)
				return false;
		} else if (!recordID.equals(other.recordID))
			return false;
		if (recordTypology == null) {
			if (other.recordTypology != null)
				return false;
		} else if (!recordTypology.equals(other.recordTypology))
			return false;
		return true;
	}

}
