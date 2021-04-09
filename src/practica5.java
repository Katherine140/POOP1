
package practica5;

import java.util.Scanner;


public class Practica5 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
      //private static int existeEnArreglo(int[] numeros) {
        
    
        int numeros[] = new int[5];
        int posicionDeElementoBuscado numeros(numeros);
                
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número en la posición " + (i) + " :");
            numeros[i] = Integer.parseInt(teclado.nextLine());

        }
        System.out.println("¿introduce el numero a buscar: ");
        if (posicionDeElementoBuscado == -1) {
    System.out.println("El elemento NO existe en el arreglo");
  } else {
    System.out.println("El elemento existe en la posición: " + posicionDeElementoBuscado);
  }

    }

}