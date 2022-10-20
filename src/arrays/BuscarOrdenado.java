package arrays;

import java.util.Scanner;

public class BuscarOrdenado {
    Scanner sc = new Scanner(System.in);
    //importar el array del ejercicio anterior
    int i = 0;
    public static char[] array = arreglo.arreglo();
    public void BuscarOrdenado(char letra) {
            while (i < array.length && array[i] != letra) {
                i++;
            }
            if (i < array.length) {
                System.out.println("La letra " + letra + " está en la posición " + i);
            } else {
                System.out.println("La letra " + letra + " no está en el array");
            }
    }
}
