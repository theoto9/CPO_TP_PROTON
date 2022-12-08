/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console;
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
    
    //affectation des couleurs des joueurs
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
    
    //ajouts des trous noirs et désintégrateurs
    public void placerTrousNoirsEtDesintegrateurs() {
        int li = (int)(Math.random())*6;
        int col = (int)(Math.random())*7;
        int compt_tn_d = 0;
        int compt_tn = 0;
        int compt_d = 0;
        
        do {
            if (plateau.presenceTrouNoir(li, col) == false && plateau.presenceDesintegrateur(li, col) == false) {
                plateau.placerTrouNoir(li, col);
                plateau.placerDesintegrateur(li, col);
                li = (int)(Math.random())*6;
                col = (int)(Math.random())*7;
                compt_tn_d += 1;
            }
            } while(compt_tn_d < 3);
        
        
        do {
        li = (int)(Math.random())*6;
        col = (int)(Math.random())*7;
        if (plateau.presenceTrouNoir(li, col) == false && plateau.presenceDesintegrateur(li, col) == false) {
            plateau.placerDesintegrateur(li, col);
            compt_d += 1;
        }
        } while(compt_d < 2);
    
        
        do {
            li = (int)(Math.random())*6;
            col = (int)(Math.random())*7;
            if (plateau.presenceTrouNoir(li, col) == false && plateau.presenceDesintegrateur(li, col) == false) {
                plateau.placerTrouNoir(li, col);
                compt_tn += 1;
            }

            } while(compt_tn < 2);   
    
    }
    
    
    
    
    
    
    
    public void initialiserPartie() {
       this.attribuerCouleurAuxJoueurs();
       this.creerEtAffecterJeton(listeJoueurs[0]);
       this.creerEtAffecterJeton(listeJoueurs[1]);
       this.placerTrousNoirsEtDesintegrateurs();
    }
    //lancement de la partie selon différents cas
    public void lancerPartie() {
        this.creerEtAffecterJeton(listeJoueurs[0]);
        this.creerEtAffecterJeton(listeJoueurs[1]);
        joueurCourant = listeJoueurs[0];
    Scanner sc = new Scanner(System.in); //initialisation du scanner qui recupere les infos de la console 
    plateau.afficherGrilleSurConsole();
    this.placerTrousNoirsEtDesintegrateurs();
    do {
       System.out.println("\nA ton tour : " + joueurCourant + "\n Choisis stp la colonne ou jouer" );
       int rep = sc.nextInt();
       plateau.ajouterJetonDansColonne(joueurCourant, rep);
       plateau.afficherGrilleSurConsole();
       this.changerjoueurCourant();
        
        
        
        
    } while(plateau.etreGagnantePourCouleur("jaune") == false && plateau.etreGagnantePourCouleur("rouge") == false && plateau.grilleRemplie() == false);
        
    this.changerjoueurCourant();
    System.out.println("Bravo, tu as gagne "+ joueurCourant);
    
    
    }
    
    
    
    
    
}