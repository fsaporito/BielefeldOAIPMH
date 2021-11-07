package BielefeldOAIPMH.jpaEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecordsXPublicationYear {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	protected int publicationYear;
	
	protected int recordNum;
	
	public RecordsXPublicationYear() {
	}

	public RecordsXPublicationYear(int publicationYear, int recordNum) {
		super();
		this.publicationYear = publicationYear;
		this.recordNum = recordNum;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + publicationYear;
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
		RecordsXPublicationYear other = (RecordsXPublicationYear) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (publicationYear != other.publicationYear)
			return false;
		if (recordNum != other.recordNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RecordsXPublicationYear [id=" + id + ", publicationYear=" + publicationYear + ", recordNum=" + recordNum
				+ "]";
	}

	
	
	

}
