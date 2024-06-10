package services;

import java.util.ArrayList;
import java.util.List;

import entities.Classe;
import repository.ClasseRepository;

public class ClasseServices {
    ClasseRepository classeRepository=new ClasseRepository();
   
   public  List<Classe>listerClasse(){
    
        return classeRepository.selectAll();
    }
     public  List<Classe>listerClasses(){
        return classeRepository.selectAll();
    }
    public void ajouterClasse(Classe classe){
        classeRepository.insert(classe);
    }
 public List<Classe> listerClasseParProfesseur(String professeur) {
        List<Classe> classesParProfesseur = new ArrayList<>();
        for (Classe classe : classesParProfesseur) {
            if (classe.getProfesseur() != null && classe.getProfesseur().equalsIgnoreCase(professeur)) {
                classesParProfesseur.add(classe);
            }
        }
        return classesParProfesseur;
    }
}

