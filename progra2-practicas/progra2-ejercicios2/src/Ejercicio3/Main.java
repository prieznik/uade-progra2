package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear jugadores
        Jugador palo = new Jugador("Palo");
        palo.setNroCamiseta(10);
        palo.setPosicion(9);
        palo.setGolesConvertidos(0);
        palo.setPartidosJugados(0);

        Jugador yoni = new Jugador("Yoni");
        yoni.setNroCamiseta(8);
        yoni.setPosicion(5);
        yoni.setGolesConvertidos(0);
        yoni.setPartidosJugados(0);

        Jugador pabli = new Jugador("Pabli");
        pabli.setNroCamiseta(1);
        pabli.setPosicion(1);
        pabli.setGolesConvertidos(0);
        pabli.setPartidosJugados(0);

        // Crear equipos
        Equipo gryffindor = new Equipo("Gryffindor", palo);
        Equipo ravenclaw = new Equipo("Ravenclaw", yoni);
        Equipo slytherin = new Equipo("Slytherin", pabli);

        // Simular partidos
        gryffindor.incrementarPG(true);
        gryffindor.aumentarGfavor(2, 1); // 2 goles totales, 1 del capitán
        gryffindor.aumentarGcontra(0);

        ravenclaw.incrementarPE(true);
        ravenclaw.aumentarGfavor(1, 0);
        ravenclaw.aumentarGcontra(1);

        slytherin.incrementarPP(true);
        slytherin.aumentarGfavor(0, 0);
        slytherin.aumentarGcontra(3);

        // Mostrar datos de cada equipo (atributo por atributo)
        System.out.println("Equipo: " + gryffindor.getNombre());
        System.out.println("Capitán: " + gryffindor.getCapitan().getNombre());
        System.out.println("PG: " + gryffindor.getpG());
        System.out.println("PE: " + gryffindor.getpE());
        System.out.println("PP: " + gryffindor.getpP());
        System.out.println("Goles a favor: " + gryffindor.getgFavor());
        System.out.println("Goles en contra: " + gryffindor.getgContra());
        System.out.println();

        System.out.println("Equipo: " + ravenclaw.getNombre());
        System.out.println("Capitán: " + ravenclaw.getCapitan().getNombre());
        System.out.println("PG: " + ravenclaw.getpG());
        System.out.println("PE: " + ravenclaw.getpE());
        System.out.println("PP: " + ravenclaw.getpP());
        System.out.println("Goles a favor: " + ravenclaw.getgFavor());
        System.out.println("Goles en contra: " + ravenclaw.getgContra());
        System.out.println();

        System.out.println("Equipo: " + slytherin.getNombre());
        System.out.println("Capitán: " + slytherin.getCapitan().getNombre());
        System.out.println("PG: " + slytherin.getpG());
        System.out.println("PE: " + slytherin.getpE());
        System.out.println("PP: " + slytherin.getpP());
        System.out.println("Goles a favor: " + slytherin.getgFavor());
        System.out.println("Goles en contra: " + slytherin.getgContra());
        System.out.println();

        // Mostrar datos de capitanes (atributo por atributo)
        System.out.println("Capitán: " + palo.getNombre());
        System.out.println("Nro camiseta: " + palo.getNroCamiseta());
        System.out.println("Posición: " + palo.getPosicion());
        System.out.println("Goles convertidos: " + palo.getGolesConvertidos());
        System.out.println("Partidos jugados: " + palo.getPartidosJugados());
        System.out.println();

        System.out.println("Capitán: " + yoni.getNombre());
        System.out.println("Nro camiseta: " + yoni.getNroCamiseta());
        System.out.println("Posición: " + yoni.getPosicion());
        System.out.println("Goles convertidos: " + yoni.getGolesConvertidos());
        System.out.println("Partidos jugados: " + yoni.getPartidosJugados());
        System.out.println();

        System.out.println("Capitán: " + pabli.getNombre());
        System.out.println("Nro camiseta: " + pabli.getNroCamiseta());
        System.out.println("Posición: " + pabli.getPosicion());
        System.out.println("Goles convertidos: " + pabli.getGolesConvertidos());
        System.out.println("Partidos jugados: " + pabli.getPartidosJugados());
        System.out.println();

        // Comparaciones
        Equipo mejorEquipo = gryffindor.mejorPuntaje(ravenclaw);
        System.out.println("Mejor equipo entre Gryffindor y Ravenclaw: " + mejorEquipo.getNombre());

        Jugador mejorCapitan = gryffindor.capitanConMasGoles(ravenclaw);
        System.out.println("Capitán con más goles entre Gryffindor y Ravenclaw: " + mejorCapitan.getNombre());
    }
}