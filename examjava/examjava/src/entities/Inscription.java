package entities;

import java.sql.Date;

public class Inscription {
    private int id;
    private String etudiants;
    private String classe ;
    private Date dateInscription;
    private Double montant;
    private int annee;
     Etudiant etudiant;


    public Inscription() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public Date getDateInscription() {
        return dateInscription;
    }
    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }
    public Double getMontant() {
        return montant;
    }
    public void setMontant(Double montant) {
        this.montant = montant;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public String getEtudiants() {
        return etudiants;
    }
    public void setEtudiants(String etudiants) {
        this.etudiants = etudiants;
    }

   
    
}
