package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        TempMinEstacion t1 = new TempMinEstacion(3);
        TempMinEstacion t2 = new TempMinEstacion(5);

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
            t2.establecerTempMin(2,3.4F);
            t2.establecerTempMin(3,7.7F);
            t2.establecerTempMin(4,8.7F);
        } catch (Exception e){
            System.out.println("No se puede agregar más temperaturas en la estación.");
        }

        System.out.println("\n----Datos T1----");
        System.out.println("La mayor temperatura registrada es: "+t1.mayorTempMin());
        System.out.println("El promedio de las temperaturas es: "+t1.promedioTempMin());
        System.out.println("Heló "+t1.cantHeladas()+" días");
        if (t1.huboHeladas()){
            System.out.println("Hubo heladas");
        } else System.out.println("No hubo heladas");
        float dado= 3.7F;
        System.out.println("Dado "+dado+", la temperatura inmediatamente mayor es: "+t1.primeroMayor(dado));
        if (t1.ordenadoCreciente()){
            System.out.println("Las temperaturas se produjeron en orden creciente");
        } else System.out.println("Las temperaturas no se produjeron en ningún orden");

        System.out.println("\n----Datos T2----");
        System.out.println("La mayor temperatura registrada es: "+t2.mayorTempMin());
        System.out.println("El promedio de las temperaturas es: "+t2.promedioTempMin());
        System.out.println("Heló "+t2.cantHeladas()+" días");
        if (t2.huboHeladas()){
            System.out.println("Hubo heladas");
        } else System.out.println("No hubo heladas");
        float dado2= 10.0F;
        System.out.println("Dado "+dado2+", la temperatura inmediatamente mayor es: "+t2.primeroMayor(dado2));
        if (t2.ordenadoCreciente()){
            System.out.println("Las temperaturas se produjeron en orden creciente");
        } else System.out.println("Las temperaturas no se produjeron en ningún orden");

    }
}
