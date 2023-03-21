package Graphics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character continuar = 'y';
        Scanner scan = new Scanner(System.in);

        while(continuar == 'y') {

            System.out.println("Escriba el ejercicio que quieras realizar:");

            int ejercicio = scan.nextInt();

            switch(ejercicio) {
                case 1:
                    System.out.println("Ejercicio 1.");

                    Graphics.Rectangulo recti = new Graphics.Rectangulo();

                    System.out.println("Antes de cambiar, el alto del rect es " + recti.getAlto() + " y el ancho del rectangulo es " + recti.getAncho());

                    System.out.println("Establezca el alto: ");
                    recti.setAlto(scan.nextFloat());

                    System.out.println("Establezca el ancho: ");
                    recti.setAncho(scan.nextFloat());

                    System.out.println("El alto del rectangulo es " + recti.getAlto());
                    System.out.println("El ancho del rectangulo es " + recti.getAncho());

                    System.out.println("El area del rectangulo es " + recti.area());
                    System.out.println("El perimetro del rectangulo es " + recti.perimetro());

                    break;

                case 2:
                    System.out.println("Ejercicio 2.");

                    Empleado empleado1 = new Empleado(23456345, "Carlos", "Gutierrez", 25000);
                    Empleado empleado2 = new Empleado(34234123, "Ana", "Sanchez", 27500);

                    empleado1.MostrarEmpleado();
                    empleado2.MostrarEmpleado();

                    System.out.println("Salario anual de Carlos antes del aumento: " + empleado1.saberSalarioAnual());
                    empleado1.aumentarSalario(15);
                    System.out.println("Salario anual de Carlos despues del aumento de 15%: " + empleado1.saberSalarioAnual());

                    break;

                case 3:
                    System.out.println("Ejercicio 3.");

                    ItemVenta ps4 = new ItemVenta(342346, "PS4 Poco uso", 10, 45000);

                    ps4.MostrarItem();

                    break;

                case 4:
                    System.out.println("Ejercicio 4.");

                    CuentaBanco cuenta1 = new CuentaBanco(9323, "Juancito", 15000);

                    cuenta1.credito(2500);
                    cuenta1.debito(1500);
                    cuenta1.debito(30000);
                    cuenta1.MostrarCuenta();

                    break;

                case 5:
                    System.out.println("Ejercicio 5.");

                    Hora time = new Hora(10, 22, 36);

                    time.mostrarHora();

                    break;

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
