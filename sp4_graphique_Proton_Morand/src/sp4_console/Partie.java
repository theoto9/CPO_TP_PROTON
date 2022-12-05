/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console;

/**
 *
 * @author proto
 */

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author proto
 */
public class Partie {
    private Joueur [] listeJoueurs = new Joueur [2];
    private Joueur joueurCourant = listeJoueurs[0];
    private PlateauDeJeu plateau;

    public Partie(Joueur j1, Joueur j2) {
     listeJoueurs[0] = j1;
     listeJoueurs[1] = j2; 
     plateau = new PlateauDeJeu();
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
    
    

    public void initialiserPartie() {
       this.attribuerCouleurAuxJoueurs();
       placerTrousNoirsEtDesintegrateurs();
        
    }
    
    public void lancerPartie() {
        this.creerEtAffecterJeton(listeJoueurs[0]);
        this.creerEtAffecterJeton(listeJoueurs[1]);
        joueurCourant = listeJoueurs[0];
    Scanner sc = new Scanner(System.in); //initialisation du scanner qui recupere les infos de la console 
    plateau.afficherGrilleSurConsole();
    do {
       System.out.println("\nA ton tour : " + joueurCourant + "\nChoisis stp la colonne ou jouer\n8 pour recuperer un jeton\n9 Pour desintegrer un jeton" );
       int rep = sc.nextInt();
       if (rep >0 && rep<8) {
        int caca;
        caca = plateau.ajouterJetonDansColonne(joueurCourant.jouerJeton(), rep);
        if (caca == 10) {
            joueurCourant.nombreDesintegrateurs += 1;
        }
        plateau.afficherGrilleSurConsole();
        this.changerjoueurCourant();
       }
       if (rep == 8){
           System.out.println("Quelle colonne ?");
           int col = sc.nextInt();
           System.out.println("Quelle ligne");
           int lign = sc.nextInt();
           plateau.recupererJeton(lign-1, col-1);
           plateau.tasserColonne(col);
           this.changerjoueurCourant();
           plateau.afficherGrilleSurConsole();
       
       }
       if (rep == 9) {
           if (joueurCourant.nombreDesintegrateurs > 0) {
           System.out.println("Quelle colonne ?");
           int col = sc.nextInt();
           System.out.println("Quelle ligne ?");
           int lign = sc.nextInt();
           joueurCourant.utiliserDesintegrateur();
           plateau.supprimerJeton(lign-1, col-1);
           plateau.tasserColonne(col);
           this.changerjoueurCourant();
           plateau.afficherGrilleSurConsole();
           }
           else {
               System.out.println("Vous n'avez pas de désintégrateur !");
           }
       }
       if (rep >9 || rep <0) {
           System.out.println("Erreur de saisie");
       }
        
        
        
        
    } while(plateau.etreGagnantePourCouleur("jaune") == false && plateau.etreGagnantePourCouleur("rouge") == false && plateau.grilleRemplie() == false);
        
    this.changerjoueurCourant();
    System.out.println("Bravo, tu as gagne "+ joueurCourant);
    
    
    }
    
    
    
    
    

}
