/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.proyecto;

public class Suma {

  private int num1;

  private int num2;

   public Suma(int n1, int n2) {
       num1 = n1;
       num2 = n2;
   }
   public int sumar() {
       int resultado = num1 + num2;
       return resultado;
   }
}