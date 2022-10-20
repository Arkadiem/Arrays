package arrays;

import java.util.Scanner;

public class ModificarOrdenado {
    public static char[] array = arreglo.arreglo();

    public void modificar(char letra, char letra2) {
        //importar el array del ejercicio anterior
        //buscar un elemento en el array y reemplazarlo
        Scanner sc = new Scanner(System.in);
        try {

            for (int i = 0; i < array.length; i++) {
                if (array[i] == letra) {
                    array[i] = letra2;
                }
            }

            // ordenar el array
            for (int r = 0; r < array.length; r++)
            {
                for (int j = 0; j < array.length - 1; j++)
                {
                    char charX = array[j];
                    char charY = array[j + 1];
                    if (charX >=65 && charX <= 90 )
                    {
                        charX = (char)(charX + 32);
                    }
                    if (charY >= 65 && charY <= 90)
                    {
                        charY = (char)(charY + 32);
                    }
                    if (charX > charY)
                    {
                        char aux = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = aux;
                    }
                }
            }

            // mostrar el array ordenado
            System.out.println("Array nuevo");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
