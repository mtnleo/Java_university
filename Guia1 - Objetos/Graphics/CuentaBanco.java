package Graphics;

public class CuentaBanco {
    int id;
    String nombre;
    double balance;

    public CuentaBanco(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double nuevoBalance) {
        this.balance = nuevoBalance;
    }

    public void MostrarCuenta() {
        System.out.println("---------------------");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Balance: $" + getBalance());

    }

    public double credito(double ingreso) {
        double saldoTotal = getBalance() + ingreso;
        setBalance(saldoTotal);

        return saldoTotal;
    }

    public double debito(double egreso) {
        double saldoTotal = getBalance();
        if (egreso <= saldoTotal) {
            saldoTotal = saldoTotal - egreso;
            setBalance(saldoTotal);

            return saldoTotal;
        } 
        else {
            System.out.println("No hay balance suficiente para retirar.");
        }

        return saldoTotal;
    }
}
