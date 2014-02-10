package org.amine.model;


import java.io.Serializable;

import javax.persistence.*;;

@Entity(name="marin")
@Table(name="marin")
public class Marin implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nom;
	private String prenom;
	private int salaire;

	public Marin() {
	}
	   
	public Marin(String nom, String prenom, int salaire) {
		this.nom = nom ;
		this.prenom = prenom ;
		this.salaire = salaire ;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	

}
