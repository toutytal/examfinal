package services;

import java.util.List;

import repository.ProfesseurRepository;
import entities.Professeur;


public class ProfesseurServices {
     private ProfesseurRepository professeurRepository=new ProfesseurRepository();
    
   public  List<Professeur>listerProfesseur(){
        return professeurRepository.selectAll();
    }

   public void ajouterProfesseur(Professeur professeur){
    professeurRepository.insert(professeur);
   }
  
}
