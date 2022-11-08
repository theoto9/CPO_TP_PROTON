/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_proton;

/**
 *
 * @author proto
 */
public class Arme {
    String nom;
    int nivattaque;
    
    public Arme(String n, int niv){
        nom=n;
        nivattaque=niv;
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
//retourner la chaine avec les infos de la bière
        chaine_a_retourner = ("cette arme est :" +nom + " (son niveau d'attaque est de "+nivattaque+")");
    
   
    return chaine_a_retourner;
    }
}
    

