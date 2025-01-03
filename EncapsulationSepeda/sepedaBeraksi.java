/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulationSepeda;

/**
 *
 * @author irvan
 */
public class sepedaBeraksi {
    public static void main(String[] args) {
        sepeda sepedaku = new sepeda();
        
        sepedaku.setGir(1);
        /*
        Variabel bisa diubah atau tidak sengaja diuba. 
        Hal ini berbahaya dan sering menimbulkan bug. 
        berikan acces modifier private pada instance variabel
        */
//        sepedaku.gir = 3;
        System.out.println("Gir saat ini: " +sepedaku.getGir());
    }
  
}
