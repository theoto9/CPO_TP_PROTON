/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import java.util.ArrayList;

/**
 *
 * @author proto
 */
public class Personnage {
    String nom;
    int niveaudevie;
    Arme Arme2;
    ArrayList<Arme> Tabarme=new ArrayList<Arme>();
    Arme armeenmain;
    
public void ajouter_arme(Arme stock){
    Arme2= stock;
    int taille3=Tabarme.size();
    if(taille3<5){
            Tabarme.add (stock);
           
        } 
        
}
public void equiperarme(String armer){
    for (int niveaudevie=0;niveaudevie<Tabarme.size();niveaudevie++){
        if (Tabarme.get(1).getnom().equals(armer)){
            System.out.println("Arme équipée");
        }
    }
}
    public Personnage(String nom, int niveaudevie){
            this.nom=nom;
            this.niveaudevie= niveaudevie;
            this.armeenmain= null;
            
           
    }
        @Override
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner=("La classe est "+nom+"et le niveau de point de vie est "+niveaudevie);
    return chaine_a_retourner;
}

}

