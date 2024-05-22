
import com.sun.corba.se.impl.transport.ListenerThreadImpl;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listeClients = new javax.swing.JList<>();
        supprimer = new javax.swing.JButton();
        enregistrer = new javax.swing.JButton();
        fermer = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listeClients.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listeClients.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        listeClients.setForeground(new java.awt.Color(0, 102, 102));
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
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });

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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\cours s4\\POO\\projet\\JavaApplication6\\src\\image\\houses-1094900_640.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\cours s4\\POO\\projet\\JavaApplication6\\src\\image\\customer_icon_149954.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(fermer, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enregistrer)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fermer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
         if(listeClients.isSelectionEmpty())
             JOptionPane.showMessageDialog(this, "Séléctionner le client à suprimmer ", "PAS DE SELECTION !", JOptionPane.ERROR_MESSAGE);
         else{
             int indice = listeClients.getSelectedIndex();
           modeleListe.remove(indice);
           clients.remove(indice);
         }
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

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
         for(Client cl:clients){
             pw.println(cl);
             JOptionPane.showMessageDialog(this,"Les informations du client sont été enregistrer","Bien d'enregistrement", JOptionPane.INFORMATION_MESSAGE);  
         }
         pw.close();
    }//GEN-LAST:event_enregistrerActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listeClients;
    private javax.swing.JButton supprimer;
    // End of variables declaration//GEN-END:variables
}
