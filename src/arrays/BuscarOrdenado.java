package arrays;

import java.util.Scanner;

public class BuscarOrdenado {
    public static void main(String[] args) {
        //importar el array del ejercicio anterior
        char[] array = InsertarOrdernado.array;
        //buscar un elemento en el array
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce una letra: ");
            char letra = sc.next().charAt(0);
            int i = 0;
            while (i < array.length && array[i] != letra) {
                i++;
            }
            if (i < array.length) {
                System.out.println("La letra " + letra + " está en la posición " + i);
            } else {
                System.out.println("La letra " + letra + " no está en el array");
            }
        } catch (Exception e) {
            System.out.println("No es una letra o el arreglo está vacío");
        }
    }
}
