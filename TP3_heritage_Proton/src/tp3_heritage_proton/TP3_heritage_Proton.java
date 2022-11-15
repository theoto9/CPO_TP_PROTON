/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage_proton;

import Armes.*;
import java.util.ArrayList;

/**
 *
 * @author proto
 */
public class TP3_heritage_Proton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    epee epee1= new epee("Excalibur",7,5);
        System.out.println(epee1);
    epee epee2= new epee("Durandal",4,7);
        System.out.println(epee2);
    Baton Baton1= new Baton("Chene",4,5);
        System.out.println(Baton1);
    Baton Baton2=new Baton("Charme",5,6);
        System.out.println(Baton2);
        
        
    ArrayList<Arme> Tabarme = new ArrayList<Arme>();  // déclaration et initialisation
    Tabarme.add(epee1);
    Tabarme.add(epee2);
    Tabarme.add(Baton1);
    Tabarme.add(Baton2);
    
    int taille = Tabarme.size(); // on récupère la taille  (ici 3)
    int longueur=taille-1;
    for (int i=0; i<longueur; i++){
    System.out.println(Tabarme.get(i)+","); 
    
    magicien magicien1=new magicien ("Gandalf",65,true );
    magicien magicien2=new magicien ( "Garcimore",44,false );
    
    guerrier guerrier1=new guerrier("Conan",78,false);
    guerrier guerrier2=new guerrier("Lannister",45,true);
    
    System.out.println(magicien1);
    System.out.println(magicien2);
    System.out.println(guerrier1);
    System.out.println(guerrier2);
    
    ArrayList<Personnage> TabPersonnage= new ArrayList<Personnage>();  // déclaration et initialisation
    TabPersonnage.add(magicien1);
    TabPersonnage.add(magicien2);
    TabPersonnage.add(guerrier1);
    TabPersonnage.add(guerrier2);
    
    int taille2 = TabPersonnage.size(); // on récupère la taille  (ici 3)
    int longueur2=taille2-1;
    for (int i2=0; i<longueur2; i++){
    System.out.println(Tabarme.get(i)+","); 
   }
    guerrier guerrier3= new guerrier("hervé",56,false);
    Baton Baton3= new Baton("bouleau",5,5);
    magicien magicien3=new magicien ("Harry",55,true);
    Baton Baton4=new Baton("cerisier",3,6);
    Baton Baton5=new Baton("sequoia",4,4);
    epee epee3= new epee("sabre",5,8);
    epee epee4= new epee("fleuret",8,8);
    epee epee5= new epee("Arthur",10,3);

    guerrier3.ajouter_arme(Baton1);
    guerrier3.ajouter_arme(epee2);
    guerrier3.ajouter_arme(epee4);
    
    magicien3.ajouter_arme(Baton2);
    magicien3.ajouter_arme(epee4);
    magicien3.ajouter_arme(epee1);
    
    
    
System.out.println(Tabarme.get(taille-1)); 
System.out.println(TabPersonnage.get(taille-1)); 
    
    }
    }
    
}