/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodedatos66136;

/**
 *
 * @author salva
 */
public class TipoDeDatos66136 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      byte bytemin = -128;
        System.out.println("bytemin = " + bytemin);
      byte bytemax = +127;
        System.out.println("bytemax = " + bytemax);
      short shortmin = -32768;
        System.out.println("shortmin = " + shortmin);
      short shortmax = 32767;
        System.out.println("shortmax = " + shortmax);
      int intmin = (int) (-2e31);
        System.out.println("intmin = " + intmin);
      int intmax = (int) (2e31-1) ;
        System.out.println("intmax = " + intmax);
      long longmin = (long) (-2e63);
        System.out.println("longmin = " + longmin);
      long longmax =  (long) (2e63-1);
        System.out.println("longmax = " + longmax);
      double  doublemin = (double) -1.7976931348623157E308;
        System.out.println("doublemin = " + doublemin);
        var doublemax = (double) 1.7976931348623157E308;
        System.out.println("doublemax = " + doublemax);     
        
    }
    
}
