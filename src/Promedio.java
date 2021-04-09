
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
public class Promedio {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double numsuma=0;
    double profinal=0;
    
    System.out.print("Introduce  un nuumero: ");
    int prom=sc.nextInt();
    
    double num[]=new double [prom]; 
    
    for(int i = 0; i < num.length; i++){
        System.out.println("Ingrese numero: "+ (i+1));
        num[i]=sc.nextDouble();
    }
    for(int i = 0; i < num.length; i++){
        numsuma=numsuma+num[i];
        profinal=numsuma/prom;
    }
    System.out.println("Promedio final: "+profinal);
    
    }
        
    }