/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author DELL
 */
public class clients extends javax.swing.JFrame {

    ArrayList<Client> clients;
    DefaultListModel modeleListe;
    File fichier ;
    FileWriter fw;
    PrintWriter pw;
    /**
     * Creates new form clients
     */
    public clients() {
        initComponents();
        clients = new ArrayList<>();
        modeleListe = new DefaultListModel();
        
        try {
            fichier = new File("fich.veh");
            fw = new FileWriter(fichier);
              pw = new PrintWriter(fw);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listeClients = new javax.swing.JList<>();
        supprimer = new javax.swing.JButton();
        enregistrer = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        fermer = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listeClients.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        listeClients.setForeground(new java.awt.Color(0, 51, 102));
        jScrollPane1.setViewportView(listeClients);

        supprimer.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        supprimer.setForeground(new java.awt.Color(0, 102, 102));
        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        enregistrer.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        enregistrer.setForeground(new java.awt.Color(0, 102, 102));
        enregistrer.setText("Enregistrer");

        modifier.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        modifier.setForeground(new java.awt.Color(0, 102, 102));
        modifier.setText("Modifier");

        fermer.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        fermer.setForeground(new java.awt.Color(0, 102, 102));
        fermer.setText("Fermer");
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerActionPerformed(evt);
            }
        });

        ajouter.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        ajouter.setForeground(new java.awt.Color(0, 102, 102));
        ajouter.setText("Ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fermer, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enregistrer)
                .addGap(18, 18, 18)
                .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fermer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supprimerActionPerformed

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed
         fenetre fn = new fenetre () ;
        fn.show();  // display clients here
        dispose(); //close current frame fenetre after open clients
    }//GEN-LAST:event_fermerActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        Client cl =  null;  
        String nom, prenom, adresse, type;
       nom = JOptionPane.showInputDialog(this, "entrer votre nom s'il vous plait", "NOM CLIENT", JOptionPane.PLAIN_MESSAGE);
       prenom = JOptionPane.showInputDialog(this, "entrer votre prenom s'il vous plait", "PRENOM CLIENT", JOptionPane.PLAIN_MESSAGE);
       adresse = JOptionPane.showInputDialog(this, "entrer votre adresse s'il vous plait", "ADRESSE DE CLIENT", JOptionPane.PLAIN_MESSAGE);
       type = JOptionPane.showInputDialog(this, "Acheteur, locataire, vendeur, bailleur", "TYPE DE CLIENT", JOptionPane.PLAIN_MESSAGE);
     cl = new Client (nom, prenom , adresse, type);
       clients.add(cl);
      modeleListe.add(0, cl);
      listeClients.setModel(modeleListe);
    }//GEN-LAST:event_ajouterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             clients cl =  new clients();
             cl.setVisible( true );
             cl.setTitle("La Gegestion d'un Client");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter;
    private javax.swing.JButton enregistrer;
    private javax.swing.JButton fermer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listeClients;
    private javax.swing.JButton modifier;
    private javax.swing.JButton supprimer;
    // End of variables declaration//GEN-END:variables
}
