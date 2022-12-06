/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author proto
 */
public class FenetreDeJeu extends javax.swing.JFrame {

    Joueur[] listeJoueurs = new Joueur[2];
    Joueur joueurCourant = listeJoueurs[0];
    PlateauDeJeu plateau= new PlateauDeJeu();

    /**
     * Creates new form FenetreDeJeu
     */
    public FenetreDeJeu() {
        initComponents();
        panneau_creation_partie.setVisible(false);
        panneau_infos_parties.setVisible(false);
        initialiserPartie();

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellgraph = new CelluleGraphique(plateau.grille[i][j]);
                panneau_grille.add(cellgraph);
            }
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

        panneau_grille = new javax.swing.JPanel();
        panneau_infos_joueurs = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_start = new javax.swing.JButton();
        nom_joueur1 = new javax.swing.JTextField();
        nom_joueur2 = new javax.swing.JTextField();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_J1 = new javax.swing.JLabel();
        Jcou1 = new javax.swing.JLabel();
        Jdes1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_J2 = new javax.swing.JLabel();
        Jcou2 = new javax.swing.JLabel();
        Jdes2 = new javax.swing.JLabel();
        panneau_infos_parties = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jbl_jcourant = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(204, 255, 255));
        panneau_grille.setForeground(new java.awt.Color(204, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 672, 572));

        panneau_infos_joueurs.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Nom Joueur 1:");

        jLabel2.setText("Nom Joueur 2:");

        btn_start.setText("Démarer la partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panneau_infos_joueursLayout = new javax.swing.GroupLayout(panneau_infos_joueurs);
        panneau_infos_joueurs.setLayout(panneau_infos_joueursLayout);
        panneau_infos_joueursLayout.setHorizontalGroup(
            panneau_infos_joueursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_infos_joueursLayout.createSequentialGroup()
                .addGroup(panneau_infos_joueursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panneau_infos_joueursLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panneau_infos_joueursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(panneau_infos_joueursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nom_joueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom_joueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panneau_infos_joueursLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btn_start)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panneau_infos_joueursLayout.setVerticalGroup(
            panneau_infos_joueursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_infos_joueursLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panneau_infos_joueursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nom_joueur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panneau_infos_joueursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nom_joueur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_start)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panneau_infos_joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 250, 130));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Infos Joueurs:");

        jLabel4.setText("Joueur 1:");

        jLabel5.setText("Couleur:");

        jLabel6.setText("Desintegrateur:");

        lbl_J1.setText("nomJoueur1");

        Jcou1.setText("couleurJoueur1");

        Jdes1.setText("desintjoueur1");

        jLabel10.setText("Joueur 2:");

        jLabel11.setText("Couleur:");

        jLabel12.setText("Desintégrateur:");

        lbl_J2.setText("nomJoueur2");

        Jcou2.setText("couleurJoueur2");

        Jdes2.setText("desintjoueur2");

        javax.swing.GroupLayout panneau_creation_partieLayout = new javax.swing.GroupLayout(panneau_creation_partie);
        panneau_creation_partie.setLayout(panneau_creation_partieLayout);
        panneau_creation_partieLayout.setHorizontalGroup(
            panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_creation_partieLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27)
                .addGroup(panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panneau_creation_partieLayout.createSequentialGroup()
                        .addComponent(lbl_J1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(panneau_creation_partieLayout.createSequentialGroup()
                        .addComponent(Jcou1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panneau_creation_partieLayout.createSequentialGroup()
                        .addComponent(Jdes1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panneau_creation_partieLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panneau_creation_partieLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27)
                .addGroup(panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panneau_creation_partieLayout.createSequentialGroup()
                        .addComponent(lbl_J2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addComponent(Jcou2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panneau_creation_partieLayout.createSequentialGroup()
                        .addComponent(Jdes2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panneau_creation_partieLayout.setVerticalGroup(
            panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_creation_partieLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_J1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Jcou1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Jdes1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_J2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Jcou2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panneau_creation_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Jdes2))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 250, 310));

        panneau_infos_parties.setBackground(new java.awt.Color(204, 255, 204));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel16.setText("Infos Jeu:");

        jLabel17.setText("joueur courant:");

        jbl_jcourant.setText("nomJoueur2");

        javax.swing.GroupLayout panneau_infos_partiesLayout = new javax.swing.GroupLayout(panneau_infos_parties);
        panneau_infos_parties.setLayout(panneau_infos_partiesLayout);
        panneau_infos_partiesLayout.setHorizontalGroup(
            panneau_infos_partiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_infos_partiesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panneau_infos_partiesLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panneau_infos_partiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panneau_infos_partiesLayout.createSequentialGroup()
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(panneau_infos_partiesLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(27, 27, 27)
                        .addComponent(jbl_jcourant, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        panneau_infos_partiesLayout.setVerticalGroup(
            panneau_infos_partiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneau_infos_partiesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panneau_infos_partiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jbl_jcourant))
                .addGap(1, 1, 1)
                .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panneau_infos_parties, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, 250, 130));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 40, -1, -1));

        btn_col_2.setText("3");
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 40, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 40, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 40, -1, -1));

        btn_col_5.setText("6");
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        btn_col_6.setText("7");
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 40, -1, -1));

        setBounds(0, 0, 1040, 672);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_creation_partie.setVisible(true);
        panneau_infos_parties.setVisible(true);
    }//GEN-LAST:event_btn_startActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDeJeu().setVisible(true);
            }
        });
    }
    
    public void initialiserPartie() {
       //plateau.viderGrille(joueurCourant, joueurCourant);
      
       
        String nomJoueur1 = nom_joueur1.getText();
        Joueur J1 = new Joueur(nomJoueur1);
        
        String nomJoueur2 = nom_joueur2.getText();
        Joueur J2 = new Joueur(nomJoueur2);
        
        listeJoueurs[0] = J1;
        listeJoueurs[1] = J2;
        
        attribuerCouleurAuxJoueurs();
        
        lbl_J1.setText(nomJoueur1);
        Jcou1.setText(J1.getCouleur());
        Jdes1.setText(J1.nombreDesintegrateurs + "");
        
        lbl_J2.setText(nomJoueur2);
        Jcou2.setText(J2.getCouleur());
        Jdes2.setText(J2.nombreDesintegrateurs + "");
        
        
        
        this.creerEtAffecterJeton(listeJoueurs[0]);
        this.creerEtAffecterJeton(listeJoueurs[1]);
        
        Random r= new Random();
        boolean le_premier =r.nextBoolean();
        if(le_premier){
            joueurCourant=listeJoueurs[0];
            System.out.println("C'est au tour de "+ listeJoueurs[0]);
        }
        else{
            joueurCourant=listeJoueurs[1];
            System.out.println("C'est au tour de "+ listeJoueurs[1]);
        }
        jbl_jcourant.setText(joueurCourant.nom);
        
         placerTrousNoirsEtDesintegrateurs();
        
    }
    
 
public void attribuerCouleurAuxJoueurs() {
         int a = (int)(Math.random())*2;
         if (a == 0) {
            listeJoueurs[0].affecterCouleur("rouge");
            listeJoueurs[1].affecterCouleur("jaune");
        }
         else {
         listeJoueurs[1].affecterCouleur("rouge");
         listeJoueurs[0].affecterCouleur("jaune");
        }
     }


 public void changerjoueurCourant(){
          if (joueurCourant == listeJoueurs[0]) {
           joueurCourant = listeJoueurs[1];
       }
       else {
           joueurCourant = listeJoueurs[0];
       }
    }
    
    
    public void placerTrousNoirsEtDesintegrateurs() {
        Random r = new Random();
        int li;
        int col;
        int compt_tn_d = 0;
        int compt_tn = 0;
        int compt_d = 0;
        
        do {
            li = r.nextInt(6);
            col = r.nextInt(7);
            if (plateau.presenceTrouNoir(li, col) == false && plateau.presenceDesintegrateur(li, col) == false) {
                plateau.placerTrouNoir(li, col);
                plateau.placerDesintegrateur(li, col);
                System.out.println("Trou noir + desi placé");
                
                compt_tn_d += 1;
            }
            } while(compt_tn_d < 3);
        
        
        do {
        li = r.nextInt(6);
        col = r.nextInt(7);
        if (plateau.presenceTrouNoir(li, col) == false && plateau.presenceDesintegrateur(li, col) == false) {
            plateau.placerDesintegrateur(li, col);
            compt_d += 1;
            System.out.println("Des placés");
            
        }
        } while(compt_d < 2);
    
        
        do {
            li = r.nextInt(6);
            col = r.nextInt(7);
            if (plateau.presenceTrouNoir(li, col) == false && plateau.presenceDesintegrateur(li, col) == false) {
                plateau.placerTrouNoir(li, col);
                compt_tn += 1;
                System.out.println("TN placés");
            }

            } while(compt_tn < 2);   
    
    }
    
    
        public void creerEtAffecterJeton(Joueur j1) {
        if (j1.getCouleur() == "rouge") {
            for(int i=0; i < 30; i++ ) {
                Jeton jet1 = new Jeton("rouge");
                j1.ajouterJeton(jet1);
            }
        }
        else {
            for(int i=0; i < 30; i++ ) {
                Jeton jet1 = new Jeton("jaune");
                j1.ajouterJeton(jet1);      
            }    
        }   
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jcou1;
    private javax.swing.JLabel Jcou2;
    private javax.swing.JLabel Jdes1;
    private javax.swing.JLabel Jdes2;
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jbl_jcourant;
    private javax.swing.JLabel lbl_J1;
    private javax.swing.JLabel lbl_J2;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_infos_joueurs;
    private javax.swing.JPanel panneau_infos_parties;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}