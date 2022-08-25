
package ciclosFor_Video12;



public class Video12 {
    //ciclos con for 
    public static void main(String[] args) {
        int TotalEpisodios = 15;
        
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
        
        //iniciamos ciclo while es para hacer tareas repetitivas
        int i = 0;
        int duracion = 10;
        
        while (i <= duracion) {
            if (i <3 ){
                System.out.println("Reproduciendo intro, segundo = "+i);
            }else if(i < 7 ){
                System.out.println("Reproduciendo pelicula, segundo = "+i);
            }else{
                System.out.println("Reproduciendo creditos, segundo = "+i);
            }
            i++;            
        }
        System.out.println("\n------ Ciclo con for ---------");
        
        //tiene similitud con while
        //ciclo para que se cumpla las condicion deltro de los corchete
        for (int j = 0; j <= duracion ; j++){
            if (j < 3 ){
                System.out.println("Reproduciendo intro, segundo = "+j);
            }else if(j < 7 ){
                System.out.println("Reproduciendo pelicula, segundo = "+j);
            }else{
                System.out.println("Reproduciendo creditos, segundo = "+j);
            }        
        }       
    }    
}
