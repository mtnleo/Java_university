package PedidosComida;

public abstract class Hardcode {

    public static void cargarPedidos(Sistema sistema) {
        Plato p3 = new Plato("Entraña", 350.0);
        Plato p4 = new Plato("Vacío", 300.0);
        p3.setCantidadPedido(4);
        p4.setCantidadPedido(1);

        Pedido ped1 = new Pedido(sistema.buscarUsuario("juan@gmail.com"), sistema.buscarLocal("La Parrilla"), "Local", sistema.buscarLocal("La parrilla").medioDePago.get(0), "Pisos Picados 3423",  );
    }

    public static void CargarUsuarios(Sistema sistema) {
        Usuario u1 = new Usuario("Juan Perez", "juan@gmail.com", "Av. Siempre Viva 123");
        Usuario u2 = new Usuario("María González", "maria.gonzalez@hotmail.com", "Calle Falsa 123");
        Usuario u3 = new Usuario("Pedro Rodriguez", "pedro.rodri@gmail.com", "Av. 9 de Julio 999");
        Usuario u4 = new Usuario("Ana Martinez", "ana.martinez@yahoo.com", "Calle Principal 456");
        Usuario u5 = new Usuario("Carlos García", "carlos.garcia@gmail.com", "Calle del Sol 789");
        Usuario u6 = new Usuario("Sofía Alvarez", "sofia.alvarez@hotmail.com", "Av. Libertador 555");
        Usuario u7 = new Usuario("Lucas Fernandez", "lucas.fernandez@yahoo.com", "Calle de la Luna 234");
        Usuario u8 = new Usuario("Marta Lopez", "marta.lopez@gmail.com", "Av. Corrientes 777");
        Usuario u9 = new Usuario("Diego Ramirez", "diego.ramirez@hotmail.com", "Calle de la Playa 567");
        Usuario u10 = new Usuario("Laura Sanchez", "laura.sanchez@yahoo.com", "Av. Rivadavia 3333");

        sistema.agregarUsuario(u1);
        sistema.agregarUsuario(u2);
        sistema.agregarUsuario(u3);
        sistema.agregarUsuario(u4);
        sistema.agregarUsuario(u5);
        sistema.agregarUsuario(u6);
        sistema.agregarUsuario(u7);
        sistema.agregarUsuario(u8);
        sistema.agregarUsuario(u9);
        sistema.agregarUsuario(u10);


    }

    public static void CargarLocales(Sistema sistema) {
        Local local1 = new Local("La Parrilla del Tío", "Av. San Martín 123");
        Local local2 = new Local("Pizza Express", "Calle Corrientes 456");
        Local local3 = new Local("Sushi Time", "Calle Sarmiento 789");
        Local local4 = new Local("El Bodegon", "Av. Belgrano 246");

        sistema.agregarLocal(local1);
        sistema.agregarLocal(local2);
        sistema.agregarLocal(local3);
        sistema.agregarLocal(local4);

        Hardcode.cargarParrilla(local1);
        Hardcode.cargarPizzaExpress(local2);
        Hardcode.cargarSushiTime(local3);
        Hardcode.cargarBodegon(local4);

        local1.agregarMediodePago(new MedioPago("Efectivo", 0));
        local1.agregarMediodePago(new MedioPago("Tarjeta", 29));
        local1.agregarMediodePago(new MedioPago("MercadoPago", 10));

        local2.agregarMediodePago(new MedioPago("Efectivo", 0));
        local2.agregarMediodePago(new MedioPago("Tarjeta", 29));
        local2.agregarMediodePago(new MedioPago("MercadoPago", 10));

        local3.agregarMediodePago(new MedioPago("Efectivo", 0));
        local3.agregarMediodePago(new MedioPago("Tarjeta", 29));
        local3.agregarMediodePago(new MedioPago("MercadoPago", 10));

        local4.agregarMediodePago(new MedioPago("Efectivo", 0));
        local4.agregarMediodePago(new MedioPago("Tarjeta", 29));
        local4.agregarMediodePago(new MedioPago("MercadoPago", 10));
    }

    private static void cargarParrilla(Local local) {
        Plato p1 = new Plato("Asado", 400.0);
        Plato p2 = new Plato("Bife de Chorizo", 450.0);
        Plato p3 = new Plato("Entraña", 350.0);
        Plato p4 = new Plato("Vacío", 300.0);
        Plato p5 = new Plato("Mollejas", 250.0);

        local.agregarPlato(p1);
        local.agregarPlato(p2);
        local.agregarPlato(p3);
        local.agregarPlato(p4);
        local.agregarPlato(p5);
    }

    private static void cargarPizzaExpress(Local local) {
        Plato p1 = new Plato("Pizza Margherita", 200.0);
        Plato p2 = new Plato("Pizza Pepperoni", 250.0);
        Plato p3 = new Plato("Pizza Vegetariana", 220.0);
        Plato p4 = new Plato("Pizza Cuatro Quesos", 260.0);
        Plato p5 = new Plato("Pizza Hawaiana", 240.0);

        local.agregarPlato(p1);
        local.agregarPlato(p2);
        local.agregarPlato(p3);
        local.agregarPlato(p4);
        local.agregarPlato(p5);
    }

    private static void cargarSushiTime(Local local) {
        Plato p1 = new Plato("Sashimi", 350.0);
        Plato p2 = new Plato("Nigiri", 300.0);
        Plato p3 = new Plato("Maki Roll", 250.0);
        Plato p4 = new Plato("Uramaki Roll", 280.0);
        Plato p5 = new Plato("Temaki", 320.0);

        local.agregarPlato(p1);
        local.agregarPlato(p2);
        local.agregarPlato(p3);
        local.agregarPlato(p4);
        local.agregarPlato(p5);
    }

    private static void cargarBodegon(Local local) {
        Plato p1 = new Plato("Milanesa Napolitana", 350.0);
        Plato p2 = new Plato("Pizza Margarita", 300.0);
        Plato p3 = new Plato("Ravioles de Ricota y Espinaca", 250.0);
        Plato p4 = new Plato("Tarta de Jamón y Queso", 200.0);
        Plato p5 = new Plato("Bife a la Criolla", 450.0);

        local.agregarPlato(p1);
        local.agregarPlato(p2);
        local.agregarPlato(p3);
        local.agregarPlato(p4);
        local.agregarPlato(p5);
    }


}
