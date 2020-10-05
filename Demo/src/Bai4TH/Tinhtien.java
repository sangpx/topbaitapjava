/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4TH;
import java.util.Comparator;

/**
 *
 * @author ASUS
 */
public class Tinhtien implements Comparator<HocSinh>{
    @Override
    public int compare(HocSinh hs1, HocSinh hs2){
        if(hs1.Tinhtien() == hs2.Tinhtien()){
           return 0;
        } else {
            return (hs1.Tinhtien() - hs2.Tinhtien());
        }
    }
}
