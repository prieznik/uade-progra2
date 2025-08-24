public class E3J {
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
}