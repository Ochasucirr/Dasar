/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Operatorpenugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A;
        int S;

        // Pengisian nilai
        A = 180;
        S = 150;

        // penambahan
        S += A;
        System.out.println("Penambahan : " + S);

        // pengurangan
        S -= A;
        System.out.println("Pengurangan : " + S);

        // perkalian
        S *= A;
        System.out.println("Perkalian : " + S);

        // Pembagian
        S /= A;
        System.out.println("Pembagian : " + S);

        // Sisa bagi
        S %= A;
        System.out.println("Sisa Bagi: " + S);
    }
}
