/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulus;

import java.util.Scanner;

/**
 *
 * @author irvan
 */
public class matematikaCanggihBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        matematikaCanggih matCang = new matematikaCanggih();
        
        System.out.println("==== Matematika Canggih Bro ====");
        
        System.out.print("Masukkan Nilai a: ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan Nilai b: ");
        int b = scanner.nextInt();
        if (b == 0) {
            System.out.println("Nilai b Tidak Boleh 0, Silakan masukkan ulang");
        }
        System.out.println("________________________________");
        
        System.out.println("Hasil Tambah: " + matCang.tambah(a, b));
        System.out.println("Hasil Perkalian: " + matCang.kali(a, b));
        System.out.println("Hasil Modulus: " + matCang.modulus(a, b));
    }
}
