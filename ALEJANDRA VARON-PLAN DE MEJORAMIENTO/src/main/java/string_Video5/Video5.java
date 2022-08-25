
package string_Video5;



public class Video5 {
    
    public static void main(String[] args) {
        //variable tipo caracter
        String saludo = "¡Hola mundo soy un programaddor Java!";
        //variable para vlores de numero entero
        int longitud = saludo.length();
        //sirve para almacenar un valor o caracter
        char myChar = saludo.charAt(2);
        //sirve para validar
        boolean stringVacio = saludo.isEmpty();
        boolean containsString = saludo.contains("prog");
        //sirve para imprimir valores salteados
        String subString = saludo.substring(2,7);
        //sirve para reemplazar
        String newString = saludo.replace("o", "5");
        
        System.out.println(saludo + longitud +"\n "+ myChar +"\n"+ containsString +"\n"+ subString +"\n "+ newString );
        int edad=25;
        
        System.out.println("Mi edad Es: "+edad);
        
        float altura = 1.70f;
        System.out.println("Mi altura es: "+altura);
        
        double valorPi= 3.141597465837463512;
        System.out.println("El valor de pi es: "+valorPi);
        
        long distanciaAlSol = 471628376481726846L;
        System.out.println("La distancia del sol es: "+distanciaAlSol);
        
        boolean isDay= false;
        System.out.println("Es de dia: "+isDay);
        
        char miINICIAl = 'J';
        System.out.println("La inicial de mi nombre es: "+miINICIAl);
        
    }

   
    
}
