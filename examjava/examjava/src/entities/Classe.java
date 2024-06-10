package entities;

import java.util.ArrayList;
import java.util.List;

public class Classe {
    private String libelle;
    private String niveau;
    private String filiere;
    private String professeur;

    
    public String getProfesseur() {
        return professeur;
    }
    public void setProfesseur(String professeur) {
        this.professeur = professeur;
    }
    public Classe() {
    }
    List<Etudiant>  etudiants =new ArrayList<>(); 
    List<Professeur>  professeurs =new ArrayList<>(); 

    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getNiveau() {
        return niveau;
    }
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    public String getFiliere() {
        return filiere;
    }
    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
    
    

}
