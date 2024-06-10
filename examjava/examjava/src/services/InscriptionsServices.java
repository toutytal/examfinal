package services;

import java.util.List;
import entities.Inscription;
import repository.InscriptionRepository;

public class InscriptionsServices {
      private InscriptionRepository inscriptionRepository=new InscriptionRepository();
    
   public  List<Inscription>listerInscriptions(){
        return inscriptionRepository.selectAll();
    }

   public void ajouterInscription(Inscription inscription){
          inscriptionRepository.insert(inscription);
   }
   
}

