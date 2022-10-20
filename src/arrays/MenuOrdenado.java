package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuOrdenado {
    static char[] array = InsertarOrdernado.arreglos;
    public static void main(String[] args) {
                Scanner sn = new Scanner(System.in);
                String salmen = "s";
                boolean salir = false;
                boolean salirmenu = false;
                int opcion;


                while (!salir) {

                    System.out.println("1. Inicializar / Borrar arreglo");
                    System.out.println("2. Mostrar arreglo");
                    System.out.println("3. Buscar");
                    System.out.println("4. Insertar");
                    System.out.println("5. Eliminar");
                    System.out.println("6. Modificar");
                    System.out.println("7. Créditos");
                    System.out.println("8. Salir");

                    try {

                        System.out.println("Ingresa el numero de la opcion que deseas hacer");
                        opcion = sn.nextInt();

                        switch (opcion) {
                            case 1:

                                do {
                                    System.out.println("1. Inicializar / Borrar arreglo");

                                    System.out.println("¿Has terminado de realizar todas tus operaciones? s/n");
                                    salmen = sn.next();
                                    if (salmen.equals("s") ){
                                        salirmenu = true;
                                    }

                                    else if (salmen.equals("n") ) {
                                        salirmenu = false;
                                    }
                                } while (!salirmenu);

                                break;
                            case 2:
                                // mostrar el array ordenado

                                do {
                                    System.out.println("2. Mostrar arreglo");
                                    for (int i = 0; i < array.length; i++) {
                                        System.out.print(array[i] + " ");
                                    }

                                    System.out.println("¿Has terminado de realizar todas tus operaciones? s/n");
                                    salmen = sn.next();
                                    if (salmen.equals("s") ){
                                        salirmenu = true;
                                    }

                                    else if (salmen.equals("n") ) {
                                        salirmenu = false;
                                    }
                                } while (!salirmenu);

                                break;
                            case 3:
                                do {
                                    System.out.println("3. Buscar");

                                    System.out.println("¿Has terminado de realizar todas tus operaciones? s/n");
                                    salmen = sn.next();
                                    if (salmen.equals("s") ){
                                        salirmenu = true;
                                    }

                                    else if (salmen.equals("n") ) {
                                        salirmenu = false;
                                    }
                                } while (!salirmenu);


                                break;
                            case 4:

                                do {
                                    System.out.println("4. Insertar");
                                    char letra;
                                    System.out.println("Ingresa la letra que deseas insertar");
                                    letra = sn.next().charAt(0);
                                    InsertarOrdernado insertar = new InsertarOrdernado();
                                    insertar.llenarArreglo(letra);
                                    System.out.println("¿Has terminado de realizar todas tus operaciones? s/n");
                                    salmen = sn.next();
                                    if (salmen.equals("s") ){
                                        salirmenu = true;
                                    }

                                    else if (salmen.equals("n") ) {
                                        salirmenu = false;
                                    }
                                } while (!salirmenu);

                                break;
                            case 5:
                                do {
                                    System.out.println("5. Eliminar");

                                    System.out.println("¿Has terminado de realizar todas tus operaciones? s/n");
                                    salmen = sn.next();
                                    if (salmen.equals("s") ){
                                        salirmenu = true;
                                    }

                                    else if (salmen.equals("n") ) {
                                        salirmenu = false;
                                    }
                                } while (!salirmenu);
                                break;
                            case 6:
                                do {
                                    System.out.println("6. Modificar");

                                    System.out.println("¿Has terminado de realizar todas tus operaciones? s/n");
                                    salmen = sn.next();
                                    if (salmen.equals("s") ){
                                        salirmenu = true;
                                    }

                                    else if (salmen.equals("n") ) {
                                        salirmenu = false;
                                    }
                                } while (!salirmenu);
                                break;
                            case 7:
                                do {
                                    System.out.println("7. Créditos");
                                    System.out.println("Hecho por:");
                                    System.out.println("Jason Urbina Sotelo");
                                    System.out.println("Gael Emmanuel Acosta Serrano");
                                    System.out.println("Jose Angel Navarrete Valles");
                                    System.out.println("¿Has terminado de realizar todas tus operaciones? s/n");
                                    salmen = sn.next();
                                    if (salmen.equals("s") ){
                                        salirmenu = true;
                                    }

                                    else if (salmen.equals("n") ) {
                                        salirmenu = false;
                                    }
                                } while (!salirmenu);
                                break;
                            case 8:
                                salir = true;
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 8");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Debes insertar un número");
                        sn.next();
                    }
                }

    }
}