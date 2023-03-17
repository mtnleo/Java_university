import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Character continuar = 'y';
        Scanner scan = new Scanner(System.in);

        while(continuar == 'y') {

            System.out.println("Escriba el ejercicio que quieras realizar:");

            int ejercicio = scan.nextInt();

            switch(ejercicio) {
                case 1: // lea una variable entera mes y compruebe si el valor corresponde a un mes de 30, 31 o 28 d´ıas. Se mostrar´a adem´as el nombre del mes. Se debe comprobar que el valor introducido est´e comprendido entre 1 y 12.
                    System.out.println("Ejercicio 1.\n");

                    System.out.println("Ingrese el numero de un mes que quiera saber su cantidad de dias: ");

                    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
                    int mes = scan.nextInt();
                    int dias;

                    if(mes < 1 || mes > 12) {
                        System.out.println("Mes invalido.");
                        break; // que no siga el code
                    }    
                    else if (mes < 8) {
                        if (mes == 2) {
                            dias = 28;
                        }
                        else {
                            if (mes % 2 == 0) {
                                dias = 30;
                            } else {
                                dias = 31;
                            }
                        }

                    } 
                    else { 
                        if (mes % 2 == 0) {
                            dias = 31;
                        } else {
                            dias = 30;
                        }
                    }

                    System.out.println(meses[mes-1] + " contiene " + dias + " dias.");

                    break;

                case 2: // muestre los numeros del 1 al 100 utilizandola instruccion while
                    System.out.println("Ejercicio 2.\n");

                    System.out.println("Numeros del 1 al 100 (while): ");

                    int i = 0;

                    while (i < 100) {
                        System.out.println((i + 1));
                        i++;
                    }

                    break;

                case 3: // muestre los n´umeros del 1 al 100 utilizando la instruccion do-while.
                    System.out.println("Ejercicio 3.\n");

                    System.out.println("Numeros del 1 al 100 (do-while): ");

                    int j = 0;

                    do  {
                        System.out.println((j + 1));
                        j++;
                    } while (j < 100);

                    break;

                case 4: // muestre los numeros del 1 al 100 utilizando la instruccion for en sus dos formas.
                    System.out.println("Ejercicio 4. \n");

                    System.out.println("Numeros del 1 al 100 (for): ");
                    int[] arr_nums = new int[100]; // llenar el arreglo para el for each

                    for(int k = 0; k < 100; k++) {
                        System.out.println((k + 1));
                        arr_nums[k] = k+1;
                    }

                    System.out.println("Numeros del 1 al 100 (for each): ");

                    for(int l: arr_nums) {
                        System.out.println(l);
                    }

                    break;

                case 5: // Contar el numero de elementos positivos, negativos y ceros en un array de 10 enteros.
                    System.out.println("Ejercicio 5. \n");

                    int positivos = 0;
                    int negativos = 0;
                    int ceros = 0;

                    int[] arr_int = {0, -3, -4, 7, 0, 2, 4, -1, 0, 9};

                    for (int i5 = 0; i5 < 10; i5++) {
                        if (arr_int[i5] == 0) {
                            ceros++;
                        }
                        else if (arr_int[i5] > 0) {
                            positivos++;
                        }
                        else {
                            negativos++;
                        }
                    }

                    System.out.println("Hay " + ceros + " ceros; " + positivos + " positivos; " + negativos + " negativos.");

                    break;

                case 6: // Llenar un array con numeros aleatorios
                    System.out.println("Ejercicio 6. \n");

                    int[] aleatorios = new int[10];

                    int max = 100;
                    int min = 1;
                    int range = max - min + 1;

                    for (int i6 = 0; i6 < 10; i6++) {
                        aleatorios[i6] = (int)(Math.random() * range) + min;
                    }

                    for (int i6 = 0; i6 < 10; i6++) {
                        System.out.println(aleatorios[i6]);;
                    }

                    break;

                case 7: // Guardar en un array los 20 primeros numeros pares
                    System.out.println("Ejercicio 7. \n");

                    int[] pares = new int[10];

                    for(int i7 = 1; i7 < 10; i7++) {
                        pares[i7] = i7 * 2;
                    }

                    System.out.println("Primeros 20 numeros pares ->");
                    for (int par: pares) {
                        System.out.println(par);
                    }

                    break;

                case 8: // Calcular la altura media de los alumnos de una clase.
                    System.out.println("Ejercicio 8.\n");

                    Float[] altura = {1.92f, 1.83f, 1.65f, 1.78f, 1.59f, 1.76f, 1.90f, 1.50f, 1.65f, 1.68f};

                    Float suma_altura = 0.0f;

                    for (Float alumno: altura) {
                        suma_altura += alumno;
                    }

                    Float promedio_altura = suma_altura / 10;

                    System.out.println("El promedio de altura es de " + promedio_altura);

                    break;

                case 9: //  Leer numeros por teclado hasta introducir -99. Calcular la suma, la media y cuantos son mayores que la media.
                    System.out.println("Ejercicio 9.\n");

                    ArrayList<Integer> numeros_inf = new ArrayList<Integer>(); // Tenemos que usar un arraylist porque no sabemos el largo del Arreglo
                    int numero = 0;

                    while (numero != -99) {
                        System.out.println("Escriba un numero o -99 para salir: ");
                        numero = scan.nextInt();

                        if (numero != -99) {
                            numeros_inf.add(numero);
                        }
                    }

                    System.out.println("ArrayList luego de llenarlo: " + numeros_inf);

                    break;

                case 10: // Rotar los elementos de un ArrayList.
                    System.out.println("Ejercicio 10");

                    ArrayList<String> rotar_arrlist = new ArrayList<String>();

                    rotar_arrlist.add("Primero");
                    rotar_arrlist.add("Segundo");
                    rotar_arrlist.add("Tercer");
                    rotar_arrlist.add("Cuarto");
                    rotar_arrlist.add("Quinto");
                    rotar_arrlist.add("Ultimo");

                    int i10 = 0;

                    String aux;

                    while(i10 < rotar_arrlist.size() / 2) {
                        aux = rotar_arrlist.get(i10);
                        rotar_arrlist.set(i10, rotar_arrlist.get(rotar_arrlist.size() - 1 - i10));
                        rotar_arrlist.set(rotar_arrlist.size() - 1 - i10, aux);

                        i10++;
                    }

                    System.out.println("ArrayList tras rotarlo: " + rotar_arrlist);

                    break;

                /// DEFAULT ------------------------------
                default:
                    System.out.println("|X| EJERCICIO INVALIDO |X|\n");

                    break;

            }

            System.out.println("Desea seguir viendo ejercicios? ('y'/'n')");
            String respuesta = scan.next();
            continuar = respuesta.charAt(0);

        }

        scan.close();

    }
}


