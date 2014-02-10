package Amine;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="bateau")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bateau implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nom",length=40)
	@XmlElement(name="nom")
	private String nom;
	
	@XmlElementWrapper(name="equipage")
	private List <Marin> equipage = new ArrayList<Marin>() ; 

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;}
	public List<Marin> getEquipage() {
		return equipage;
	}
	@Override
	public String toString() {
		return "Bateau [id=" + id + ", nom=" + nom + ", equipage=" + equipage
				+ "]";
	}
	public void setEquipage(List<Marin> equipage) {
		this.equipage = equipage;
	}
	public void addMarin(Marin m) {
		// TODO Auto-generated method stub
		equipage.add(m);
	}
}

