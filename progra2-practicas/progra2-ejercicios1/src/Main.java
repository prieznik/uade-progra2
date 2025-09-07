//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ejercicio3 ejercicio3 = new Ejercicio3();

        // A
        boolean resultadoA= ejercicio3.esPar(3);
        System.out.println(resultadoA);

        // B
        ejercicio3.multiplo5o7(7);


        // J
        System.out.println(ejercicio3.contieneDigito(125,2));
        boolean resultadoJcomplemento= ejercicio3.contieneNumero(126,26);
        System.out.println(resultadoJcomplemento);


    }
}