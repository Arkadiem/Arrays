package arrays;

import javax.lang.model.type.NullType;

public class arreglo {
    // maximo de elementos del arreglo
    // max debe ser igual al tamaño del arreglo menos 1
    public static int max = 4;
    public static char[] caracters = new char[5];
    public static int N = -1;
    int i, j;
    public void llenarArreglo(char letra) {

        // llenar el array
        if (Character.isLetter(letra)) {
            if (N < max) {
                for (i = 0; i <= N;)
                {
                    if (conforden(letra) > conforden(caracters[i]))
                    {
                        i++;
                    }
                    else
                    {
                        break;
                    }
                }
                for (j = N; j >= i;)
                {
                    caracters[j + 1] = caracters[j];
                    j--;
                }
                caracters[i] = letra;
                N++;
                System.out.println("Se inserto en la posicion: " + i);
            } else {
                System.out.println("El arreglo esta lleno");
            }
        } else {
            System.out.println("No es una letra");
            i--;
        }
    }
    public int BuscarOrdenado(char letra) {
        int inicio = -1;
        if (Character.isLetter(letra)) {
            if (N > -1){
                for (int i = 0; i < caracters.length; i++) {
                    if (caracters[i] == letra) {
                        System.out.println("La letra " + letra + " se encuentra en la posición " + i);
                        inicio = i;
                    }
                }
                if (inicio == -1) {
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
            for (int i = 0; i < N+1; i++) {
                if (Character.isLetter(caracters[i])) {
                    System.out.print(caracters[i]);
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
                int res = BuscarOrdenado(letra);
                if (res == 0) {
                    System.out.println("La letra " + letra + " no se encuentra en el arreglo");
                }
                else {
                    for (int i = 0; i < caracters.length; i++) {
                        if (caracters[i] == letra) {
                            for (int j = i; j < caracters.length - 1; j++) {
                                caracters[j] = caracters[j + 1];
                            }
                            N--;
                            eli = 1;
                            break;
                        }
                    }
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
    public int eliminar_Arreglo(char letra){
        int eli = -1;
        if (Character.isLetter(letra)) {
            if (N > -1) {
                int res = BuscarOrdenado(letra);
                if (res == -1) {
                    System.out.println("La letra " + letra + " no se encuentra en el arreglo");
                }
                else {
                    for (int k = res; k <= N-1;) {
                        caracters[k] = caracters[k + 1];
                        k++;
                    }
                    N--;
                    eli = 1;
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
            if (res != -1) {
                int res2 = eliminar_Arreglo(letra);
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
    public double conforden(char letra) {
        double letranew;
        letranew = (byte) letra;

        if (letranew >= 97 && letranew <= 122)
            letranew = (letranew - 32) + 0.5;
        return letranew;
    }
}
