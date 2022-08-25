
package Videos24_31;

//metodos y variables staticas
//La clase se llama movieDeVideo25

public class Video31 {
    
    public static void main(String[] args) {
        //llamar a la clase 
        //aca se esta utilizando el metodo constructor
        movieDeVideo25 StivenFuture = new movieDeVideo25();
        movieDeVideo25 toyStory = new movieDeVideo25(" Toy Story"," Familiar",90);
        movieDeVideo25 StarWars = new movieDeVideo25(" Star Wars"," Ciencia Ficcion",180);
        
        //metodo estatico
        int totalFrames = movieDeVideo25.getTotalFrames(90);
        System.out.println(totalFrames);
        
        int frameResolution = movieDeVideo25.FRAME_RESOLUTION;
    }
    
}
