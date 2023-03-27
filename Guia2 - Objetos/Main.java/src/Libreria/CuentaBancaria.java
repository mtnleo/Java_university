package Libreria;

import java.util.UUID;

public class CuentaBancaria {

    private final UUID id_cuenta;
    private double balance;
    private ClienteBanco cliente;
    public double SaldoNegativoMax = 2000;
    private String[] log_transacciones = new String[10];
    int validos_log = 0;

    public CuentaBancaria(double balance, ClienteBanco cliente) {
        this.id_cuenta = UUID.randomUUID();
        this.balance = balance;
        this.cliente = cliente;
    }

    public String[] getLog_transacciones() {
        return log_transacciones;
    }

    public void setLog_transacciones(String[] log_transacciones) {
        this.log_transacciones = log_transacciones;
    }

    public UUID getId_cuenta() {
        return this.id_cuenta;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ClienteBanco getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBanco cliente) {
        this.cliente = cliente;
    }

    public void DepositarDinero(double monto) {
        setBalance(getBalance() + monto);
        String texto_log = "El " + this.cliente.nombre + ", deposito $" + monto;
        agregar_log(texto_log);
    }
    public double RetirarDinero(double monto) {
        double balanceActual = getBalance();
        if ((balanceActual + this.SaldoNegativoMax) < monto) {
            System.out.println("|X| No se puede retirar dinero, balance insuficiente |X|");
            monto = 0;
        }
        else {
            setBalance(balanceActual - monto);
            String texto_log = "El " + this.cliente.nombre + ", retiro $" + monto;
            agregar_log(texto_log);
        }

        return monto;
    }

    public void agregar_log(String mensaje) {
        String[] string_arr = getLog_transacciones();

        string_arr[this.validos_log] = mensaje;
        setLog_transacciones(string_arr);
        this.validos_log++;
    }


    public void MostrarDatosCuenta() {
        System.out.println("-------- CUENTA BANCARIA --------");
        System.out.println("ID: " + getId_cuenta());
        System.out.println("Nombre: " + getCliente().nombre);
        System.out.println("Balance: " + getBalance());
    }

    public void MostrarLog() {
        for (String texto : this.log_transacciones) {
            if (texto != null) {
                System.out.println(texto);
            } else {
                break;
            }
        }
    }

}
