package Libreria;

public class Libro {
    String titulo;
    double precio;
    int stock;
    Autor[] autor = new Autor[10];
    int validosAutor = 1;

    public Libro(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor[0] = autor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int copias) {
        this.stock = copias;
    }

    public void agregarAutor(Autor autor) {
        this.autor[this.validosAutor] = autor;
        this.validosAutor++;
    }

    public void mostrarLibro() {
        System.out.println("-------- LIBRO --------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Stock: " + this.stock);
        System.out.println("Autor: " + this.autor[0].nombre + " " + this.autor[0].apellido);
    }

    public String obtenerAutores() {
        String autores = "";

        for (Autor A: this.autor) {
            try {
                if (autores.length() == 0) {
                    autores = A.nombre + " " + A.apellido;
                }
                else {
                    autores = autores.concat("; ").concat(A.nombre).concat(" ").concat(A.apellido);
                }
            }
            catch(Exception NullPointerException) {
                continue;
            }


        }

        return autores;
    }

    public void presentarLibro() {
        System.out.println("El libro, " + this.titulo + " de " + this.obtenerAutores() + ". Se vende a " + this.precio + " pesos.");
    }

    public void mostrarAutorLibro(int indice) {
        this.autor[indice].mostrarAutor();
    }

}
