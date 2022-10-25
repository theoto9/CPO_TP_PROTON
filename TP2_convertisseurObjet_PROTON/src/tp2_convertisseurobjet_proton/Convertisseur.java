/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_proton;

/**
 *
 * @author proto
 */



public class Convertisseur {
    
    int nbConversions;
    
    public Convertisseur () {
        int nbConversions = 0;
}
    //conversion des Celcius en Kelvin
    public double CelciusVersKelvin(double Kelv){
        double Cels;
        Cels=Kelv+273;
        nbConversions+=1;
        return Cels;
    }
    
    //conversion de Kelvin en Celsius
    public double KelvinVersCelcius(double Cels){
        double Kelv;
        Kelv=Cels-273;
        nbConversions+=1;
        return Kelv;
    }
    
    //conversion Farenheit en Celsius
    public double FarenheitVersCelcius(double Cels){
        double Far;
        Far=(Cels-32)/1.8;
        nbConversions+=1;
        return Far;    
    }
    
    //conversion des Celsius en Farenheit
    public double CelsiusVersFarenheit(double Far){
        double Cels;
        Cels=Far*1.8+32;
        nbConversions+=1;
        return Cels;    
    }
    
    public double FarenheitVersKelvin(double Kelv){
        double Far;
        Far=(Kelv-32)*1.8+273;
        nbConversions+=1;
        return Far;    
    }
    
    public double KelvinVersFarenheit (double Far){
        double Kelv;
        Kelv=(Far-273)*1.8+32;
        nbConversions+=1;
        return Kelv;
    }
    
    public String toString() {
        return "nombre de conversion" + nbConversions;
    }
    
    
}


