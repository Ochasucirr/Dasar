/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Operatorlogika {

    public static void main(String[] args) {
      boolean A = true;
      boolean S = false;
      boolean R;
      
      R = A && S;
      System.out.println("true && false =" +R);
      R = A || S;
      System.out.println("true || false =" +R);
      
      System.out.println("Negasi, !true =" + !A);
    }
}
