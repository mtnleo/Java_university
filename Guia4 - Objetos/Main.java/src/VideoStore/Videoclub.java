package VideoStore;

import java.time.LocalDate;

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
            if ((peli.nombre).startsWith(nombre)) {
                peli_coincide = peli;
                break;
            }

        }
        return peli_coincide;
    }

    public Cliente BuscarCliente(Cliente cliente) {
        Cliente cliente_coincide = null;
        for (Cliente clien: clientes) {
            if (cliente == clien) {
                cliente_coincide = clien;
                break;
            }
        }
        return cliente_coincide;
    }

    //ALQUILAR

    public void Alquilar(String nombre_pelicula, Cliente cliente) {
        Pelicula peli = BuscarPelicula(nombre_pelicula);
        if (peli != null) {
            if (BuscarCliente(cliente) == null) {
                AgregarCliente(cliente);
            }

            Factura factura = new Factura(peli, cliente);
            AgregarAlquiler(factura);

        }
        else {
            System.out.println("|X| No se encontro la pelicula buscada |X|");
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
            System.out.println("|X| No entran mas peliculas |X|");
        }
    }

    //mostrar

    public void mostrarTodasPeliculas() {
        for (Pelicula peli: peliculas) {
            mostrarPelicula(peli);
        }
    }

    public void mostrarTodosClientes() {
        for (Cliente clien: clientes) {
            mostrarCliente(clien);
        }
    }

    public void mostrarTodasFacturas() {
        for (Factura factu: alquileres) {
            mostrarFactura(factu);
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
    }

    public void mostrarCliente(Cliente cliente) {
        System.out.println("---------------------------");
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Direccion: " + cliente.direccion);
    }



}
