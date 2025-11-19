package practica_encapsulamiento;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("\nSu consignación fue de $ " + monto);
        } else {
            System.out.println("El monto a consignar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println("Se retiro fue de $ " + monto);
        } else {
            System.out.println("Fondos insuficientes o monto no válido.");
        }
    }

    public void mostrarDatos() {
        System.out.println("\n" +
                "=== Información de la Cuenta ===");
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Actual: $" + saldo);
        System.out.println("================================");
    }
}