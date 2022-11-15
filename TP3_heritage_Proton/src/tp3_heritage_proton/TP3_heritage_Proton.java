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
   }
    System.out.println(Tabarme.get(taille-1)); 

    }
}