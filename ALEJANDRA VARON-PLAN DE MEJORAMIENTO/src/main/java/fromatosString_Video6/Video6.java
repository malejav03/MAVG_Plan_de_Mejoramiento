
package fromatosString_Video6;


public class Video6 {
    
    public static void main(String[] args) {
        
        int edad=25;
        float altura = 1.70f;
        double valorPi= 3.141597465837463512;
        long distanciaAlSol = 471628376481726846L;
        boolean isDay= false;
        char miINICIAl = 'J';
        
        System.out.println(String.format("Mi edad Es %d %d ", edad,distanciaAlSol ));
        System.out.println("Mi altura es "+altura);
        System.out.println(String.format("mi altura es %.15f",valorPi));
        
        
    }
    
}
