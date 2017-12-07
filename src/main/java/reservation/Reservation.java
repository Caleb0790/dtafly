package reservation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import vol.Vol;

@Entity
public class Reservation {

	@Id
	@GeneratedValue
	private Integer id;
	
	@NotNull
	private String numRes;
	
	@NotNull
	private String nom;
	
	@NotNull
	private String prenom;
	
	@NotNull
	private Integer age;
	
	@ManyToOne
	@NotNull
	private Vol vol;
	
	public Reservation(String numRes, String nom, String prenom, Integer age, Vol vol) {
		super();
		this.numRes = numRes;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.vol = vol;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumRes() {
		return numRes;
	}

	public void setNumRes(String numRes) {
		this.numRes = numRes;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
