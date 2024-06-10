package services;


import entities.Etudiant;
import repository.EtudiantRepository;

import java.util.ArrayList;
import java.util.List;




public class EtudiantServices {
  private EtudiantRepository etudiantRepository=new EtudiantRepository();
  public void ajouterEtudiant(Etudiant etudiant){
        etudiantRepository.insert(etudiant);
    }
    public  List<Etudiant>listerEtudiant(){
    
        return etudiantRepository.selectAll();
    }
   public List<Etudiant> listerEtudiantsParClasse(String libelleClasse) {
        List<Etudiant> etudiants = new ArrayList<>();
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getLibelle().equals(libelleClasse)) {
                etudiants.add(etudiant);
            }
        }
        return etudiants;
    }
}
