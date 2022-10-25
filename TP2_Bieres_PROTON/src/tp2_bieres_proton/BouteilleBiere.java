/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_proton;

/**
 *
 * @author proto
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
public void lireEtiquette() {
 System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;

//la fonction lit l'étiquette
 
}
public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
 //on note les informations de la bouteille biere
}
public boolean Decapsuler(){
    if(ouverte==false){
      ouverte=true;
        
    
    }
    else{
        System.out.println("erreur, la bière est déja ouverte") ;
   return ouverte; 
}       return false;
}
@Override
//controle l'ouverture de la bière
public String toString() {
String chaine_a_retourner;
//retourner la chaine avec les infos de la bière
chaine_a_retourner = (nom + " (" + degreAlcool + " degrés) Ouverte ? ");
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
} 
   
}