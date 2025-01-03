/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingkaran;

/**
 * @author irvan
 */
public class lingkaran {
    public void buatLingkaran() {
        garis garis = new garis();
        
        for (int i = 0; i < 360; i += 10) {
            double x1 = Math.cos(Math.toRadians(i));
            double y1 = Math.sin(Math.toRadians(i));
            double x2 = Math.cos(Math.toRadians(i + 10));
            double y2 = Math.sin(Math.toRadians(i + 10));
            
            garis.buatGaris(x1, y1, x2, y2);
        }
    }
}
