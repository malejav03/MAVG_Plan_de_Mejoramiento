
package Taller1DeVideos;

import static java.lang.Math.pow;


public class Taller1DeVideos {
    
    public static void main(String[] args) {
        
        //primer punto
        //devaramos las varibles
        int a = 15;
        int b = 23;
        int c = 12;
        
        //se calcula el volumen y se guarda el valor en la nueva variable
        int volumen = a * b * c;
        
        //se imprime la respuesta
        System.out.println("El vomune es de: "+volumen );
        
        //segundo
        //variables
        int Masa = 12;
        int velocidad = 3;
        //se calcula y se guarda
        double energiacinetica = (Masa * pow(velocidad ,2))/2.0;
        
        //imprime
        System.out.println("\n_______________________________");
        System.out.println(String.format("\nLa energia cinetia es %.2f",energiacinetica));
        
        //tercero
        //variables
        char letra = 'J';
        long num1 = 1495970192837664l;
        float num2 = 12.5f;
        boolean respuesta = true;
        int num3 = 90;
        String frase = "No tengo trono ni reina, ni nadie que me comprenda, pero sigo siendo el rey";
        double num4 = 6.626070040;
        //&imprimir respuesta
        System.out.println("\n_______________________________");
        System.out.println("\nMi primera letra es: "+letra);
        System.out.println("numero aleatorio: "+num1);
        System.out.println("El cosot en dolares es: "+num2);
        System.out.println("La pregunta 3 es verdadera o falsa: es "+respuesta);
        System.out.println("Tiene una edad de "+num3+"años");
        System.out.println("EL rey dijo : "+frase);
        System.out.println("El cuadrado es: "+num4+"\n_______________________________");
        
        
        //Cuarto punto
        //asignamos variables
        double costo = (60*0.30) + (100*0.25) + (20*80);
        float iva = 16/100f;
        double impuestoIVA = costo*iva;
        double total = costo + impuestoIVA;
        //imprimir
        System.out.println(String.format("El valor a pagar es %.2f", total));
        
        
    }
    
}
