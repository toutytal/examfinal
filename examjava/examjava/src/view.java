
import java.util.List;
import java.util.Scanner;
import entities.Etudiant;
//import entities.Inscription;
import entities.Classe;
import entities.Professeur;
import services.EtudiantServices;
import services.ProfesseurServices;
import services.ClasseServices;
//import services.InscriptionsServices;


public class view {
    public static void main(String[] args) throws Exception {
        int choix;
        try (Scanner sc = new Scanner(System.in)) {
            //Dependances
      ClasseServices classeService=new ClasseServices();
      EtudiantServices etudiantService=new EtudiantServices();
      ProfesseurServices professeurService=new ProfesseurServices();
      do {
                System.out.println("1-Ajouter une classe ");
                System.out.println("2-Lister les classes"); 
                System.out.println("3-Ajouter un  professeur");
                System.out.println("4-Lister les professeurs");
                System.out.println("5-Affecter une classe à un profsseur"); 
                System.out.println("6-filtrer les classes Par professeur "); 
                System.out.println("7-Ajouter un etudiant"); 
                System.out.println("8-Lister les etudiants"); 
                System.out.println("9-filtrer les etudiants par classe"); 
                System.out.println("10-Quitter"); 
                System.out.print("Choisissez une option dans le menu : ");
                 choix=sc.nextInt();
                 sc.nextLine();
                switch (choix) {
                    case 1:
                    System.out.println("Entrer un Libelle:");
                    String libelle = sc.nextLine();
                    System.out.println("Enter le Niveau:");
                    String niveau = sc.nextLine();
                    System.out.println("Entrer la Filiere:");
                    String filiere = sc.nextLine();

                    Classe classe = new Classe();
                    classe.setLibelle(libelle);
                    classe.setNiveau(niveau);
                    classe.setFiliere(filiere);

                    classeService.ajouterClasse(classe);
                    break;

                case 2:
                    List<Classe> classes = classeService.listerClasses();
                    for (Classe c : classes) {
                        System.out.println("Libelle: " + c.getLibelle());
                        System.out.println("Niveau: " + c.getNiveau());
                        System.out.println("Filiere: " + c.getFiliere());
                        System.out.println("=================================");
                    }
                    break;
                case 3:
                    System.out.println("Entrer le NCI:");
                    String nci = sc.nextLine();
                    System.out.println("Entrer le Nom Complet:");
                    String nomComplet = sc.nextLine();
                    System.out.println("Entrer le Grade:");
                    String grade = sc.nextLine();

                    Professeur professeur = new Professeur();
                    professeur.setNCI(nci);
                    professeur.setNomComplet(nomComplet);
                    professeur.setGrade(grade);

                    professeurService.ajouterProfesseur(professeur);
                    break;

                case 4:
                    List<Professeur> professeurs = professeurService.listerProfesseur();
                    for (Professeur p : professeurs) {
                        System.out.println("NCI: " + p.getNCI());
                        System.out.println("Nom Complet: " + p.getNomComplet());
                        System.out.println("Grade: " + p.getGrade());
                        System.out.println("=================================");
                    }
                    break;
                    case 5:

                    break;
                    case 6:
                    System.out.println("Entrez le Professeur :");
                    String nomProfesseur = sc.nextLine();
                    List<Classe> classesFiltrees = classeService.listerClasseParProfesseur(nomProfesseur);
                    for (Classe c : classesFiltrees) {
                        System.out.println("Libellé : " + c.getLibelle());
                        System.out.println("Niveau : " + c.getNiveau());
                        System.out.println("Filière : " + c.getFiliere());
                        System.out.println("=================================");
                    }
                    break;
                    case 7:
                        System.out.println("Entrer un  Matricule:");
                        String Matricule = sc.nextLine();
                        System.out.println("Entrer le Nom Complet:");
                        String nomCompletET = sc.nextLine();
                        System.out.println("Entrer le Nom du Tuteur:");
                        String nomTuteur = sc.nextLine();

                        Etudiant etudiant = new Etudiant();
                        etudiant.setMatricule(Matricule);
                        etudiant.setNomCompletET(nomCompletET);
                        etudiant.setTuteur(nomTuteur);

                        etudiantService.ajouterEtudiant(etudiant);
                    break;
                    case 8:
                        List<Etudiant> etudiants = etudiantService.listerEtudiant();
                        for (Etudiant e : etudiants) {
                            System.out.println("ID Matricule: " + e.getMatricule());
                            System.out.println("Nom Complet: " + e.getNomCompletET());
                            System.out.println("Nom du Tuteur: " + e.getTuteur());
                            System.out.println("=================================");
                        }
                    break;
                    case 9:
                    System.out.println("Entrez le Libellé de la Classe :");
                    String libelleClasse = sc.nextLine();
                    List<Etudiant> etudiantsFiltres = etudiantService.listerEtudiantsParClasse(libelleClasse);
                    for (Etudiant e : etudiantsFiltres) {
                        System.out.println("Matricule : " + e.getMatricule());
                        System.out.println("Nom Complet : " + e.getNomCompletET());
                        System.out.println("Nom du Tuteur : " + e.getTuteur());
                        System.out.println("=================================");
                    }
                       
                    break;
              
                }

}while (choix!=10);
        }
}
}



