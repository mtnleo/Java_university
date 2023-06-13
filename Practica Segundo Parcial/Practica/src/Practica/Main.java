package Practica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) { /*
        ParqueNacional nahuelHuapi = new ParqueNacional("Nahuel Huapi", 10000);
        ParqueNacional glaciarPeritoMoreno = new ParqueNacional("Glaciar Perito Moreno");
        ParqueNacional iguazu = new ParqueNacional("Iguazu");

        // CARGAR A PARQUES ARGENTINA
        ParquesArgentina parques = new ParquesArgentina();
        parques.agregarParqueNacional(nahuelHuapi);
        parques.agregarParqueNacional(iguazu);
        parques.agregarParqueNacional(glaciarPeritoMoreno);

        //parques.mostrarParquesCargados();

        // leer del txt
        ArrayList<String> arregloNombresTxt = parques.leerNombreParquesTxt();
        ParquesArgentina.leerArrayListNombreParques(arregloNombresTxt);

        // agregar a txt
        //parques.cargarNombreParquesTxt();


        /// agregar bioma aceptado
        nahuelHuapi.agregarBiomaAceptado("Bosque Andino-Patagónico");
        nahuelHuapi.agregarBiomaAceptado("Estepa Patagónica");
        nahuelHuapi.agregarBiomaAceptado("Ambientes lacustres");

        // Instanciación de animales para el bioma "Bosque Andino-Patagónico"
        Animal animal1 = new Animal("Puma", "Felino", "Bosque Andino-Patagónico", 100, PeligroExtincion.VULNERABLE);
        Animal animal2 = new Animal("Huillín", "Carnívoro", "Bosque Andino-Patagónico", 50, PeligroExtincion.PELIGRO);
        Animal animal3 = new Animal("Pudú", "Ciervo", "Bosque Andino-Patagónico", 80, PeligroExtincion.VULNERABLE);

        // Instanciación de animales para el bioma "Estepa Patagónica"
        Animal animal4 = new Animal("Choique", "Ave", "Estepa Patagónica", 200, PeligroExtincion.BIEN);
        Animal animal5 = new Animal("Guanaco", "Mamífero", "Estepa Patagónica", 150, PeligroExtincion.BIEN);
        Animal animal9 = new Animal("Maras", "Roedor", "Estepa Patagónica", 30, PeligroExtincion.VULNERABLE);

        // Instanciación de animales para el bioma "Ambientes lacustres"
        Animal animal6 = new Animal("Trucha", "Pez", "Ambientes lacustres", 500, PeligroExtincion.BIEN);
        Animal animal7 = new Animal("Cisne de cuello negro", "Ave", "Ambientes lacustres", 100, PeligroExtincion.BIEN);
        Animal animal8 = new Animal("Coipo", "Roedor", "Ambientes lacustres", 70, PeligroExtincion.PELIGRO);

        // Agregar los animales al Parque Nacional Nahuel Huapi
        nahuelHuapi.agregarAnimal(animal1);
        nahuelHuapi.agregarAnimal(animal2);
        nahuelHuapi.agregarAnimal(animal3);
        nahuelHuapi.agregarAnimal(animal4);
        nahuelHuapi.agregarAnimal(animal5);
        nahuelHuapi.agregarAnimal(animal6);
        nahuelHuapi.agregarAnimal(animal7);
        nahuelHuapi.agregarAnimal(animal8);
        nahuelHuapi.agregarAnimal(animal9);

        // incitando al error
        Animal castor = new Animal("Castor", "Roedor", "Bosque Subpolar", 5000, PeligroExtincion.PELIGRO);
        nahuelHuapi.agregarAnimal(castor);

        // MOSTRAR
        System.out.println("\n--------------------");
        nahuelHuapi.mostrarBiosfera();

        // otro error!
        nahuelHuapi.mostrarAnimales("Sabana");

        // CARGAR INSTANCIA PARQUENACIONAL A JSON
        //nahuelHuapi.cargarParqueNacionalJson();
        */

        // LEER, CARGAR E INSTANCIAR PARQUENACIONAL JSON
        /*ArrayList<ParqueNacional> arregloParques = ParqueNacional.leerParqueNacionalJson();

        for (ParqueNacional parque: arregloParques) {
            if (parque != null) {
                System.out.println(parque.getNombre());
                parque.mostrarBiosfera();
            }
        }*/

        ParqueNacional nuevo = new ParqueNacional("Nahuel Huapi", 10000);
        ParqueNacional otro = new ParqueNacional("Perito Moreno", 5400);
        otro = nuevo;
        System.out.println(nuevo.getNombre());
        System.out.println(nuevo.hashCode());
        System.out.println(otro.getNombre());
        System.out.println(otro.hashCode());
        nuevo.setNombre("Uyuni");
        System.out.println(otro.getNombre());
        System.out.println(otro.hashCode());


    }
}