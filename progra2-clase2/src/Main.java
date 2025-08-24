//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // EJ 3.A
        int numero= 2;

        if(numero%2==0){
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        // EJ 3.B
        int n1= 3;

        if(n1%5 == 0) {
            System.out.println("Es múltiplo de 5");
        } else if (n1%7 == 0) {
            System.out.println("Es múltiplo de 7");
        } else {
            System.out.println("No es múltiplo de nada");
        }

        // EJ 3.C
        int a = 10;
        int b = 10;

        if (a > b){
            System.out.println("el mayor es A: "+a);
        } else if (b > a){
            System.out.println("el mayor es B: "+b);
        } else {
            System.out.println("los números son iguales");
        }

        // EJ 3.D
        int c = 10;
        int d = 8;
        int e = 10;

        if (a > b && a > c){
            System.out.println("El mayor es: "+a);
        } else if (b > c){
            System.out.println("El mayor es: "+b);
        } else {
            System.out.println("El mayor es: "+c);
        }

        // EJERCICIO ARREGLOS
        float[] temperaturas;
        temperaturas = new float[5];

        temperaturas[0]=10.2F;
        temperaturas[1]=2.9F;
        temperaturas[2]=15.2F;
        temperaturas[3]=1.7F;
        temperaturas[4]=2.5F;

        float temperatura_dada = 15.8F;

        int i = 0;
        while (i < temperaturas.length && temperaturas[i] < temperatura_dada){
            i++;
        }
        if (i < temperaturas.length){
            System.out.println("La temperatura mayor a la dada fue: "+temperaturas[i]);
        } else {
            System.out.println("No hay temperatura mayor a la dada. La temperatura queda en: "+temperatura_dada);
        }

    }
}