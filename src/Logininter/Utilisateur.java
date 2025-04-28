package Logininter;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Permet la manipulation des user
 * @author eriva
 */
public class Utilisateur {
    private String id;
    private String nom;
    private String prenom;
    private String login;
    private String mdp;
    private String adresse;
    private String cp;
    private String ville;
    private Date dateEmbauche;

    public Utilisateur(String id, String nom,String prenom, String login, String mdp, String adresse, String cp, String ville, Date dateEmbauche) {
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
     * obtenir le id du user
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * setle id du user
     * @param id the id to set
     */
    public void setId(String id) {
         this.id= id;
    }
    
    /**
     * obtenir la dateEmbauche
     * @return the dateEmbauche
     */
    public Date getdateEmbauche() {
        return dateEmbauche;
    }

    /**
     * set la dateEmbauche
     * @param dateEmbauche the id to set
     */
    public void setdateEmbauche(Date dateEmbauche) {
         this.dateEmbauche= dateEmbauche;
    }

    /**
     * obtenir le nom du user
     * @return the Nom
     */
    public String getNom() {
        return this.nom;
    }
    
    /**
     * set le nom du user
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * obtenir le prenom du user
     * @return the Prénom
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * set le prenom du user
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * obtenir le login du suer
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * set le login du user
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * obtenir l'adr du user
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * set l'adr du user
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * obtenir le code postal du user
     * @return the cp
     */
    public String getCp() {
        return cp;
    }

    /**
     * set le code postal du user 
     * @param cp the cp to set
     */
    public void setCp(String cp) {
        this.cp = cp;
    }
    
    /**
     * obtenir la ville du user
     * @return the ville
     */
    public String getVille() {
        return this.ville;
    }
    
    /**
     * set a ville du user
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }
    /**
     * tableau du user
     */
    public Object[] toArray(){
        Object[] tab = new Object[]{this.id, this.nom, this.prenom, this.login, this.mdp, this.adresse, this.cp, this.ville, this.dateEmbauche};
        return tab;
    }
}
