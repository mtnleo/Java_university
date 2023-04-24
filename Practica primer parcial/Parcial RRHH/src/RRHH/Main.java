package RRHH;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String cont = "y";
        Scanner scan = new Scanner(System.in);
        int num_ej;

        Administrador admin1 = new Administrador("A0004", "Mariana", "Gomez", "Av. Corrientes 123", LocalDate.of(1989, 7, 15), "Recursos Humanos", 25000.0);
        Administrador admin2 = new Administrador("A0005", "Juan", "Marovich", "Calle 45 #123", LocalDate.of(1985, 11, 2), "Finanzas", 27000.0);
        Administrador admin3 = new Administrador("A0006", "Carla", "Lopez", "Calle 78 #567", LocalDate.of(1990, 3, 18), "Marketing", 26000.0);
        Administrador admin4 = new Administrador("A0007", "Lucas", "Rodriguez", "Calle 32 #89", LocalDate.of(1987, 5, 23), "Sistemas", 28000.0);
        Vendedor ven1 = new Vendedor("V001", "John", "Doe", "123 Main St", LocalDate.of(1990, 5, 12), 5000);
        Vendedor ven2 = new Vendedor("V002", "Jane", "Smith", "456 Oak St", LocalDate.of(1995, 8, 22), 7000);
        Vendedor ven3 = new Vendedor("V003", "David", "Brown", "789 Maple St", LocalDate.of(1988, 11, 7), 4000);
        Vendedor ven4 = new Vendedor("V004", "Emily", "Taylor", "567 Pine St", LocalDate.of(1992, 3, 18), 6000);



        Repartidor rep1 = new Repartidor("Freja", "Nielsen", 15000);
        Repartidor rep2 = new Repartidor("Lars", "Jensen", 16000);
        Repartidor rep3 = new Repartidor("Sofie", "Pedersen", 17000);
        Repartidor rep4 = new Repartidor("Mads", "Mortensen", 18000);

        RecursosHumanos RRHH = new RecursosHumanos();

        RRHH.agregarEmpleado(admin1);
        RRHH.agregarEmpleado(admin2);
        RRHH.agregarEmpleado(admin3);
        RRHH.agregarEmpleado(admin4);
        RRHH.agregarEmpleado(ven1);
        RRHH.agregarEmpleado(ven2);
        RRHH.agregarEmpleado(ven3);
        RRHH.agregarEmpleado(ven4);
        RRHH.agregarRepartidor(rep1);
        RRHH.agregarRepartidor(rep2);
        RRHH.agregarRepartidor(rep3);
        RRHH.agregarRepartidor(rep4);

        while (cont.equals("y")) {
            System.out.println("Escriba el ejercicio que quieras realizar: ");
            num_ej = scan.nextInt();
            scan.nextLine();

            switch (num_ej) {
                case 1:
                    System.out.println("Mostrar empleados.");

                    RRHH.mostrarEmpleados();

                    break;

                case 2:
                    System.out.println("Mostrar Repartidores.");

                    RRHH.mostrarRepartidores();

                    break;

                case 3:
                    System.out.println("Mostrar Sueldo Total Empleades.");

                    System.out.println("Sueldo Total = " + RRHH.contarSueldoEmpleadosTotal());

                    break;

                default:
                    System.out.println("|X| ESCRIBA UN EJERCICIO VALIDO |X|");

                    break;

            }

            System.out.println("--- Deseas continuar viendo ejercicios? (y/n)");
            cont = scan.nextLine();

        }

        scan.close();
    }

}