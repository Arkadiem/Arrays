package arrays;

import java.util.Scanner;

public class arreglo {
    public static char[] arreglos = new char[3];
    public static int N = -1;
    public static int max = 2;
    Scanner sc = new Scanner(System.in);
    int i, j;
    public void llenarArreglo(char letra) {
        // llenar el array
        if (Character.isLetter(letra)) {
            if (N < max) {
                arreglos[i] = letra;
                N++;
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
            } else {
                System.out.println("El arreglo esta lleno");
            }
            System.out.println("max = "+max);
            System.out.println("contador = "+N);
        } else {
            System.out.println("No es una letra");
            i--;
        }
    }
    public int BuscarOrdenado(char letra) {
        int inicio = 0;
        if (Character.isLetter(letra)) {
            if (N > -1){
                for (int i = 0; i < arreglos.length; i++) {
                    if (arreglos[i] == letra) {
                        System.out.println("La letra " + letra + " se encuentra en la posición " + i);
                        inicio = 1;
                    }
                }
                if (inicio == 0) {
                    System.out.println("La letra " + letra + " no se encuentra en el arreglo");
                }
            }
        } else {
            System.out.println("No es una letra");
        }
        return inicio;
    }

    public void mostrarArreglo() {
        // mostrar el array ordenado
        if (N > -1) {
            for (int i = 0; i < arreglos.length; i++) {
                System.out.print(arreglos[i] + " ");
            }
        }
        else {
            System.out.println("El arreglo esta vacio");
        }
    }

    public void eliminarArreglo(char letra) {
        // eliminar el array
        if (Character.isLetter(letra)) {
            if (N > -1) {
                for (int i = 0; i < arreglos.length; i++) {
                    if (arreglos[i] == letra) {
                        arreglos[i] = ' ';
                        N--;
                    }
                }
            } else {
                System.out.println("El arreglo esta vacio");
            }
        } else {
            System.out.println("No es una letra");
        }
    }

    public void modificarArreglo(char letra, char letra2) {
        //buscar un elemento en el array y reemplazarlo
        try {
            int res = BuscarOrdenado(letra);
            if (res == 1 || N > -1) {
                eliminarArreglo(letra);
                llenarArreglo(letra2);
                // mostrar el array ordenado
                System.out.println("Array nuevo");
                mostrarArreglo();
            }
            else {
                System.out.println("No se puede modificar");
            }
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
        if (N > -1){
            for (int i = 0; i < arreglos.length; i++) {
                arreglos[i] = ' ';
            }
            N = -1;
            System.out.println("arreglo borrado");
        }
        else {
            System.out.println("El arreglo ya esta vacio");
            System.out.println("'_'");
            System.out.println("'_'");
            System.out.println("'_'");
            System.out.println("'_'");
        }
    }
}
