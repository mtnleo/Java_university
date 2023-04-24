package PedidosComida;

import java.util.ArrayList;

public class Sistema {
    /// ATRIBUTOS -------------------------

    public ArrayList<Local> locales;
    public ArrayList<Usuario> usuarios;
    public ArrayList<Pedido> pedidos;

    /// CONSTRUCTORES --------------------------

    public Sistema() {
        this.locales = new ArrayList<Local>();
        this.usuarios = new ArrayList<Usuario>();
        this.pedidos = new ArrayList<Pedido>();
    }

    /// METODOS ---------------------------------------
    //////// LOCALES

    public void agregarLocal(Local local) {
        locales.add(local);
    }

    public void sacarLocal(Local local) {
        if (!locales.remove(local)) {
            System.out.println("No se encontro el local");
        }
    }

    //////// USUARIOS

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    //////// PEDIDOS

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    ///////////////// MOSTRAR

    public void mostrarLocales() {
        for (Local loc: locales) {
            System.out.println(loc.toString());
        }
    }

    public void mostrarUsuarios() {
        for (Usuario usu: usuarios) {
            System.out.println(usu.toString());
        }
    }

    public void mostrarPedidos() {
        for (Pedido ped: pedidos) {
            System.out.println(ped.toString());
        }
    }
}
