package arrays;

public class arreglo {
    // maximo de elementos del arreglo
    // max debe ser igual al tamaño del arreglo menos 1
    public static int max = 19;
    public static char[] arreglos = new char[20];
    public static int N = -1;
    int i;
    public void llenarArreglo(char letra) {

        // llenar el array
        if (Character.isLetter(letra)) {

            if (N < max-1) {
                int posicion = 0;
                N++;
                arreglos[N] = letra;
                for (int k = 0; k < arreglos.length; k++)
                {
                    for (int f = 0; f < arreglos.length-1; f++)
                    {
                        if (arreglos[f] > arreglos[f+1])
                        {
                            char aux = arreglos[f];
                            arreglos[f] = arreglos[f+1];
                            arreglos[f+1] = aux;
                        }
                    }
                }
                for (int r = 0; r < arreglos.length; r++)
                {
                    for (int j = 0; j < arreglos.length-1; j++)
                    {
                        char aux1 = arreglos[j];
                        char aux2 = arreglos[j + 1];

                        if (aux1 >= 65 && aux1 <= 90)
                        {
                            aux1 = (char)(aux1 + 32);
                        }
                        if (aux2 >= 65 && aux2 <= 90)
                        {
                            aux2 = (char)(aux2 + 32);
                        }

                        if (aux1 > aux2)
                        {
                            char aux = arreglos[j];
                            arreglos[j] = arreglos[j + 1];
                            arreglos[j + 1] = aux;
                        }
                    }
                    for (int i = 0; i < arreglos.length; i++)
                    {
                        if (arreglos[i] == letra)
                        {
                            posicion = i;
                        }
                    }
                }
                System.out.println("Se inserto en la posicion: " + (posicion-(max-N)));
            } else {
                System.out.println("El arreglo esta lleno");
            }
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
                        System.out.println("La letra " + letra + " se encuentra en la posición " + (i-(max-N)));
                        inicio = 1;
                    }
                }
                if (inicio == 0) {
                    System.out.println("La letra " + letra + " no se encuentra en el arreglo");
                }
            }
            else {
                System.out.println("El arreglo esta vacio");
                System.out.println("\uD83D\uDE10");
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
                if (Character.isLetter(arreglos[i])) {
                    System.out.print(arreglos[i] + " ");
                }
            }
        }
        else {
            System.out.println("El arreglo esta vacio");
            System.out.println("\uD83D\uDE10");
        }
    }

    public int eliminarArreglo(char letra) {
        // eliminar el array
        int eli = 0;
        if (Character.isLetter(letra)) {
            if (N > -1) {
                for (int i = 0; i < arreglos.length; i++) {
                    if (arreglos[i] == letra) {
                        arreglos[i] = ' ';
                        N--;
                        eli = 1;
                    }
                }
                if (eli == 0) {
                    System.out.println("La letra " + letra + " no se encuentra en el arreglo");
                }
                else {
                    System.out.println("La letra " + letra + " se elimino del arreglo");
                }
            } else {
                System.out.println("El arreglo esta vacio");
                System.out.println("\uD83D\uDE10");
            }
        } else {
            System.out.println("No es una letra");
        }
        return eli;
    }

    public void modificarArreglo(char letra, char letra2) {
        //buscar un elemento en el array y reemplazarlo
        if (N > -1){
            int res = BuscarOrdenado(letra);
            if (res == 1) {
                int res2 = eliminarArreglo(letra);
                if (res2 == 1) {
                    llenarArreglo(letra2);
                    // mostrar el array ordenado
                    System.out.println("Array nuevo: ");
                    mostrarArreglo();
                }
            }
            else {
                System.out.println("No se puede modificar");
            }
        }
        else {
            System.out.println("El arreglo esta vacio");
            System.out.println("\uD83D\uDE10");
        }
    }
    public void creditos() {
        System.out.println("7. Créditos");
        System.out.println("Hecho por:");
        System.out.println("Jason Urbina Sotelo");
        System.out.println("Gael Emmanuel Acosta Serrano");
        System.out.println("Jose Angel Navarrete Valles");
        // among us en consola
        System.out.println("           __________");
        System.out.println("          /          |");
        System.out.println("     ____|   ______  |");
        System.out.println("    |    |  |      | |");
        System.out.println("    |    |   _____/  |");
        System.out.println("    |    |           |");
        System.out.println("     ¯¯¯¯|   _____   |");
        System.out.println("         |  |     |  |");
        System.out.println("         |  |     |  |");
        System.out.println("         |__|     |__|");
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
            System.out.println("\uD83D\uDE10");
            System.out.println("\uD83D\uDE10");
            System.out.println("\uD83D\uDE10");
            System.out.println("\uD83D\uDE10");
            System.out.println("\uD83D\uDE10");
        }
    }
}
