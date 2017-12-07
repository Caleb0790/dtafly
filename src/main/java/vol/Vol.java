package vol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import reservation.Reservation;

@Entity
public class Vol {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	@Length(min=4,max=4)
	@NotNull
	private String numVol;
	
	@Column
	@NotNull
	@Enumerated(EnumType.STRING)
	private TypeAvion typeAvion;
	
	@Column
	@NotNull
	private Integer nbPlace;
	
	@Column
	@NotNull
	private String villeDep;
	
	@Column
	@NotNull
	private String villeArr;
	

	@Column
	@NotNull
	private LocalDate dateDep;
	
	@OneToMany(mappedBy = "vol")
	private List<Reservation> reservations=new ArrayList<Reservation>();

	@Override
	public String toString() {
		return "Vol [numVol=" + numVol + ", typeAvion=" + typeAvion + ", nbPlace=" + nbPlace + ", villeDep=" + villeDep
				+ ", villeArr=" + villeArr + ", dateDep=" + dateDep + ", reservations=" + reservations + "]";
	}

	public Vol(String numVol, TypeAvion typeAvion, Integer nbPlace, String villeDep, String villeArr, LocalDate dateDep) {
		super();
		this.numVol = numVol;
		this.typeAvion = typeAvion;
		this.nbPlace = nbPlace;
		this.villeDep = villeDep;
		this.villeArr = villeArr;
		this.dateDep = dateDep;
	}
	
	public Vol() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumVol() {
		return numVol;
	}

	public TypeAvion getTypeAvion() {
		return typeAvion;
	}

	public void setTypeAvion(TypeAvion typeAvion) {
		this.typeAvion = typeAvion;
	}

	
	
	public Integer getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(Integer nb_place) {
		this.nbPlace = nb_place;
	}

	public String getVilleDep() {
		return villeDep;
	}

	public void setVilleDep(String ville_dep) {
		this.villeDep = ville_dep;
	}

	public String getVilleArr() {
		return villeArr;
	}

	public void setVilleArr(String ville_arr) {
		this.villeArr = ville_arr;
	}

	public LocalDate getDateDep() {
		return dateDep;
	}

	public void setDateDep(LocalDate dateDep) {
		this.dateDep = dateDep;
	}

	public List<Reservation> getResList() {
		return reservations;
	}

	public void setResList(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public void setNumVol(String numVol) {
		this.numVol = numVol;
	}

	
}
