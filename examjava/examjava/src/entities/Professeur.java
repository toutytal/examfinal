package entities;

import java.util.ArrayList;
import java.util.List;

public class Professeur {
    private String NCI;
    private String nomComplet;
    private String grade;

    List<Classe>  classes =new ArrayList<>(); 
    

    public Professeur() {
    }
    public String getNCI() {
        return NCI;
    }
    public void setNCI(String nCI) {
        NCI = nCI;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
}
