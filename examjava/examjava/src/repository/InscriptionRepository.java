package repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Inscription;

public class InscriptionRepository {
    public void insert(Inscription inscription){
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

    public List<Inscription> selectAll(){
        List<Inscription> inscriptions = new ArrayList<>();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_exam" 
                     , "root", "root");
             Statement statement = conn.createStatement();
             String sql = "SELECT * FROM Inscriptions";
             ResultSet rs = statement.executeQuery(sql);
             while (rs.next()) {
                 Inscription inscription = new Inscription();
                 inscription.setId(rs.getInt("id"));
                 inscription.setAnnee(rs.getInt("annee"));
                inscription.setEtudiants(rs.getString("etudiant"));
                inscription.setMontant(rs.getDouble("montant"));
                inscription.setClasse(rs.getString("classe"));
                 inscription.setDateInscription(rs.getDate("date_inscription"));
                 inscriptions.add(inscription);
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
       return inscriptions;
    }
}
