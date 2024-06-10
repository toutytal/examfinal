package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Classe;

public class ClasseRepository {
   
    public void insert(Classe classe){
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

    public List<Classe> selectAll(){
        List<Classe> classes = new ArrayList<>();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_exam" 
                     , "root", "root");
             Statement statement = conn.createStatement();
             String sql = "SELECT * FROM Classes";
             ResultSet rs = statement.executeQuery(sql);
             while (rs.next()) {
                 Classe classe = new Classe();
                 classe.setLibelle(rs.getString("libelle"));
                 classe.setNiveau(rs.getString("niveau"));
                 classe.setFiliere(rs.getString("filiere"));
                 classes.add(classe);
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
       return classes;
    }
}
