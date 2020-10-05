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
public class Cat implements Animal {

    @Override
    public void move() {
        System.out.println("Di chuyen nhe nhang");
    }

    @Override
    public void eat() {
        System.out.println("An chuot");
    }

    @Override
    public void sleep() {
        System.out.println("Ngu ca ngay");
    }
    
}
