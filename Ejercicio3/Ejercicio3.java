package Ejercicio3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        ArrayList <Integer> numeros = new ArrayList <Integer>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 10 ; i++){
            System.out.println("INtrdoduzca un numero");
            numeros.add(sc.nextInt());
        }

        sc.close();

        Collections.sort(numeros);

        for(int i = 0 ; i < 10 ; i++){
            System.out.println(numeros.get(i) + " ");
        }
    

    }
}
