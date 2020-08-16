/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessingpackage;
import package1.*;
import package1.subpackage1.*;
import package2.*;
import package2.subpackage2.*;
/**
 *
 * @author KIRTHANA
 */
public class accessingpack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Accessing Package 1 and its subpackage
        System.out.println("Accessing Package1:");
        firstpack1 obj1=new firstpack1();
        firstsubpack1 obj2=new firstsubpack1();
        obj1.display();
        obj2.display();
        
        System.out.println("------------------------");
        
        //Acceessing Package2 and its subpackage
        System.out.println("Accessing Package2:");
        secondpack2 obj3=new secondpack2();
        secondsubpack2 obj4=new secondsubpack2();
        obj3.display();
        obj4.display();

    }
    
}
