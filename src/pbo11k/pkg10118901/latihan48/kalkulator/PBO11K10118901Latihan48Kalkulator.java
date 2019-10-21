/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan48.kalkulator;

/**
 *
 * @author Naniya
 * Nama     : Dedi Cahya
 * Kelas    : IF 11-K
 * Nim      : 10118901
 * Deskripsi Program : Program ini berisi program kalkulator dengan konsep orientasi objek
 */
public class PBO11K10118901Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator k = new Kalkulator();
        k.setValue1(7);
        k.setValue2(5);
        
        System.out.println("Value1 = "+ k.getValue1());
        System.out.println("Value2 = "+ k.getValue2());
        k.setNameProject();
        k.setNotePeoject();
        System.out.println("Result Add is = " + k.add(k.getValue1(),k.getValue2()));
        System.out.println("Result Minus is = "+ k.minus(k.getValue1(),k.getValue2()));
        System.out.println("Result multiplication is = " + k.multiplication(k.getValue1(),k.getValue2()));
        System.out.println("Result Division is = " + k.division(k.getValue1(),k.getValue2()));
        
    }
    
}
