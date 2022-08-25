
package ciclosDoWhile_Video13;


public class Video13 {
    //ciclos usando Do-while
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
        System.out.println("\n-----------------");
        
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
        System.out.println("\n------ Ciclo con Do-While ---------");
        
        /**
        * es un similar al while en este caso la operacion 
        * se hace en el do hasta q se cumpla pasa al while
        * en caso de while al entrar si no cumple la condicion
        * no se ejecuuta en este caso si asi sea una vez
        **/
        int k = 0;
        do {
            if (k < 3 ){
                System.out.println("Reproduciendo intro, segundo = "+k);
            }else if(k < 7 ){
                System.out.println("Reproduciendo pelicula, segundo = "+k);
            }else{
                System.out.println("Reproduciendo creditos, segundo = "+k);
            }
        } while (k <= duracion);
    }
    
}
