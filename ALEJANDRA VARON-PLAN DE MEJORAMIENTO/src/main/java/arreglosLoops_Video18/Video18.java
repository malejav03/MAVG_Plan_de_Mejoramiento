
package arreglosLoops_Video18;


public class Video18 {
    //array
    public static void main(String[] args) {
        int[] episodiosDuracionArray = new int []{30,32,27,31,60};
        
        int DuracionTemporada = 0;
        
        for (int value : episodiosDuracionArray ){
            DuracionTemporada +=value;
        }
        System.out.println(DuracionTemporada);
    }
    
}
