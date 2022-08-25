
package scanner_Video15;

import java.util.Scanner;


public class Video15 {
    //scanner
    public static void main(String[] args) {
        System.out.println("¿Qué día de la semana es (lunes 1 - Domingo 7):\n");
        
        //siver para digitar una varible por teclado
        Scanner dia = new Scanner(System.in);
        
        int DiadelaSemana = dia.nextInt();
        
        //el switch sirve con if-else la diferencia es q este no necesita tanto codigo
        switch (DiadelaSemana) {
            case 1:
                System.out.println("Es lunes de comedia");
                break;//sirve para que salga y no se vuelva infinito
            case 2:
                System.out.println("Martes de drama");
                break;
            case 3:
                System.out.println("Miercoles de acción");
                break;
            case 4:
                System.out.println("Jueves de animadas");
                break;
            case 5:
                System.out.println("Viernes de terror");
                break;
            case 6:
                System.out.println("Sabado de documentales");
                break;
            case 7:
                System.out.println("Domingo de comodin");
                break;    
            default:
                System.out.println("¿En que dia vives?");
        }
    }
    
}
