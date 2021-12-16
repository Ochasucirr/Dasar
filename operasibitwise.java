/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan;

public class operasibitwise {
    public static void main(String[] args) {
       int s = 21;
       int a = 14;
       int o;
       
       System.out.println("Basis bilangan desimal");
       System.out.println("Nilai s ="+s);
       System.out.println("Basis bilangan biner");
       System.out.println("Nilai s ="+String.format("%8s", Integer.toBinaryString(s)));
    
      //AND
      o = s & a;
      System.out.println("s & a ="+String.format("%8s", Integer.toBinaryString(o)));
      //OR
      o = s | a;
       System.out.println("s | a ="+String.format("%8s", Integer.toBinaryString(o)));
      //Exclusive OR
      o = s ^ a;
      System.out.println("s ^ a ="+String.format("%8s", Integer.toBinaryString(o)));
    }
}
