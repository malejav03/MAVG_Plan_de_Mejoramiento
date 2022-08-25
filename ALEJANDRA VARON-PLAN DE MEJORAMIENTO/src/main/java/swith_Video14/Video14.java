
package swith_Video14;


public class Video14 {
    //Switch
    public static void main(String[] args) {
        int DiadelaSemana = 1;
        
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
