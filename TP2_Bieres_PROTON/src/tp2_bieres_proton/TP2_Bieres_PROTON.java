/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_proton;

/**
 *
 * @author proto
 */
public class TP2_Bieres_PROTON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0,"Dubuisson") ;
        uneBiere.lireEtiquette();
        BouteilleBiere uneBiere2 = new BouteilleBiere("Chouffe",9.0,"MontBlanc") ;
        uneBiere2.lireEtiquette();
        BouteilleBiere uneBiere3 = new BouteilleBiere("Desperados",5.2,"mexicana") ;
        uneBiere3.lireEtiquette();
}
    }
    

    