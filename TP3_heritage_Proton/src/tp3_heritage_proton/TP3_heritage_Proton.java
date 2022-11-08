/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage_proton;

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
    int longueur   
    System.out.println("la taille de Tab est " + taille); 
            
   }
    
}
