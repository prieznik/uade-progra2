package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPrueba Caja 1...");
        CajaDeAhorro caja1 = new CajaDeAhorro();

        System.out.println("Numero de caja: "+caja1.getNumeroDeCaja());
        System.out.println("Saldo de caja: "+caja1.averiguarSaldo());
        caja1.realizarDeposito(1000);
        caja1.realizarExtraccion(500);
        System.out.println("Saldo de caja: "+caja1.averiguarSaldo());


        System.out.println("\nPrueba Caja 2...");
        CajaDeAhorro caja2 = new CajaDeAhorro();
        System.out.println("Numero de caja: "+caja2.getNumeroDeCaja());
        System.out.println("Saldo de caja: "+caja2.averiguarSaldo());
        caja2.realizarDeposito(10);
        caja2.realizarExtraccion(50);
        System.out.println("Saldo de caja: "+caja2.averiguarSaldo());



    }
}
