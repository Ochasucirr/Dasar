/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Operatorpembanding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int UmurA = 20;
        int UmurS = 18;
        boolean hasil;

        // apakah A lebih tua dari S?
        hasil = UmurA > UmurS;
        System.out.println(hasil);

        // apakah A lebih muda dari S?
        hasil = UmurA < UmurS;
        System.out.println(hasil);

        // apakah A lebih tua samadengan S?
        hasil = UmurA >= UmurS;
        System.out.println(hasil);

        // apakah A lebih muda samadengan S?
        hasil = UmurA <= UmurS;
        System.out.println(hasil);

        // apakah Umur A sama dengan S?
        hasil = UmurA == UmurS;
        System.out.println(hasil);

        // apakah umur A tidak samadengan S?
        hasil = UmurA != UmurS;
        System.out.println(hasil);
    }
}
