package entities;

public class Etudiant {
    private int id;
    private String Matricule;
    private String nomCompletET;
    private String tuteur;
    private String classeFilt;
    public String getClasseFilt() {
        return classeFilt;
    }
    public void setClasseFilt(String classeFilt) {
        this.classeFilt = classeFilt;
    }
    Classe classe;

    public Etudiant() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMatricule() {
        return Matricule;
    }
    public void setMatricule(String matricule) {
        Matricule = matricule;
    }
    public String getNomCompletET() {
        return nomCompletET;
    }
    public void setNomCompletET(String nomCompletET) {
        this.nomCompletET = nomCompletET;
    }
    public String getTuteur() {
        return tuteur;
    }
    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }
    public Classe getClasse() {
        return classe;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public Object getLibelle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLibelle'");
    }
  
   

   
    
}
