package arrays;

import java.util.Scanner;

public class arreglo {
    public static char[] arreglos = new char[10];
    Scanner sc = new Scanner(System.in);
    int i, j;
    public void llenarArreglo(char letra) {
        // llenar el array
        if (Character.isLetter(letra)) {
            arreglos[i] = letra;
        } else {
            System.out.println("No es una letra");
            i--;
        }
        // ordenar el array
        for (int r = 0; r < arreglos.length; r++)
        {
            for (    j = 0; j < arreglos.length - 1; j++)
            {
                char charX = arreglos[j];
                char charY = arreglos[j + 1];
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
                    char aux = arreglos[j];
                    arreglos[j] = arreglos[j + 1];
                    arreglos[j + 1] = aux;
                }
            }
        }
    }
    public void BuscarOrdenado(char letra) {
        while (i < arreglos.length && arreglos[i] != letra) {
            i++;
        }
        if (i < arreglos.length) {
            System.out.println("La letra " + letra + " está en la posición " + i);
        } else {
            System.out.println("La letra " + letra + " no está en el array");
        }
    }

    public void mostrarArreglo() {
        // mostrar el array ordenado
        for (int i = 0; i < arreglos.length; i++) {
            System.out.print(arreglos[i] + " ");
        }
    }

    public void eliminarArreglo(char letra) {
        // eliminar el array
        for (int i = 0; i < arreglos.length; i++) {
            if (arreglos[i] == letra) {
                arreglos[i] = ' ';
            }
        }
    }

    public void modificarArreglo(char letra, char letra2) {
        //buscar un elemento en el array y reemplazarlo
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i < arreglos.length; i++) {
                if (arreglos[i] == letra) {
                    arreglos[i] = letra2;
                }
            }

            // ordenar el array
            for (int r = 0; r < arreglos.length; r++)
            {
                for (int j = 0; j < arreglos.length - 1; j++)
                {
                    char charX = arreglos[j];
                    char charY = arreglos[j + 1];
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
                        char aux = arreglos[j];
                        arreglos[j] = arreglos[j + 1];
                        arreglos[j + 1] = aux;
                    }
                }
            }

            // mostrar el array ordenado
            System.out.println("Array nuevo");
            mostrarArreglo();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void creditos() {
        System.out.println("7. Créditos");
        System.out.println("Hecho por:");
        System.out.println("Jason Urbina Sotelo");
        System.out.println("Gael Emmanuel Acosta Serrano");
        System.out.println("Jose Angel Navarrete Valles");
    }

    public void borrarArreglo() {
        // borrar el array
        for (int i = 0; i < arreglos.length; i++) {
            arreglos[i] = ' ';
        }
    }
}
