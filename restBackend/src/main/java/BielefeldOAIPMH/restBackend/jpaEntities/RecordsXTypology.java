package BielefeldOAIPMH.restBackend.jpaEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecordsXTypology {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	protected String typology;
	
	protected int recordNum;
	
	public RecordsXTypology() {
		// TODO Auto-generated constructor stub
	}

	public RecordsXTypology(String typology, int recordNum) {
		super();
		this.typology = typology;
		this.recordNum = recordNum;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypology() {
		return typology;
	}

	public void setTypology(String typology) {
		this.typology = typology;
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
		result = prime * result + ((typology == null) ? 0 : typology.hashCode());
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
		RecordsXTypology other = (RecordsXTypology) obj;
		if (typology == null) {
			if (other.typology != null)
				return false;
		} else if (!typology.equals(other.typology))
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
		return "RecordsXTypology [id=" + id + ", typology=" + typology + ", recordNum=" + recordNum + "]";
	}
	
	

}
