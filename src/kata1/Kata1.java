/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author ejrbalma
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicio");
        Date f = new Date(64,7,3);
        
        
        
        Person p1 = new Person("Enrique", "Ramon", f);
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());
        
        System.out.println("Fin");
    }
    
}
