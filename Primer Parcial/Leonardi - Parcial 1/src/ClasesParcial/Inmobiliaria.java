package ClasesParcial;

import java.util.ArrayList;

public class Inmobiliaria {
    // ATRIBUTOS ------------------------------------------

    public ArrayList<Casa> casas;
    public ArrayList<Oficina> oficinas;
    public ArrayList<Departamento> departamentos;
    public ArrayList<Persona> personas;

    // CONSTRUCTORES ------------------------------------------

    public Inmobiliaria() {
        this.casas = new ArrayList<Casa>();
        this.oficinas = new ArrayList<Oficina>();
        this.departamentos = new ArrayList<Departamento>();
        this.personas = new ArrayList<Persona>();
    }

    // GETTERS & SETTERS ------------------------------------------

    // METODOS LISTA ------------------------------------------

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void agregarCasa(Casa casa) {
        casas.add(casa);
    }

    public void eliminarCasa(Casa casa) {
        if (!casas.remove(casa)) {
            System.out.println("No se ha podido encontrar la casa a eliminar");
        }
    }

    public void agregarOficina(Oficina oficina) {
        oficinas.add(oficina);
    }

    public void eliminarOficina(Oficina oficina) {
        if (!oficinas.remove(oficina)) {
            System.out.println("No se ha podido encontrar la oficina a eliminar");
        }
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void eliminarDepartamento(Departamento departamento) {
        if (!departamentos.remove(departamento)) {
            System.out.println("No se ha podido encontrar el departamento a eliminar");
        }
    }

    // METODOS MOSTRAR ------------------------

    public void mostrarPersonas() {
        for (Persona p: personas) {
            System.out.println(p.toString());
        }
    }

    public void mostrarCasas() {
        for (Casa c: casas) {
            System.out.println(c.toString());
        }
    }

    public void mostrarDepartamentos() {
        for (Departamento d: departamentos) {
            System.out.println(d.toString());
        }
    }

    public void mostrarOficinas() {
        for (Oficina o: oficinas) {
            System.out.println(o.toString());
        }
    }

    // otros METODOS ------------------------

    public Propiedad getPropiedadMayorValor() {
        int mayorValor = 0;
        Propiedad mayor = null;

        for (Casa c: casas) {
            if (c.getCostoVenta() > mayorValor) {
                mayorValor = c.getCostoVenta();
                mayor = c;
            }
        }

        for (Oficina o: oficinas) {
            if (o.getCostoVenta() > mayorValor) {
                mayorValor = o.getCostoVenta();
                mayor = o;
            }
        }

        for (Departamento d: departamentos) {
            if (d.getCostoVenta() > mayorValor) {
                mayorValor = d.getCostoVenta();
                mayor = d;
            }
        }

        return mayor;
    }

    public void aumentarAlquileres(int porcentaje) {
        for (Casa c: casas) {
            c.aumentarAlquileres(porcentaje);
        }

        for(Departamento d: departamentos) {
            d.aumentarAlquileres(porcentaje);
        }
    }

    public Propiedad buscarPropiedad(String direccion) {
        Propiedad p_buscada = null;

        for (Casa c: casas) {
            if (c.getDireccion().toLowerCase().startsWith(direccion.toLowerCase())) {
                p_buscada = c;
                break;
            }
        }

        if (p_buscada == null) {
            for (Oficina o: oficinas) {
                if (o.getDireccion().toLowerCase().startsWith(direccion.toLowerCase())) {
                    p_buscada = o;
                    break;
                }
            }
        }

        if (p_buscada == null) {
            for (Departamento d: departamentos) {
                if (d.getDireccion().toLowerCase().startsWith(direccion.toLowerCase())) {
                    p_buscada = d;
                    break;
                }
            }
        }

        return p_buscada;
    }
}
