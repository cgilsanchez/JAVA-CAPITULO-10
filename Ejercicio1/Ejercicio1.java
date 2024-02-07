package Ejercicio1;
import java.util.ArrayList;

public class Ejercicio1{
    public static void main(String[] args) {
        ArrayList <String> nombreClase = new ArrayList<String>(); 

        nombreClase.add("Antonio");
        nombreClase.add("Dani");
        nombreClase.add("Carlos");
        nombreClase.add("Javi");
        nombreClase.add("Pablo");
        nombreClase.add("Adrian");

        for(String nombres: nombreClase){
            System.out.println(nombres);
        }
    }
}