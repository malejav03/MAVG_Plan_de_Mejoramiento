
package if_elseMultiples_video10;



public class Video10 {
    //tema del videoif-else con multiples condicionales
    
    public static void main(String[] args) {
        
        int TotalEpisodios = 15;
        
        System.out.println("\n------ Ciclo con If-else ---------");
        
        //if y else comprobacion
        if (TotalEpisodios >1 && TotalEpisodios <= 10){
            System.out.println("Es una mini Serie");
        }else if(TotalEpisodios >10){
            System.out.println("Es una Serie");            
        }else if(TotalEpisodios ==1){
            System.out.println("Es una Pelicula");            
        }else{
            System.out.println("Debe tener al menos un episodio");
        }
        
    }
    
}
