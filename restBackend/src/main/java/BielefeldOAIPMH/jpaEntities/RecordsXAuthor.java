package BielefeldOAIPMH.jpaEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecordsXAuthor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	protected String authorName;
	
	protected int recordNum;
	
	public RecordsXAuthor() {
	}

	public RecordsXAuthor(String authorName, int recordNum) {
		super();
		this.authorName = authorName;
		this.recordNum = recordNum;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
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
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
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
		RecordsXAuthor other = (RecordsXAuthor) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
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
		return "RecordsXAuthor [id=" + id + ", authorName=" + authorName + ", recordNum=" + recordNum + "]";
	}
	
	

}
