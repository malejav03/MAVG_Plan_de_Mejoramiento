
package Videos24_31;

//esto es una clase usada en los videos 24,25,26,27,28,29,30,31
public class movieDeVideo25 {
    
    static final int FRAME_RESOLUTION = 60;
    static final int SECONDS_IN_A_MINUTE = 60;
    
    String titulo;
    String genero;
    int duracion;
    
    //este es utilizado en el metodo statico en el main
    public static int getTotalFrames (int duracion){
        return duracion * SECONDS_IN_A_MINUTE *  FRAME_RESOLUTION;
    }
    
    //metodos contructor
    public movieDeVideo25(String titulo, String genero) {
        this.titulo = titulo; //constructor con dos datos
        this.genero = genero;
        this.duracion = 0;
    }

    public movieDeVideo25(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    
    public movieDeVideo25() {//constructor vacio
        this.titulo = "No tiene titulo";
        this.genero = "No tiene genero";
        this.duracion = 0;
    }
    //metodos get y set
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    //aca se pasaron los metodos del main
    public void play(){
        System.out.println("Rodando la pelicula: "+titulo);
    }
    
    public void pausa(){
        System.out.println("Pausada la pelicula: "+titulo);
    }
    
    /*este es utilizado en el metodo statico en el main 
    public int getTotalFrames (int duracion){
        return duracion * 60 * 60;
    } *este se utilizo en los anteriosres videos se deja recorcar como se usa */

    @Override//se usa en el metodo toString
    public String toString() {
        return "La pelicula es: " + titulo + ", y the genero es " + genero + ", y la duracion es " + duracion;
    }
    
    
    
}
