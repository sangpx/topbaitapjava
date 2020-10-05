/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodahinh;

/**
 *
 * @author ASUS
 */
public class Circle extends Shape{

    double r;
    @Override
    double caculateArea() {
        return 3.14*r*r;
    }
    
}
