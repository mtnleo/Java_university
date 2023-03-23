package Libreria;

public class Libro {
    String titulo;
    double precio;
    int stock;
    Autor autor;

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int copias) {
        this.stock = copias;
    }

    public Libro(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public void mostrarLibro() {
        System.out.println("-------- LIBRO --------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Stock: " + this.stock);
        System.out.println("Autor: " + this.autor.nombre + " " + this.autor.apellido);
    }

    public void presentarLibro() {
        System.out.println("El libro, " + this.titulo + " de " + this.autor.apellido + ". Se vende a " + this.precio + " pesos.");
    }

    public void mostrarAutorLibro() {
        this.autor.mostrarAutor();
    }

}
