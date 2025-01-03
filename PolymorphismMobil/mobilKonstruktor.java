/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphismMobil;

import MobilKonstruktor.*;

/**
 *
 * @author irvan
 */
public class mobilKonstruktor {
    public static void main(String[] args) {
        mobil mobilku = new mobil("merah", 2003);
        mobilku.info();
        
        mobil mobilmu = new mobil();
        mobilmu.info();
    }
}
