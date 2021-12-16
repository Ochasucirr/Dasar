/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;
public class Constructor {
   
    public String saya;
    public String dia;

    public Constructor (String saya, String dia) {
        this.saya = saya;
        this.dia = dia;
    }

    public void Anak() {
        System.out.println("Anak pertama : " + saya);
        System.out.println("Anak kedua : " + dia);
    }
}
