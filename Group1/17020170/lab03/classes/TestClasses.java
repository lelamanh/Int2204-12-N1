/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Minh
 */
public class TestClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bulb b1 = new Bulb();
        System.out.println(b1.powerUsage(220));
        Dog doge = new Dog("Doge", "Corgi", "Yellow");
        doge.getInfo();
        doge.bark();
        
    }
    
}
