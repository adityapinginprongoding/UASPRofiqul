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
public class mobil {
    String warna;
    int tahunProduksi;
    
    public mobil(String warna, int tahubProduksi){
        this.warna = warna;
        this.tahunProduksi= tahunProduksi;
    }
    
    public mobil(){}
    
    public void info(){
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahunProduksi);
    }
}
