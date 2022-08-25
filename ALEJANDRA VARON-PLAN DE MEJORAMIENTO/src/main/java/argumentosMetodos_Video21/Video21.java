
package argumentosMetodos_Video21;


public class Video21 {
    
    public static void main(String[] args) {
        
        String [] tituloArray = new String []{"La naranja mecanica","Buscando a nemo","Mision imposible","Star Wars","Troya","Yo robot", "Ip Man"};
        
        
        play(tituloArray,10);
        System.out.println("");
        pausa();
    }    
    
    public static void play(String[] tituloArray, int index){
        if (index < tituloArray.length ) { 
            String titulo = tituloArray [index];
            
            for (int i = 0; i < 10; i++){
                System.out.println("Rodando la pelicula"+titulo);
            }
        }else{
            System.out.println("indice muy grande");
        }
    }
    public static void pausa() {
        System.out.println("Pelicula pausada"); 
    }     
}
