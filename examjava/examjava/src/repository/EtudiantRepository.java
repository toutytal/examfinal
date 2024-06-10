package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Etudiant;

   

public class EtudiantRepository {
  
    public void insert(Etudiant etudiant){
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_exam" 
                     , "root", "root");
             Statement statement = conn.createStatement();
             
             statement.close();
             conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur de chargement de Driver");
        }
       catch (SQLException e) {
           System.out.println("Erreur de Connexion a la BD");
       }
    }

    public List<Etudiant> selectAll(){
        List<Etudiant> etudiants = new ArrayList<>();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_exam" 
                     , "root", "root");
             Statement statement = conn.createStatement();
             String sql = "SELECT * FROM Étudiants";
             ResultSet rs = statement.executeQuery(sql);
             while (rs.next()) {
                 Etudiant etudiant = new Etudiant();
                 etudiant.setId(rs.getInt("etudiant_id"));
                 etudiant.setMatricule(rs.getString("matricule"));
                 etudiant.setNomCompletET(rs.getString("nom_complet"));
                 etudiant.setTuteur(rs.getString("tuteur"));
                 etudiants.add(etudiant);
             }
             statement.close();
             rs.close();
             conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur de chargement de Driver");
        }
       catch (SQLException e) {
           System.out.println("Erreur de Connexion a la BD");
       }
       return etudiants;
    }
}
