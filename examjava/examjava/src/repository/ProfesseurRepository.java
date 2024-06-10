package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Professeur;

public class ProfesseurRepository {
    public void insert(Professeur professeur){
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

    public List<Professeur> selectAll(){
        List<Professeur> professeurs = new ArrayList<>();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_exam" 
                     , "root", "root");
             Statement statement = conn.createStatement();
             String sql = "SELECT * FROM Professeurs";
             ResultSet rs = statement.executeQuery(sql);
             while (rs.next()) {
                 Professeur professeur = new Professeur();
                 professeur.setNCI(rs.getString("nci"));
                 professeur.setNomComplet(rs.getString("nom complet"));
                 professeur.setGrade(rs.getString("grade"));
                 professeurs.add(professeur);
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
       return professeurs;
    }
}
