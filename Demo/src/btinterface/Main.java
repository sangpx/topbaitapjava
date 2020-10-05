/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btinterface;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal1 = new Dog();
           
        animal.move();
        animal.eat();
        animal.sleep();
        
        System.out.println("===========================");
        
        animal1.move();
        animal1.eat();
        animal1.sleep();
    }
}
