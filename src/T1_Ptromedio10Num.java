
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenni
 */
public class T1_Ptromedio10Num {

    public static void main(String[] args) {
        int n,s=0,x;
        double p;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar cantidad de elementos: ");
        n=teclado.nextInt();
   
        for(int i=1;i<=n;i++)
        { 
         System.out.println("Elemento [\"+i+\"]=");
         x=teclado.nextInt();
         s=s+x;                
        }   
        p=s/n;
        
         System.out.println("El Promedio es:" +p);                               
    }   
}
   
