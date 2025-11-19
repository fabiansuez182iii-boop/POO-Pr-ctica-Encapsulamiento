package practica_encapsulamiento;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria("9638527410", "Nelson Fabián Gallego Sánchez", 1000000);

        cuentaBancaria.mostrarDatos();
        cuentaBancaria.depositar(500000);
        System.out.println("Su nuevo saldo es de: " + cuentaBancaria.getSaldo());

        cuentaBancaria.retirar(50000);
        cuentaBancaria.retirar(100000);
        cuentaBancaria.mostrarDatos();
    }

}