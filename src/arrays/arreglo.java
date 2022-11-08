package arrays;

public class arreglo {
    // maximo de elementos del arreglo
    // max debe ser igual al tamaño del arreglo menos 1
    public static int max = 19;
    public static char[] caracters = new char[20];
    public static int N = -1;
    int i;
    public void llenarArreglo(char letra) {

        // llenar el array
        if (Character.isLetter(letra)) {

            if (N < max) {
                int pos = 0;
                N++;
                caracters[i] = letra;
                for (int k = 0; k < caracters.length; k++)
                {
                    for (int f = 0; f < caracters.length-1; f++)
                    {
                        if (caracters[f] > caracters[f+1])
                        {
                            char aux = caracters[f];
                            caracters[f] = caracters[f+1];
                            caracters[f+1] = aux;
                        }
                    }
                }
                for (int r = 0; r < caracters.length; r++)
                {
                    for (int j = 0; j < caracters.length-1; j++)
                    {
                        char charx = caracters[j];
                        char chary = caracters[j + 1];

                        if (charx >= 65 && charx <= 90)
                        {
                            charx = (char)(charx + 32);
                        }
                        if (chary >= 65 && chary <= 90)
                        {
                            chary = (char)(chary + 32);
                        }

                        if (charx > chary)
                        {
                            char auxin = caracters[j];
                            caracters[j] = caracters[j + 1];
                            caracters[j + 1] = auxin;
                        }
                    }
                    for (int i = 0; i < caracters.length; i++)
                    {
                        if (caracters[i] == letra)
                        {
                            pos = i;
                        }
                    }
                }
                System.out.println("Se inserto en la posicion: " + (pos-(max-N)));
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
                for (int i = 0; i < caracters.length; i++) {
                    if (caracters[i] == letra) {
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
            for (int i = 0; i < caracters.length; i++) {
                if (Character.isLetter(caracters[i])) {
                    System.out.print(caracters[i] + " ");
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
                for (int i = 0; i < caracters.length; i++) {
                    if (caracters[i] == letra) {
                        caracters[i] = ' ';
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
            for (int i = 0; i < caracters.length; i++) {
                caracters[i] = ' ';
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
