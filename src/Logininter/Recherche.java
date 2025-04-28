/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Logininter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *Permet la recherche d'un user
 * @author eriva
 */
public class Recherche extends javax.swing.JFrame {

    //private JTable tableUser;
    private Accesbdd accesBdD;
    private UtilisateurDAO UserDAO;
    private Connection connexion;
   // private int selectedRow = -1;
    private DefaultTableModel tableModel;

    /**
     * Creates new form LoginFrame
     */
    public Recherche() {
        initComponents();
        
        this.accesBdD = new Accesbdd();
        UserDAO = new UtilisateurDAO(accesBdD.getconnexion());
        listerUser();

    }
/** 
 * affiche la liste des User
 */
    public void listerUser() {
        try {

            ResultSet rs;
            rs = accesBdD.getusers();

            DefaultTableModel tableModel = (DefaultTableModel) tableUser.getModel();

            tableModel.setRowCount(0);
            if (rs.first()) {
                Object[] user = new Object[9];
                rs.beforeFirst();
                while (rs.next()) {
                    user[0] = rs.getString("id");
                    user[1] = rs.getString("nom");
                    user[2] = rs.getString("prenom");
                    user[3] = rs.getString("login");
                    user[4] = rs.getString("mdp");
                    user[5] = rs.getString("adresse");
                    user[6] = rs.getString("cp");
                    user[7] = rs.getString("ville");
                    user[8] = rs.getDate("dateEmbauche");

                    tableModel.addRow(user);
                }
            }
            tableUser.setModel(tableModel);

        } catch (SQLException ex) {
            Logger.getLogger(Recherche.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        barreRecherche = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));

        jLabel3.setText("Rechercher : ");
        jLabel3.setName("ajout"); // NOI18N

        barreRecherche.setBackground(new java.awt.Color(153, 153, 153));
        barreRecherche.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        barreRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barreRechercheActionPerformed(evt);
            }
        });

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nom", "prenom", "login", "mdp", "adresse", "cp", "ville", "dateEmbauche"
            }
        ));
        tableUser.setName("tableUser"); // NOI18N
        jScrollPane1.setViewportView(tableUser);
        if (tableUser.getColumnModel().getColumnCount() > 0) {
            tableUser.getColumnModel().getColumn(8).setPreferredWidth(250);
        }

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barreRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barreRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barreRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barreRechercheActionPerformed
        // Sert à mettre des informations qui permetterons de trouver un utilisateur
        String recherche = barreRecherche.getText() + "%";

        try {
            String req = "select* from visiteur where nom like ? or prenom like ? or login like ? or id like ? or ville like ? or dateEmbauche like ?";
            PreparedStatement pstmt = accesBdD.getconnexion().prepareStatement(req);

            for (int i = 1; i <= 6; i++) {
                pstmt.setString(i, recherche);
            }
            ResultSet result = pstmt.executeQuery();

            DefaultTableModel tableModel = (DefaultTableModel) tableUser.getModel();
            tableModel.setRowCount(0);

            while (result.next()) {
                Object[] user = new Object[9];
                user[0] = result.getString("id");
                user[1] = result.getString("nom");
                user[2] = result.getString("prenom");
                user[3] = result.getString("login");
                user[4] = result.getString("mdp");
                user[5] = result.getString("adresse");
                user[6] = result.getString("cp");
                user[7] = result.getString("ville");
                user[8] = result.getDate("dateEmbauche");

                tableModel.addRow(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Accesbdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_barreRechercheActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ajouter ajouter = new Ajouter();
        ajouter.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * class main de Recherche
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recherche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barreRecherche;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUser;
    // End of variables declaration//GEN-END:variables
}
