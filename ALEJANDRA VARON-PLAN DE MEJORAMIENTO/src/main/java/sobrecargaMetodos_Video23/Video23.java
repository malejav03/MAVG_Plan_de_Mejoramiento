
package sobrecargaMetodos_Video23;

import java.util.Random;


public class Video23 {
    
    public static void main(String[] args) {
        String [] tituloArray = new String []{"La naranja mecanica","Buscando a nemo","Mision imposible","Star Wars","Troya","Yo robot", "Ip Man"};
        
        String titulo = play(tituloArray,3);
        String titulo2 = play(tituloArray);
        System.out.println("");
        pausa(titulo);
        System.out.println("");
        pausa(titulo2);
    }    
    public static String play(String[] tituloArray, int index){
        if (index < tituloArray.length ) { 
            String titulo = tituloArray [index];
            
            for (int i = 0; i < 10; i++){
                System.out.println("Rodando la pelicula"+titulo);
            }
            return titulo;
        }else{
            System.out.println("indice muy grande");
            return "";
        }
    }
    //metodo sobre cargado
    public static String play(String[] tituloArray) {
     Random random = new Random();
     int index = random.nextInt(tituloArray.length - 1);
     
     String titulo = tituloArray [index];
           
        for (int i = 0; i < 10; i++){
            System.out.println("Rodando la pelicula"+titulo);    
        }
        return titulo;    
    }
    
    public static void pausa(String titulo) {
        if (titulo.isEmpty()){
            System.out.println("Pelicula no reproduce");
        }else{
            System.out.println("Pelicula pausada"+titulo);
        } 
    }
    
}
