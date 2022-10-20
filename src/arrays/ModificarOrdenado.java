package arrays;

import java.util.Scanner;

public class ModificarOrdenado {
    public static void main(String[] args) {
        //importar el array del ejercicio anterior
        char[] array = InsertarOrdernado.arreglos;
        //buscar un elemento en el array y reemplazarlo
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce una letra: ");
            char letra = sc.next().charAt(0);
            System.out.print("Introduce otra letra: ");
            char letra2 = sc.next().charAt(0);
            for (int i = 0; i < array.length; i++) {
                if (array[i] == letra) {
                    array[i] = letra2;
                }
            }
            // mostrar el array ordenado
            System.out.println("Array nuevo");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
