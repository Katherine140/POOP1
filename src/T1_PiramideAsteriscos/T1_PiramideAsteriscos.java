/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_PiramideAsteriscos;

import java.util.Scanner;

/**
 *
 * @author Kath
 */
public class T1_PiramideAsteriscos {
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.print("Cuantas filas deceas agregar: ");
        int filas=sc.nextInt();
        sc.close();
        
        System.out.println();
        for (int alto = 1; alto <= filas; alto++){
            
            for (int espacio = 1; espacio <= filas-alto; espacio++){
                System.out.print("");
            }
            for (int asteriscos = 1; asteriscos <= (alto*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
            }
    }
}


       
        
  