package arrays;

import java.util.Scanner;

public class InsertarOrdernado{
    public static char[] arreglos = arreglo.arreglo();
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
}
