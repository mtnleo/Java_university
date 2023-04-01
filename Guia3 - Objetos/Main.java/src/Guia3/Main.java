package Guia3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char continuar = 'y';
        Scanner scan = new Scanner(System.in);

        while (continuar == 'y') {

            System.out.println("Escriba el ejercicio que quieras realizar:");

            int ejercicio = scan.nextInt();

            switch (ejercicio) {
                case 1:
                    System.out.println("Ejercicio 1.");

                    Cilindro cil1 = new Cilindro();
                    cil1.MostrarDatosCilindro();

                    Cilindro cil2 = new Cilindro(9, "Negro", 12);
                    cil2.MostrarDatosCilindro();

                    System.out.println("Area Cilindro: " + cil2.CalcularArea());

                    break;

                case 2:
                    System.out.println("Ejercicio 2.");

                    //Instanciando con ayuda de Chat-GPT para los nombres

                    // Instanciar la clase Staff con 4 personas random
                    Staff staff1 = new Staff(12345678, "John", "Doe", "johndoe@example.com", "123 Main St", 2000, "Mañana");
                    Staff staff2 = new Staff(23456789, "Jane", "Smith", "janesmith@example.com", "456 Oak St", 3000, "Tarde");
                    Staff staff3 = new Staff(34567890, "Mike", "Johnson", "mikejohnson@example.com", "789 Maple St", 2500, "Noche");
                    Staff staff4 = new Staff(45678901, "Karen", "Williams", "karenwilliams@example.com", "321 Pine St", 4000, "Mañana");

                    // Instanciar la clase Estudiante con 4 personas random
                    Estudiante estudiante1 = new Estudiante(11111111, "Mark", "Garcia", "markgarcia@example.com", "555 Elm St", 2020, 1500, "Informática");
                    Estudiante estudiante2 = new Estudiante(22222222, "Emily", "Martinez", "emilymartinez@example.com", "777 Cedar St", 2021, 1700, "Ingeniería Civil");
                    Estudiante estudiante3 = new Estudiante(33333333, "David", "Lopez", "davidlopez@example.com", "999 Walnut St", 2022, 1900, "Medicina");
                    Estudiante estudiante4 = new Estudiante(44444444, "Ashley", "Ramirez", "ashleyramirez@example.com", "123 Cherry St", 2019, 1300, "Derecho");

                    // Arreglo

                    Persona[] arr_personas = new Persona[8];

                    arr_personas[0] = estudiante1;
                    arr_personas[1] = estudiante2;
                    arr_personas[2] = estudiante3;
                    arr_personas[3] = estudiante4;
                    arr_personas[4] = staff1;
                    arr_personas[5] = staff2;
                    arr_personas[6] = staff3;
                    arr_personas[7] = staff4;

                    double total_ingreso = 0;

                    for (Persona per: arr_personas) {
                        per.Mostrar();
                        if (per instanceof Estudiante) {
                            Estudiante est = (Estudiante) per;
                            total_ingreso += est.getCuota_mensual();
                        }
                    }

                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("El ingreso total de la cuota de los estudiantes es de: " + total_ingreso);

                    break;

                case 3:
                    System.out.println("Ejercicio 3.");

                    // Instanciar Objetos

                    Rectangulo rect1 = new Rectangulo("Violeta Pastel", 9, 12);
                    Rectangulo rect2 = new Rectangulo();

                    CirculoFig circ1 = new CirculoFig("Aquamarine", 2);
                    CirculoFig circ2 = new CirculoFig();

                    Cuadrado cuad1 = new Cuadrado("Verde Musgo", 5);
                    Cuadrado cuad2 = new Cuadrado();

                    // Mostrar Objetos

                    System.out.println("\n----------------- Rectangulos. -----------------");

                    rect1.Mostrar();
                    rect2.Mostrar();

                    System.out.println("\n----------------- Circulos. -----------------");

                    circ1.Mostrar();
                    circ2.Mostrar();

                    System.out.println("\n----------------- Cuadrados. -----------------");

                    cuad1.Mostrar();
                    cuad2.Mostrar();


                    break;

                default:
                    System.out.println("|X| Escriba un numero de ejercicio valido |X|.\n");
                    break;
            }

            System.out.println("Desea seguir viendo ejercicios? ('y'/'n')");
            String respuesta = scan.next();
            continuar = respuesta.charAt(0);
        }

        scan.close();
    }
}
