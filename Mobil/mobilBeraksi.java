/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author irvan
 */
public class mobilBeraksi {
    public static void main(String[] args) {
        //objek baru
        mobil mobilku = new mobil();
        
        //panggil atribut dan memberi  nilai
        mobilku.warna = "hitam";
        mobilku.tahunProduksi = 2006;
        
        System.out.println("Warna :" +mobilku.warna);
        System.out.println("Tahun :" +mobilku.tahunProduksi);
    }
}
