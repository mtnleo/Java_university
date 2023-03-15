import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Character continuar = 'y';
        Scanner scan = new Scanner(System.in);

        while(continuar == 'y') {

            System.out.println("Escriba el ejercicio que quieras realizar:");

            int ejercicio = scan.nextInt();

            switch(ejercicio) {
                case 1: //declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la diferencia de A - N, el valor numérico correspondiente al carácter que contiene la variable C.
                    System.out.println("Ejercicio 1.\n");
                    
                    int N = 10;
                    double A = 600;
                    Character C = 'C';

                    System.out.println("N = " + N + "\nA = " + A + "\nchara = " + C);
                    System.out.println("N + A = " + (N+A) + "\nA - N = " + (A-N) + "\nValor Numerico de C = " + (int) C);

                    break;
                case 2: //declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar por pantalla una serie de operaciones entre ellas.
                    System.out.println("Ejercicio 2.\n");

                    int X = 1;
                    int Y = 5;
                    double N2 = 10;
                    double M = 50;

                    int oper_a = (int)M + X + Y;
                    double oper_b = N2 * (double)Y;

                    System.out.println("M + X + Y = " + oper_a + "\nN * Y = " + oper_b);
                    
                    break;

                case 3: //declare una variable entera N, asignarle un valor. A continuación escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su valor a 3, duplicar su valor.
                    System.out.println("Ejercicio 3.\n"); 

                    int N3 = 10;
                    int operacion = (N3 + 77 - 3) * 2;

                    System.out.println("Valor de la operacion: " + operacion);

                    break;

                case 4: //declare cuatro variables enteras A, B, C y D y asignarle un valor a cada una. A continuación realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
                    System.out.println("Ejercicio 4.\n"); 

                    int A4 = 10;
                    int B4 = 50;
                    int C4 = 80;
                    int D4 = 90;

                    System.out.println("Valores antes: A = " + A4 + " B = " + B4 + " C = " + C4 + " D = " + D4); 

                    int B_aux = B4; //agrego el aux para que no tome el valor que fue cambiado
                    B4 = C4;
                    C4 = A4;
                    A4 = D4;
                    D4 = B_aux;

                    System.out.println("Valores despues: A = " + A4 + " B = " + B4 + " C = " + C4 + " D = " + D4); 

                    break;

                case 5: // declare una variable A de tipo entero, asignarle un valor. A continuación mostrar un mensaje indicando si A es par o impar
                    System.out.println("Ejercicio 5.\n"); 

                    //voy a hacerlo pidiendo input al usuario usando scan:
                    System.out.println("Escriba un numero:"); 
                    int A5 = scan.nextInt();

                    if(A5 % 2 == 0) {
                        System.out.println(A5 + " es par!"); 
                    }
                    else {
                        System.out.println(A5 + " es impar!"); 
                    }

                    break;

                case 6: //declare una variable B de tipo entero y asignarle un valor. A continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.
                    System.out.println("Ejercicio 6.\n"); 

                    //voy a hacerlo pidiendo input al usuario usando scan:
                    System.out.println("Escriba un numero:"); 
                    int B6 = scan.nextInt();

                    if(B6 >= 0) {
                        System.out.println(B6 + " es positivo!"); 
                    }
                    else {
                        System.out.println(B6 + " es negativo!"); 
                    }

                    break;

                case 7: // declare una variable C de tipo entero y asignarle un valor. A continuación mostrar un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.
                    System.out.println("Ejercicio 7.\n"); 

                    //voy a hacerlo pidiendo input al usuario usando scan:
                    System.out.println("Escriba un numero:"); 
                    int C7 = scan.nextInt();

                    if(C7 >= 0) {
                        System.out.println(C7 + " es positivo!"); 
                    }
                    else {
                        System.out.println(C7 + " es negativo!"); 
                    }

                    if(C7 % 2 == 0) {
                        System.out.println(C7 + " es par!"); 
                    }
                    else {
                        System.out.println(C7 + " es impar!"); 
                    }

                    if(C7 % 5 == 0) {
                        System.out.println(C7 + " es multiplo de 5!"); 
                    }
                    else {
                        System.out.println(C7 + " no es multiplo de 5!"); 
                    }

                    if(C7 % 10 == 0) {
                        System.out.println(C7 + " es multiplo de 10!"); 
                    }
                    else {
                        System.out.println(C7 + " no es multiplo de 10!"); 
                    }

                    if(C7 > 100) {
                        System.out.println(C7 + " es mayor que 100!"); 
                    }
                    else {
                        System.out.println(C7 + " es menor o igual que 100!"); 
                    }

                    break;

                case 8: //lea un nombre y muestre por pantalla: “Buenos días, {NOMBRE}”.
                    System.out.println("Ejercicio 8.\n"); 

                    System.out.println("Escriba su nombre: "); 
                    String nombre = scan.next();

                    System.out.println("Buenos días, " + nombre); 

                    break;

                case 9: // lea un número entero por teclado y calcule el doble y el triple de ese número y lo muestre por pantalla.
                    System.out.println("Ejercicio 9.\n"); 

                    System.out.println("Escriba un numero:"); 
                    int num = scan.nextInt();

                    int num_doble = num * 2;
                    int num_triple = num * 3;

                    System.out.println("Numero -> " + num + "\nDoble = " + num_doble + "\nTriple = " + num_triple);
                    
                    break;

                case 10: // lea una cantidad de grados Fahrenheit y lo convierta a grados centígrados
                    System.out.println("Ejercicio 10.\n"); 

                    System.out.println("Escriba una temperatura en Fahrenheit: "); 
                    int temp = scan.nextInt();

                    float temp_celsius = (temp - 32) * 0.5556f;

                    System.out.println(temp + " en Celsius es = " + temp_celsius);

                    break;

                case 11: // lee por teclado el valor del radio de una circunferencia, calcula y muestra por pantalla la longitud y el área de la circunferencia.
                    System.out.println("Ejercicio 11.\n");     

                    System.out.println("Escriba el radio de la circunferencia: "); 
                    int radio = scan.nextInt();
                    float PI = 3.1415f;

                    float longitud = (radio * 2) * PI;
                    float area = PI * (radio * radio);

                    System.out.println("Longitud -> " + longitud + "\nArea -> " + area);

                    break;

                case 12: // pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
                    System.out.println("Ejercicio 12.\n");

                    System.out.println("Escriba la velocidad en Km/h: "); 
                    int velocidad_kmh = scan.nextInt();

                    float velocidad_ms = velocidad_kmh / 3.6f;

                    System.out.println("La velocidad en m/s: " + velocidad_ms); 

                    break;

                case 13: // lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
                    System.out.println("Ejercicio 13.\n");

                    System.out.println("Escriba la longitud del cateto 1: ");
                    int cateto1 = scan.nextInt();
                    System.out.println("Escriba la longitud del cateto 2: ");
                    int cateto2 = scan.nextInt();

                    float hipotenusa = (float)Math.sqrt((cateto1*cateto1) + (cateto2*cateto2));

                    System.out.println("El valor de la hipotenusa es: " + hipotenusa); 

                    break;

                case 14: // calcula el volumen de una esfera.
                    System.out.println("Ejercicio 14.\n");

                    float PI_2 = 3.1415f;

                    System.out.println("Escriba el radio de la esfera: ");
                    int radio_esfera = scan.nextInt();

                    float volumen_esfera = ((float)4/3) * (PI_2 * ((float)radio_esfera*(float)radio_esfera*(float)radio_esfera));

                    System.out.println("El volumen de la esfera de radio " + radio_esfera + " es = " + volumen_esfera);

                    break;

                case 15: // calcula el área de un triángulo a partir de la longitud de sus lados.
                    System.out.println("Ejercicio 15.\n");

                    System.out.println("Escriba el lado 1 del triangulo: ");
                    int l1 = scan.nextInt();
                    System.out.println("Escriba el lado 2 del triangulo: ");
                    int l2 = scan.nextInt();
                    System.out.println("Escriba el lado 3 del triangulo: ");
                    int l3 = scan.nextInt();

                    // usando la formula de Herón
                    float s = ((float)l1 + (float)l2 + (float)l3) / 2;
                    float area_t = (float)Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));

                    System.out.println("El area del triangulo es de: " + area_t);

                    break;
                    
                case 16: //lee un número de 3 cifras y muestra sus cifras por separado.
                    System.out.println("Ejercicio 16.\n");

                    System.out.println("Escriba un numero de 3 cifras: ");
                    int cifras = scan.nextInt();

                    String cifras_letras = Integer.toString(cifras);

                    for(int i = 0; i < 3; i++) {
                        System.out.println("Cifra #" + (i+1) + " = " + cifras_letras.charAt(i));
                    }

                    break;

                case 17: // lea un número entero N de 5 cifras y muestre las cifras que ocupan posiciones impares.
                    System.out.println("Ejercicio 17.\n");

                    System.out.println("Escriba un numero de 5 cifras: ");
                    int cifras_5 = scan.nextInt();

                    String cifras_letras_5 = Integer.toString(cifras_5);

                    for(int i = 0; i < 5; i = i + 2) {
                        //considero impares segun el i: 0, 2, 4, 6, etc.
                        System.out.println("Cifra #" + i + " = " + cifras_letras_5.charAt(i));
                    }


                    break;

                case 18: // lea tres números enteros H, M, S que contienen hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.
                    System.out.println("Ejercicio 18.\n");

                    // delimitar las horas, minutos y segundos validos
                    int HORAS = 24;
                    int MINUTOS = 60;
                    int SEGUNDOS = 60;

                    System.out.println("Escriba las horas: ");
                    int hor = scan.nextInt();
                    System.out.println("Escriba los minutos: ");
                    int min = scan.nextInt();
                    System.out.println("Escriba los segundos: ");
                    int seg = scan.nextInt();

                    if (hor >= HORAS) {
                        System.out.println("Las horas no son correctas!");
                    }
                    if (min >= MINUTOS) {
                        System.out.println("Los minutos no son correctos!");
                    }
                    if (seg >= SEGUNDOS) {
                        System.out.println("Los segundos no son correctos!");
                    }
                    else {
                        System.out.println("El horario esta correcto!");
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
