package Logininter;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *class pour les Admin
 * @author eriva
 * 
 */
public class Admin {
    private String id;
    private String nom;
    private String prenom;
    private String login;
    private String mdp;
    private String adresse;
    private String cp;
    private String ville;
    private Date dateEmbauche;
/**
     * Constructeur permettant d'initialiser un administrateur avec ses informations.
     * 
     * @param id identifiant de l'administrateur
     * @param nom nom de l'administrateur
     * @param prenom prénom de l'administrateur
     * @param login identifiant de connexion
     * @param mdp mot de passe
     * @param adresse adresse postale
     * @param cp code postal
     * @param ville ville
     * @param dateEmbauche date d'embauche
     */
    public Admin(String id, String nom,String prenom, String login, String mdp, String adresse, String cp, String ville, Date dateEmbauche) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.mdp = mdp;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.dateEmbauche = dateEmbauche;
    }
    
    /**
     * get le id
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * * set le id
     * @param id the id to set
     */
    public void setId(String id) {
         this.id= id;
    }
    
    /**
     * obtenir la date embauche du adm
     * @return the idService
     */
    public Date getdateEmbauche() {
        return dateEmbauche;
    }

    /**
     * * set le date embauche
     * @param dateEmbauche the id to set
     */
    public void setdateEmbauche(Date dateEmbauche) {
         this.dateEmbauche= dateEmbauche;
    }

    /**
     * obtenir le nom
     * @return the Nom
     */
    public String getNom() {
        return this.nom;
    }
    
    /**
     * set le nom
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * obtenir le prenom
     * @return the Prénom
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * set le prenom
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * obtenir le login
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * set le login
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * obtenir l'adresse 
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * set l'adresse
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * obtenir le code Postal
     * @return the cp
     */
    public String getCp() {
        return cp;
    }

    /**
     * set le code Postal
     * @param cp the cp to set
     */
    public void setCp(String cp) {
        this.cp = cp;
    }
    
    /**
     * obtenir la ville du dm
     * @return the ville
     */
    public String getVille() {
        return this.ville;
    }
    
    /**
     * set la ville du user
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }
    /**
     * tableau des infos du user
     @return tab*/
    public Object[] toArray(){
        Object[] tab = new Object[]{this.id, this.nom, this.prenom, this.login, this.mdp, this.adresse, this.cp, this.ville, this.dateEmbauche};
        return tab;
    }
}
