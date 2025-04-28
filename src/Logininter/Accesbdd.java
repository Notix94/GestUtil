/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logininter;

import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Classe pour accéder a la Bdd
 * @author eriva
 */
public class Accesbdd {

    private final String dbURL = "jdbc:mysql://localhost:3306/gsb";
    private final String username = "root";
    private final String password = "";
    private Connection connexion;
/**
 * Initialise une connexion à la base de données à l'aide des informations de connexion.
 * 
 * Établit la connexion lors de la création de l'objet Accesbdd.
 * 
 * Si la connexion échoue, une exception SQL est capturée et enregistrée dans les logs.
 */
    public Accesbdd() {
        try {
            this.connexion = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(Accesbdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/**
 * Retourne l'objet de connexion à la base de données.
 * @return connexion
 */
    public Connection getconnexion() {
        return this.connexion;
    }

  
/**
 * donne tout les visiteurs de la bdd
 *
 * @return a ResultSet containing all users, or null if an error occurs
 * @throws SQLException si la bdd n'es pas trouver
 */ 
    public ResultSet getusers() throws SQLException {
        try {

            String req = "select *"
                    + " from visiteur";
            Statement statement;
            statement = connexion.createStatement();
            ResultSet result = statement.executeQuery(req);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(Accesbdd.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }
}
