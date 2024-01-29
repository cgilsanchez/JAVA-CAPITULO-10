import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
ArrayList <Integer> numerosAleatorios = new ArrayList<Integer>(); 

        int suma = 0;
        int minimo = 100;
        int maximo = 0;
        int longitudArray = (int)(Math.random()*10+11);

        for(int i = 0 ; i < longitudArray ; i++){
            numerosAleatorios.add((int)(Math.random()*101));
            System.out.print(numerosAleatorios.get(i) + " ");
        }


        for(int n : numerosAleatorios) {
            suma += n;
        
            if(n < minimo) {
                minimo = n;
            }
            
            if(n > maximo) {
                maximo = n;
            }
        }

    System.out.println("\nLa suma total es : " + suma);
    System.out.println("La media es : " + suma / longitudArray);
    System.out.println("El mínimo es : " + minimo);
    System.out.println("El máximo es : " + maximo);


    }
}
