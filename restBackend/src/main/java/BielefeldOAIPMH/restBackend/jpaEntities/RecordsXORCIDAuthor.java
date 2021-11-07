package BielefeldOAIPMH.restBackend.jpaEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecordsXORCIDAuthor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	protected String authorORCID;
	
	protected int recordNum;

	public RecordsXORCIDAuthor() {
	}

	public RecordsXORCIDAuthor(String authorORCID, int recordNum) {
		super();
		this.authorORCID = authorORCID;
		this.recordNum = recordNum;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorORCID() {
		return authorORCID;
	}

	public void setAuthorORCID(String authorORCID) {
		this.authorORCID = authorORCID;
	}

	public int getRecordNum() {
		return recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorORCID == null) ? 0 : authorORCID.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + recordNum;
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
		RecordsXORCIDAuthor other = (RecordsXORCIDAuthor) obj;
		if (authorORCID == null) {
			if (other.authorORCID != null)
				return false;
		} else if (!authorORCID.equals(other.authorORCID))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (recordNum != other.recordNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RecordsXORCIDAuthor [id=" + id + ", authorORCID=" + authorORCID + ", recordNum=" + recordNum + "]";
	}
	
	

}
