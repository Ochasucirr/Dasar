/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Belajar;

public class Overloadingcontructor {
     public String nama;
     public int teman=0, kenalan=0;
     
 public Overloadingcontructor(String nm){ //konstruktor 1
  nama = nm;
 }
 public Overloadingcontructor(String nm, int tem){ //konstruktor 2
  nama = nm;
  teman = tem;
 }
 public Overloadingcontructor(String nm, int tem, int ken){ //konstruktor 1
  nama = nm;
  teman = tem;
  kenalan = ken;
 }
 public void cetak(){
  System.out.println("Nama   : "+nama);
  System.out.println("Teman  : "+teman);
  System.out.println("Kenalan: "+kenalan);
 }
}
