
package Taller2Video20;

import java.util.Scanner;


public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        //segundo
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Inserta la distancia al conductor\n");
        double DistanciaDeCarroEnKm = myScanner.nextDouble();
        
        System.out.println("¿El conductor está disponible?(Escribe true o false)\n");
        boolean esViable = myScanner.nextBoolean();
        
        if (DistanciaDeCarroEnKm <= 0.5 && esViable){
            System.out.println("Listo para iniciar recorrido");
        }else if (DistanciaDeCarroEnKm <= 0.5 && !esViable){
            System.out.println("Conductor cercano,pero no disponible");
        }else if (DistanciaDeCarroEnKm > 0.5 && esViable){
            System.out.println("Conductor disponible pero muy lejos, aplicaran tarifas mas altas");
        }else{
            System.out.println("No hay conductor disponibles");
        }
        
    }
    
}
