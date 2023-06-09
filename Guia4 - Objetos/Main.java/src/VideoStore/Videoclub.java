package VideoStore;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Videoclub {
    public Cliente[] clientes;
    public int validos_clientes;
    public Pelicula[] peliculas;
    public int validos_peliculas;
    public Factura[] alquileres;
    public int validos_alquileres;

    // GETTERS & SETTERS ---------------------------------------------------

    public int getValidos_clientes() {
        return validos_clientes;
    }

    public void setValidos_clientes(int validos_clientes) {
        this.validos_clientes = validos_clientes;
    }

    public int getValidos_peliculas() {
        return validos_peliculas;
    }

    public void setValidos_peliculas(int validos_peliculas) {
        this.validos_peliculas = validos_peliculas;
    }

    public int getValidos_alquileres() {
        return validos_alquileres;
    }

    public void setValidos_alquileres(int validos_alquileres) {
        this.validos_alquileres = validos_alquileres;
    }

    // BUILDER ---------------------------------------------------

    public Videoclub() {
        this.validos_clientes = 0;
        this.validos_peliculas = 0;
        this.validos_alquileres = 0;
        this.clientes = new Cliente[50];
        this.peliculas = new Pelicula[50];
        this.alquileres = new Factura[150];
    }

    // METODOS ---------------------------------------------------

    //busqueda

    public Pelicula BuscarPelicula(String nombre) {
        Pelicula peli_coincide = null;
        for (Pelicula peli: peliculas) {
            if (peli != null) {
                if ((peli.nombre).toLowerCase().startsWith(nombre.toLowerCase())) {
                    peli_coincide = peli;
                    break;
                }
            }

        }
        return peli_coincide;
    }

    public Cliente BuscarCliente(String telefono) {
        Cliente cliente_coincide = null;
        for (Cliente clien: clientes) {
            if (clien != null) {
                if (telefono.equals(clien.telefono)) {
                    cliente_coincide = clien;
                }
            }
        }
        return cliente_coincide;
    }

    public Factura BuscarFactura(Cliente cliente, String nombre_pelicula) {
        Factura fact_coincide = null;

        for (Factura fact: cliente.facturas) {
            if (fact != null) {
                if (fact.pelicula.nombre.equals(nombre_pelicula)) {
                    fact_coincide = fact;
                }
            }
        }

        return fact_coincide;
    }

    //ALQUILAR

    public void Alquilar(String nombre_pelicula, String telefono_cliente) {
        Pelicula peli = BuscarPelicula(nombre_pelicula);

        if (peli != null) {
            Cliente clien = BuscarCliente(telefono_cliente);
            if (clien == null) {
                System.out.println("--- Crear un nuevo cliente ---");

                clien = CrearCliente();
                AgregarCliente(clien);
            }

            Factura factura = new Factura(peli, clien);
            AgregarAlquiler(factura);
            clien.AgregarAlquilerCliente(factura);
            peli.setVeces_alquilada(peli.getVeces_alquilada() + 1);
            peli.setCopias(peli.getCopias() - 1);

        }
        else {
            System.out.println("|X| No se encontro la pelicula buscada |X|");
        }
    }

    public Cliente CrearCliente() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Ingrese el telefono: ");
        String tel = scan.nextLine();
        System.out.print("Ingrese la direccion: ");
        String dir = scan.nextLine();

        return new Cliente(nombre, tel, dir);

    }

    public boolean VerificarExistePeliculaArreglo(Pelicula[] pelis, Pelicula peli_verificar) {
        boolean existe = false;
        for (Pelicula peli: pelis) {
            if (peli != null) {
                if (peli == peli_verificar) {
                    existe = true;
                }
            }
        }
        return existe;
    }


    public Pelicula BuscarMasAlquilada(Pelicula[] ignoradas, Pelicula[] arr_pelis) {
        int cant_alq = 0;
        Pelicula peli_mas_alquilada = null;

        for (Pelicula peli: arr_pelis) {
            if (peli != null) {
                if (peli.veces_alquilada >= cant_alq) {
                    if (!VerificarExistePeliculaArreglo(ignoradas, peli)) {
                        peli_mas_alquilada = peli;
                        cant_alq = peli_mas_alquilada.veces_alquilada;
                    }
                }
            }
            else {
                break;
            }

        }

        return peli_mas_alquilada;
    }

    public Pelicula[] BuscarPelisMasAlquiladas() {
        Pelicula[] arr_mayores = new Pelicula[3];

        for (int i = 0; i < 3; i++) {
            arr_mayores[i] = BuscarMasAlquilada(arr_mayores, peliculas);
        }

        return arr_mayores;
    }

    // devoluciones

    public void Devolver(String tel_cliente, String nombre_pelicula) {
        Cliente clien = BuscarCliente(tel_cliente);

        if (clien != null) {
            Factura fact = BuscarFactura(clien, nombre_pelicula);
            if (fact != null) {
                if (fact.isDevuelto()) {
                    (fact.pelicula).setVeces_alquilada(fact.pelicula.getVeces_alquilada() + 1);
                    (fact.pelicula).setCopias(fact.pelicula.getCopias() + 1);
                    fact.AnotarDevolucion();
                }
                else {
                    System.out.println("|X| Esta pelicula ya fue devuelta |X|");
                }
            }
            else {
                System.out.println("|X| No se encontro la factura buscada |X|");
            }
        }
        else {
            System.out.println("|X| No se encontro al cliente buscado |X|");
        }
    }

    //agregar al arreglo

    public void AgregarPelicula(Pelicula pelicula_agregar) {
        int val_peliculas = getValidos_peliculas();

        try {
            this.peliculas[val_peliculas] = pelicula_agregar;
            setValidos_peliculas(val_peliculas + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("|X| No entran mas peliculas |X|");
        }
    }

    public void AgregarCliente(Cliente cliente_agregar) {
        int val_clientes = getValidos_clientes();

        try {
            this.clientes[val_clientes] = cliente_agregar;
            setValidos_clientes(val_clientes + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("|X| No entran mas clientes |X|");
        }
    }

    public void AgregarAlquiler(Factura factura_agregar) {
        int val_factura = getValidos_alquileres();

        try {
            this.alquileres[val_factura] = factura_agregar;
            setValidos_alquileres(val_factura + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("|X| No entran mas alquileres |X|");
        }
    }

    //mostrar

    public void mostrarDevolucionesHoy() {
        for (Factura factu: alquileres) {
            if (factu != null) {
                if (!factu.isDevuelto()) {
                    System.out.println(factu.fecha_vencimiento.compareTo(LocalDate.now()));
                    if (factu.fecha_vencimiento.compareTo(LocalDate.now()) == 0) {
                        mostrarFactura(factu);
                    }

                }
            }
            else {
                break;
            }
        }
    }

    public void mostrarPorGenero(String genero) {
        boolean encontrada = false;
        for (Pelicula peli: peliculas) {
            if (peli != null) {
                if (peli.genero.toLowerCase().startsWith(genero.toLowerCase())) {
                    encontrada = true;
                    mostrarPelicula(peli);
                }
            }
        }
        if (!encontrada) {
            System.out.println("Escriba un genero valido.");
        }
    }

    public void mostrarMasAlquiladas() {
        Pelicula[] mas_alquiladas = BuscarPelisMasAlquiladas();
        for (Pelicula peli: mas_alquiladas) {
            if (peli != null) {
                mostrarPelicula(peli);
            }
            else {
                break;
            }
        }
    }

    public void mostrarTodasPeliculas() {
        for (Pelicula peli: peliculas) {
            if (peli != null) {
                mostrarPelicula(peli);
            }
            else {
                break;
            }
        }
    }

    public void mostrarTodosClientes() {
        for (Cliente clien: clientes) {
            if (clien != null) {
                mostrarCliente(clien);
            }
            else {
                break;
            }

        }
    }

    public void mostrarAlquileresVigentes() {
        for (Factura factu: alquileres) {
            if (factu != null) {
                if (!factu.isDevuelto()) {
                    mostrarFactura(factu);
                }
            }
            else {
                break;
            }

        }
    }

    public void mostrarAlquileresCliente(Cliente cliente) {
        for (Factura factu: cliente.facturas) {
            if (factu != null) {
                if (!factu.isDevuelto()) {
                    mostrarFactura(factu);
                }
            }
            else {
                break;
            }

        }
    }

    public void mostrarPelicula(Pelicula peli) {
        System.out.println("---------------------------");
        System.out.println("Nombre: " + peli.nombre);
        System.out.println("Género: " + peli.genero);
        System.out.println("Fecha de lanzamiento: " + peli.fecha_lanzamiento);
        System.out.println("Duración: " + peli.duracion + " minutos");
        System.out.println("Clasificación: " + peli.clasificacion);
        System.out.println("País: " + peli.pais);
        System.out.println("Descripción: " + peli.descripcion);
        System.out.println("Veces alquilada: " + peli.veces_alquilada);
        System.out.println("Copias disponibles: " + peli.copias);
    }

    public void mostrarFactura(Factura factura) {
        System.out.println("---------------------------");
        System.out.println("Pelicula: " + factura.pelicula.nombre);
        System.out.println("Cliente: " + factura.cliente.nombre);
        System.out.println("Fecha retirado: " + factura.fecha_retirado.toString());
        System.out.println("Fecha devolucion: " + factura.fecha_vencimiento.toString());
        if(factura.isDevuelto()) {
            System.out.println("Devuelto: Si");
        }
        else {
            System.out.println("Devuelto: No");
        }


    }

    public void mostrarCliente(Cliente cliente) {
        System.out.println("---------------------------");
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Direccion: " + cliente.direccion);
    }



}
