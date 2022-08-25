
package arreglos_Video16_17;

import java.util.Scanner;


public class Video16y17 {
    //array 
    public static void main(String[] args) {
        
        System.out.println("Escribe el numero de episodios que querias sabes su duracion");
        Scanner scanner = new Scanner(System.in);
        int episodiosIndex = scanner.nextInt();
        episodiosIndex--;//aca se le resta pa q tome el numero anterion ejemplo 5 toma al 4
        
        int[] episodiosDuracionArray = new int []{30,32,27,31,60};//tamaño del arreglo, esto sirve para ahorar codigo
        int n = episodiosDuracionArray.length;
        
        //datos que se almacenan en el array 
        /*episodiosDuracionArray [0] = 30;
        * episodiosDuracionArray [1] = 32;
        * episodiosDuracionArray [2] = 27;
        * episodiosDuracionArray [3] = 31;
        * episodiosDuracionArray [4] = 60;
        */
        
        if (episodiosIndex >= 0 && episodiosIndex < n){
            int episodiosDuracion = episodiosDuracionArray[episodiosIndex];
            System.out.println("El episodio dura" + episodiosDuracion + "minutos");
        }else {
            System.out.println("Error, la serie solo tiene 5 episodios");
        }
        
    }
    
}
