import java.util.Scanner;


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

                /// DEFAULT
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


