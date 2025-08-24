package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // creación de flor común
        Flor girasol = new Flor("Girasol",50,50.6F);
        System.out.println(girasol); // por el toString, devuelve valores de forma grupal
        // acceso a valores de forma individual
        System.out.println(girasol.getNombre());
        System.out.println((girasol.getNombre()));
        System.out.println(girasol.getPetalos());
        System.out.println(girasol.getPrecio());

        System.out.println();

        // creacion de margarita
        Flor margarita = new Flor();
        System.out.println(margarita);
        System.out.println(margarita.getNombre());
        System.out.println(margarita.getPetalos());
        System.out.println(margarita.getPrecio());

        System.out.println();

        // modificación de atributos
        girasol.setNombre("Girasoles");
        girasol.setPrecio(70.5F);
        margarita.setPetalos(60);
        System.out.println("Valores modificados...");
        System.out.println(girasol);
        System.out.println(margarita);

    }
}
