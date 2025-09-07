package Ejercicio5;

import Ejercicio4.TempMinEstacion;

public class Main {
    public static void main(String[] args) {
        TemperaturaEstacion t1 = new TemperaturaEstacion(4);
        TemperaturaEstacion t2 = new TemperaturaEstacion(4);

        try {
            t1.establecerTempMin(0,2.4F);
            t1.establecerTempMin(1,6.2F);
            t1.establecerTempMin(2,2.4F);
            t1.establecerTempMin(3,0.7F);
        } catch (Exception e){
            System.out.println("No se puede agregar más temperaturas en la estación.");
        }

        try {
            t2.establecerTempMin(0,-6.4F);
            t2.establecerTempMin(1,-3.2F);
            t2.establecerTempMin(2,2.4F);
            t2.establecerTempMin(3,7.7F);
            t2.establecerTempMin(4,8.7F);
        } catch (Exception e){
            System.out.println("No se puede agregar más temperaturas en la estación.");
        }

        // Mostrar arreglo t1
        System.out.println("\n--- t1 ---");
        System.out.println("Menor t1: " + t1.menorTemperatura());
        System.out.println("Pos. menor t1: " + t1.posMenorTemperatura());
        System.out.println("¿t1 todos positivos? " + t1.todosPositivos());

        // Mostrar arreglo t2
        System.out.println("\n--- t2 ---");
        System.out.println("Menor t2: " + t2.menorTemperatura());
        System.out.println("Pos. menor t2: " + t2.posMenorTemperatura());
        System.out.println("¿t2 todos positivos? " + t2.todosPositivos());

        // Coincidencias posición a posición entre t1 y t2
        System.out.println("\nCoincidencias t1 vs t2: " + t1.contarCoincidencias(t2));

        // Invertir t1 y mostrarlo
        TemperaturaEstacion t1Invertida = t1.invertir();
        System.out.println("\n--- t1 invertida ---");
        for (int i = 0; i < t1Invertida.getS().length; i++) {
            System.out.println("t1Inv[" + i + "] = " + t1Invertida.getS()[i]);
        }

        // Mostrar arreglo inicial
        System.out.println("Arreglo inicial:");
        for (int i = 0; i < t1.getS().length; i++) {
            System.out.println("S[" + i + "] = " + t1.getS()[i]);
        }

        // ---- reemplazar ----
        System.out.println("\nReemplazo de 2.4 por 9.9:");
        t1.reemplazar(2.4F, 9.9F);
        for (int i = 0; i < t1.getS().length; i++) {
            System.out.println("S[" + i + "] = " + t1.getS()[i]);
        }

        // ---- intercambiar ----
        System.out.println("\nIntercambio posiciones 1 y 3:");
        String resultado = t1.intercambiar(1, 3);
        System.out.println("Resultado: " + resultado);
        for (int i = 0; i < t1.getS().length; i++) {
            System.out.println("S[" + i + "] = " + t1.getS()[i]);
        }

        // ---- invertirMe ----
        System.out.println("\nInvertir el arreglo:");
        t1.invertirMe();
        for (int i = 0; i < t1.getS().length; i++) {
            System.out.println("S[" + i + "] = " + t1.getS()[i]);
        }
    }
}

