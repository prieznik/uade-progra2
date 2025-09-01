package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        TempMinEstacion estacion1 = new TempMinEstacion();
        TempMinEstacion estacion2 = new TempMinEstacion();
        TempMinEstacion estacion3 = new TempMinEstacion();
        TempMinEstacion estacion4 = new TempMinEstacion();

        estacion1.establecerTempMin(1.5F);
        estacion1.establecerTempMin(3.5F);
        estacion1.establecerTempMin(1.7F);

        estacion2.establecerTempMin(-10F);
        estacion2.establecerTempMin(0F);
        estacion2.establecerTempMin(10F);

        estacion4.establecerTempMin(1F);

        try {
            System.out.println(estacion1.mayorTempMin());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(estacion3.mayorTempMin());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(estacion4.mayorTempMin());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(estacion1.promedioTempMin());
        System.out.println(estacion2.promedioTempMin());
        System.out.println(estacion3.promedioTempMin());
        System.out.println(estacion4.promedioTempMin());

        System.out.println(estacion1.cantHeladas());
        System.out.println(estacion2.cantHeladas());
        System.out.println(estacion3.cantHeladas());
        System.out.println(estacion4.cantHeladas());

        System.out.println(estacion1.huboHeladas());
        System.out.println(estacion2.huboHeladas());
        System.out.println(estacion3.huboHeladas());
        System.out.println(estacion4.huboHeladas());

        System.out.println(estacion1.primeroMayor(1));
        System.out.println(estacion1.primeroMayor(1.6F));
        System.out.println(estacion1.primeroMayor(2));
        System.out.println(estacion3.primeroMayor(3));
        System.out.println(estacion4.primeroMayor(4));

        try {
            System.out.println(estacion1.ordenadoCreciente());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(estacion2.ordenadoCreciente());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(estacion3.ordenadoCreciente());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println(estacion4.ordenadoCreciente());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }



    }
}