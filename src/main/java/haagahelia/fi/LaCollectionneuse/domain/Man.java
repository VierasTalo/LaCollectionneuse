package haagahelia.fi.LaCollectionneuse.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Man {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long mies_id;
	private String etunimi;
	private String silmat;
	private String ammatti;
	private String huomio;
	public Long getMies_id() {
		return mies_id;
	}
	public void setMies_id(Long mies_id) {
		this.mies_id = mies_id;
	}
	public String getEtunimi() {
		return etunimi;
	}
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	public String getSilmat() {
		return silmat;
	}
	public void setSilmat(String silmat) {
		this.silmat = silmat;
	}
	public String getAmmatti() {
		return ammatti;
	}
	public void setAmmatti(String ammatti) {
		this.ammatti = ammatti;
	}
	public String getHuomio() {
		return huomio;
	}
	public void setHuomio(String huomio) {
		this.huomio = huomio;
	}
	public Man(Long mies_id, String etunimi, String silmat, String ammatti, String huomio) {
		super();
		this.mies_id = mies_id;
		this.etunimi = etunimi;
		this.silmat = silmat;
		this.ammatti = ammatti;
		this.huomio = huomio;
	}
	public Man(String etunimi, String silmat, String ammatti, String huomio) {
		super();
		this.etunimi = etunimi;
		this.silmat = silmat;
		this.ammatti = ammatti;
		this.huomio = huomio;
	}
	public Man() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Man [mies_id=" + mies_id + ", etunimi=" + etunimi + ", silmat=" + silmat + ", ammatti=" + ammatti
				+ ", huomio=" + huomio + "]";
	}

		
}