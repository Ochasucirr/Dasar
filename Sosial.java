/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Belajar;

public class Sosial {

  public static void main(String[] args) {
  Overloadingcontructor baru = new Overloadingcontructor("Virni");
  System.out.println("Konstruktor pertama : ");
  baru.cetak();
  Overloadingcontructor lama = new Overloadingcontructor("Merisa", 50);
  System.out.println("Konstruktor kedua : ");
  lama.cetak();
  Overloadingcontructor cantik = new Overloadingcontructor("Tesalonika", 100, 100);
  System.out.println("Konstruktor 3 : ");
  cantik.cetak();
    }
}
