package Libreria;

import java.util.UUID;

public class CuentaBancaria {

    private final UUID id_cuenta;
    private double balance;
    private ClienteBanco cliente;

    public CuentaBancaria(double balance, ClienteBanco cliente) {
        this.id_cuenta = UUID.randomUUID();
        this.balance = balance;
        this.cliente = cliente;
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
    }

    public double RetirarDinero(double monto) {
        double balanceActual = getBalance();
        if (balanceActual < monto) {
            System.out.println("|X| No se puede retirar dinero, balance insuficiente |X|");
            monto = 0;
        }
        else {
            setBalance(balanceActual - monto);
        }

        return monto;
    }

    public void MostrarDatosCuenta() {
        System.out.println("-------- CUENTA BANCARIA --------");
        System.out.println("ID: " + getId_cuenta());
        System.out.println("Nombre: " + getCliente().nombre);
        System.out.println("Balance: " + getBalance());
    }

}
