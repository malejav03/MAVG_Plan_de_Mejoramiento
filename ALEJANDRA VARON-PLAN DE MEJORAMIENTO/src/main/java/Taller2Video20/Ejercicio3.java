
package Taller2Video20;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Inseta un numero entero: ");
        int n = myScanner.nextInt();
        
        int total = 0;
        for (int i =0; i<= n ; i++){
            total +=i;
        }
        System.out.println(String.format("La suma es %d",total));
        
    }
    
}
