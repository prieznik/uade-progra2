package Ejercicio1;

public class CajaDeAhorro {
    private int numeroDeCaja;
    private static int contadorCajas= 0;
    private int saldoMonetario;

    public CajaDeAhorro() {
        contadorCajas++;
        this.numeroDeCaja= contadorCajas;
    }

    public int averiguarSaldo(){
        return this.saldoMonetario;
    }

    public void realizarDeposito(int montoDeposito){
        this.saldoMonetario+=montoDeposito;
    }

    public void realizarExtraccion(int montoExtraccion){
        this.saldoMonetario-=montoExtraccion;
    }

    public int getNumeroDeCaja(){
        return this.numeroDeCaja;
    }

}
