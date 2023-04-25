package ClasesParcial;

public abstract class HARDCODE {

    public static void agregarDatos(Inmobiliaria i) {
        Persona p1 = new Persona("Martin", "Fox", 56521354);
        Persona p2 = new Persona("Hernan", "Seal", 46534354);
        Persona p3 = new Persona("Felipe", "Shark", 21521354);
        Persona p4 = new Persona("Malena", "Tiger", 46461354);
        Persona p5 = new Persona("Juan", "Panther", 56521764);
        Persona p6 = new Persona("Martin", "Jiraffe", 11521354);
        Persona p7 = new Persona("Tomas", "Lion", 56222324);

        Casa c1 = new Casa("Viamonte 9239", p1, 155000, 2, 18);
        Casa c2 = new Casa("Lamadrid 1111", p6, 123000, 4, 6);
        Casa c3 = new Casa("Buque Pesquero 1023", p3, 300000, 3, 36);
        Casa c4 = new Casa("Buenos Aires 2040", p7, 30500, 1, 9);
        Casa c5 = new Casa("Constitucion 1450", p2, 40800, 2, 12);

        Departamento d1 = new Departamento("Roca 12", p4, 220000, 4, 12);
        Departamento d2 = new Departamento("Colon 2039", p5, 90000, 2, 24);
        Departamento d3 = new Departamento("Belgrano 2332", p1, 20000, 4, 6);
        Departamento d4 = new Departamento("Urquiza 420", p6, 120000, 4, 36);

        Oficina o1 = new Oficina("20 de Septiembre 3432", p2, 12500, 2);
        Oficina o2 = new Oficina("9 de Julio 9768", p7, 26500, 3);
        Oficina o3 = new Oficina("25 de Mayo 239", p3, 9500, 1);
        Oficina o4 = new Oficina("San Martin 567", p4, 30500, 6);

        i.agregarPersona(p1);
        i.agregarPersona(p2);
        i.agregarPersona(p3);
        i.agregarPersona(p4);
        i.agregarPersona(p5);
        i.agregarPersona(p6);
        i.agregarPersona(p7);

        i.agregarCasa(c1);
        i.agregarCasa(c2);
        i.agregarCasa(c3);
        i.agregarCasa(c4);
        i.agregarCasa(c5);

        i.agregarDepartamento(d1);
        i.agregarDepartamento(d2);
        i.agregarDepartamento(d3);
        i.agregarDepartamento(d4);

        i.agregarOficina(o1);
        i.agregarOficina(o2);
        i.agregarOficina(o3);
        i.agregarOficina(o4);

    }
}
