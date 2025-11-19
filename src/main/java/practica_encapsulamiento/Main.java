package practica_encapsulamiento;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria("9638527410", "Nelson Fabián", 1000000);

        cuentaBancaria.mostrarDatos();


        System.out.println("Corrección de nombre del titular...");
        cuentaBancaria.setTitular("Nelson Fabián Gallego Sánchez");

        System.out.println("El titular actual es: " + cuentaBancaria.getTitular());

        cuentaBancaria.depositar(500000);

        System.out.println("Su nuevo saldo es de: " + cuentaBancaria.getSaldo());

        cuentaBancaria.retirar(50000);
        cuentaBancaria.mostrarDatos();
    }
}