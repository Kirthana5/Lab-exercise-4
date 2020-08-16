/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distanceconvertions;
import java.util.*;
import convertors.distanceconvertor;
/**
 *
 * @author KIRTHANA
 */
public class disconv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        distanceconvertor obj=new distanceconvertor();
        double meter,miles,km;
        
        //meter to kilometer
        System.out.println("Enter distance in meter:");
        meter=val.nextDouble();
        System.out.println("Converting into kilometer....\n"+meter+"meters="+(obj.metertokilometer(meter))+"km");
        System.out.println("===========================");
        
        
        //miles to kilometer
        System.out.println("Enter distance in miles:");
        miles=val.nextDouble();
        System.out.println("Converting into kilometer....\n"+miles+"miles="+(obj.milestokilometer(miles))+"km");
        System.out.println("===========================");
        
        
        System.out.println("Vice versa:");
        
        //kilometer to meter
        System.out.println("Enter distance in kilometer:");
        km=val.nextDouble();
        System.out.println("Converting into meter....\n"+km+"km="+(obj.kilometertometer(km))+"meter");
        System.out.println("==========================="); 
        

        //kilometer to miles
        System.out.println("Enter distance in kilometer:");
        km=val.nextDouble();
        System.out.println("Converting into miles....\n"+km+"km="+(obj.kilometertomiles(km))+"miles");
        System.out.println("==========================="); 
    }
    
}
