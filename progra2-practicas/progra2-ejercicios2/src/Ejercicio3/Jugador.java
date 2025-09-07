package Ejercicio3;

public class Jugador {
    // atributos
    private String nombre;
    private int nroCamiseta;
    private int posicion;
    private int golesConvertidos;
    private int partidosJugados;

    // constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    // comandos
    public void aumentarGoles(int n){
        golesConvertidos+=n;
    }
    public void aumentarUnPartido(){
        partidosJugados++;
    }

    // consultas
    public int promedioGolesxPart(){
        return golesConvertidos/partidosJugados;
    }
    public Jugador jugConMasGoles(Jugador j){
        if (this.getGoles()>j.getGoles()){
            return this;
        } else {
            return j;
        }
    }
    public boolean masGoles(Jugador j){
        if (this.getGoles()<j.getGoles()){
            return true;
        } else {
            return false;
        }
    }
    /* En la consigna no clarifica qué hacer con este método
    public String aCadena(){
    }
     */

    // getters
    public int getGoles(){
        return golesConvertidos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getGolesConvertidos() {
        return golesConvertidos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    // setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setGolesConvertidos(int golesConvertidos) {
        this.golesConvertidos = golesConvertidos;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    // to string

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", nroCamiseta=" + nroCamiseta +
                ", posicion=" + posicion +
                ", golesConvertidos=" + golesConvertidos +
                ", partidosJugados=" + partidosJugados +
                '}';
    }
}
