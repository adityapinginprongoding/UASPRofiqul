/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphismSepeda;

/**
 *
 * @author irvan
 */
public class sepedaGunungBeraksi {
    public static void main(String[] args) {
        sepedaGunung sg = new sepedaGunung();
        
        sg.setGir(2);
        System.out.println(sg.getGir());
        
        sg.setGir(3);
        System.out.println(sg.getGir());
    }
}
