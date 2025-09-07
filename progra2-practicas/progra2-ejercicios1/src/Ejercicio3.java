public class Ejercicio3 {

    // A
    public boolean esPar(int numero){
        if (numero % 2 == 0) return true; else return false;
    }

    // B
    public void multiplo5o7(int numero){
        if (numero % 5 == 0 && numero % 7 == 0){
            System.out.println(numero+" es múltiplo de 5 y 7");
        } else if (numero % 5 == 0){
            System.out.println(numero+" es múltiplo de 5");
        } else if (numero % 7 == 0){
            System.out.println(numero+" es múltiplo de 7");
        } else {
            System.out.println(numero+" no es múltiplo ni de 5 ni de 7");
        }
    }


    // J
    public boolean contieneDigito(int numero, int digito){
        int numero_aux = numero;

        while (numero_aux > 0) {
            int resto = numero_aux % 10;  // saco el último dígito
            if (resto == digito) {
                return true; // lo encontré
            }
            numero_aux = numero_aux / 10; // elimino el último dígito
        }
        return false; // no apareció nunca
    }

    // J reversionado según ejemplo de clase: independiente a cantidad de dígitos de los números
    public boolean contieneNumero(int numeroDado, int numeroBuscado) {
        String strDado = Integer.toString(numeroDado);
        String strBuscado = Integer.toString(numeroBuscado);
        return strDado.contains(strBuscado);
    }

}
