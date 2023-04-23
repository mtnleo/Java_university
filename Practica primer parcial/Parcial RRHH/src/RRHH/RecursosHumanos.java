package RRHH;

import java.util.ArrayList;

public class RecursosHumanos {
    /// ATRIBUTOS -------------------------

    public ArrayList<Empleado> empleados;
    public ArrayList<Repartidor> repartidores;

    /// CONSTRUCTORES -------------------------

    public RecursosHumanos() {
        this.empleados = new ArrayList<Empleado>();
        this.repartidores = new ArrayList<Repartidor>();
    }

    /// METODOS
    //empleados

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado buscarEmpleadoPorLegajo(String legajo) {
        Empleado empleadoBuscado = null;
        for (Empleado emp: empleados) {
            if (emp.getLegajo().equals(legajo)) {
                empleadoBuscado = emp;
            }
        }
        return empleadoBuscado;
    }

    public int contarEmpleados() {
        return empleados.size();
    }

    public ArrayList<Empleado> retornarListadoEmpleados() {
        return empleados;
    }

    public void eliminarEmpleadoPorLegajo(String legajo) {
        for (Empleado emp: empleados) {
            if (emp.getLegajo().equals(legajo)) {
                empleados.remove(emp);
            }
        }
    }

    //repartidores

    public void agregarRepartidor(Repartidor rep) {
        repartidores.add(rep);
    }


}
