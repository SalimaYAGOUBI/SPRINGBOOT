package com.UIR.SiteEcomerce.Membre;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Membre {

	//les attributs
	@Id
	private int id;
	private String nom;
	private String prenom;
	private String login;
	private String pwd;
	private String civilite;
	private String tel;
	private String image;
	
	public Membre()
	{}
	   
	//constructeur
	public Membre(String nom, String prenom, String login, String pwd, String civilite, String tel, String image) {
		super();
		this.nom= nom;
        this.prenom = prenom;
        this.login = login;
        this.pwd = pwd;
        this.civilite = civilite;
        this.tel = tel;
        this.image = image; 
    }
	

	public Membre(String login, String pwd) {
		super();
		this.login = login;
		this.pwd = pwd;
	}


	//getters et setters
	public int getId() {return id;}
	public void setId(int id) {	this.id = id;}
	public String getNom() {return nom;	}
	public void setNom(String nom) {this.nom = nom;}
	public String getPrenom() {return prenom;}
	public void setPrenom(String prenom) {this.prenom = prenom;}
	public String getLogin() {return login;}
	public void setLogin(String login) {this.login = login;}
	public String getPwd() {return pwd;}
	public void setPwd(String pwd) {this.pwd = pwd;}
	public String getCivilite() {return civilite;}
	public void setCivilite(String civilite) {this.civilite = civilite;}
	public String getTel() {return tel;}
	public void setTel(String tel) {this.tel = tel;}
	public String getImage() {return image;}
	public void setImage(String image) {this.image = image;}

}
