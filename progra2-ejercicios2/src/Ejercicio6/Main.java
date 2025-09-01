package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        TempMinEstacion estacion1 = new TempMinEstacion();
        TempMinEstacion estacion2 = new TempMinEstacion();

        estacion1.establecerTempMin(1.5F);
        estacion1.establecerTempMin(3.5F);
        estacion1.establecerTempMin(1.7F);

        System.out.println(estacion1.mayorTempMin());

        System.out.println(estacion1.promedioTempMin());
        System.out.println(estacion2.promedioTempMin());
    }
}