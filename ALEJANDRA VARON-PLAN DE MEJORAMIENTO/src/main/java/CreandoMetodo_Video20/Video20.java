
package CreandoMetodo_Video20;


public class Video20 {
    //creando un metodo
    public static void main(String[] args) {
        reproducirPelicula();
        System.out.println("");
        pausa();
    }
    
    public static void reproducirPelicula() {
        for (int i = 0; i < 10; i++){
            System.out.println("Reproduciendo pelicula...");
        }
    }
    
    public static void pausa() {
        System.out.println("Pelicula pausada");
    }
}
