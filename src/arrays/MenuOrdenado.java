package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuOrdenado {
    public static void main(String[] args) {
                arreglo operaciones = new arreglo();
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
                                    operaciones.borrarArreglo();
                                    System.out.println("arreglo borrado");
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
                                    operaciones.mostrarArreglo();
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
                                    System.out.println("Ingresa la letra que deseas buscar");
                                    char letra = sn.next().charAt(0);
                                    operaciones.BuscarOrdenado(letra);
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
                                    operaciones.llenarArreglo(letra);
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
                                    System.out.println("Ingresa la letra que deseas eliminar");
                                    char letra = sn.next().charAt(0);
                                    operaciones.eliminarArreglo(letra);
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
                                    System.out.print("Introduce la letra que desea reemplazar: ");
                                    char letra = sn.next().charAt(0);
                                    System.out.print("Introduce la letra con la que se desea reemplazar: ");
                                    char letra2 = sn.next().charAt(0);
                                    operaciones.modificarArreglo(letra, letra2);
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
                                    operaciones.creditos();
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