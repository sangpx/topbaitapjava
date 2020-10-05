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
public class Dog implements Animal {

    @Override
    public void move() {
        System.out.println("Di chuyen manh me");
    }

    @Override
    public void eat() {
        System.out.println("An com");
    }

    @Override
    public void sleep() {
        System.out.println("Ngu buoi sang, buoi toi thuc");
    }
    
}
