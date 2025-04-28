/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logininter;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *gérer l'accès à ta base de données, uniquement pour tout ce qui concerne les Utilisateurs.
 * @author eriva
 */
public class UtilisateurDAO {

    private Accesbdd accesbdd;
    private Connection connection;

    public UtilisateurDAO(Connection connection) {
        this.connection = connection;

    }

    public ArrayList<Utilisateur> getusers() {
        ResultSet result = null;
        ArrayList<Utilisateur> lesUtilisateur = new ArrayList<Utilisateur>();
        try {
            String req = "select *"
                    + " from visiteur";
            Statement statement;

            statement = connection.createStatement();
            result = statement.executeQuery(req);
            while (result.next()) {
                Utilisateur cat = new Utilisateur(result.getString(0), result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7), result.getDate(8));
                lesUtilisateur.add(cat);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Accesbdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesUtilisateur;
    }

    // Méthode pour la barre de recherche (trouver par le nom)
    public ArrayList<Utilisateur> findByRecherche(String recherche) {
        ArrayList<Utilisateur> tab = new ArrayList();
        try {
            String sql = "SELECT * FROM visiteur WHERE nom LIKE '" + recherche + "%' OR id LIKE '" + recherche + "%'";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            String searchPattern = recherche + "%";
            pstmt.setString(1, searchPattern);
            pstmt.setString(2, searchPattern);
            pstmt.setString(3, searchPattern);
            pstmt.setString(4, searchPattern);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String login = rs.getString("login");
                String mdp = rs.getString("mdp");
                String adresse = rs.getString("adresse");
                String cp = rs.getString("cp");
                String ville = rs.getString("ville");
                Date dateEmbauche = rs.getDate("dateEmbauche");
                tab.add(new Utilisateur(id, nom, prenom, login, mdp, adresse, cp, ville, dateEmbauche));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return tab;
    }
}
