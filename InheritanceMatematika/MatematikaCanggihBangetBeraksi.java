/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceMatematika;

/**
 *
 * @author irvan
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget math = new MatematikaCanggihBanget();

        System.out.println("Pertambahan: 5 + 3 = " + math.pertambahan(5, 3));
        System.out.println("Perkalian: 4 * 6 = " + math.perkalian(4, 6));
        System.out.println("Modulus: 10 % 3 = " + math.modulus(10, 3));

        System.out.println("PertambahanTiga: 2 + 3 + 4 = " + math.pertambahanTiga(2, 3, 4));
    }
}
