package Ejercicio3;

public class Equipo {
    // atributos
    private String nombre;
    private Jugador capitan;
    private int pG, pE, pP;
    private int gFavor, gContra;

    // constructor
    public Equipo(String nombre, Jugador capitan) {
        this.nombre = nombre;
        this.capitan = capitan;
    }

    // comandos
    public void incrementarPG(boolean jugoElCap){
        pG++;
        if (jugoElCap){capitan.aumentarUnPartido();}
    }
    public void incrementarPE(boolean jugoElCap){
        pE++;
        if (jugoElCap){capitan.aumentarUnPartido();}
    }
    public void incrementarPP(boolean jugoElCap){
        pP++;
        if (jugoElCap){capitan.aumentarUnPartido();}
    }
    public void aumentarGfavor(int total, int delCap){
        gFavor+=total+delCap;
        if (delCap>0){capitan.aumentarGoles(delCap);}
    }
    public void aumentarGcontra(int total){
        gContra+=total;
    }

    // consultas
    public int partidos(){
        return pG+pE+pP;
    }
    public int puntos(){
        return pG*3+pE;
    }
    public Equipo mejorPuntaje(Equipo e){
        if (this.puntos()>e.puntos()){
            return this;
        } else if (this.puntos()<e.puntos()){
            return e;
        } else if (this.gFavor>e.getgFavor()){
            return this;
        } else if (this.gFavor<e.getgFavor()){
            return e;
        } else if (this.gContra<e.getgContra()){
            return this;
        } else if (this.gContra>e.getgContra()){
            return e;
        } else {
            return this;
        }
    }
    public Jugador capitanConMasGoles(Equipo e){
        if (this.capitan.getGoles()>e.getCapitan().getGoles()){
            return capitan;
        } else {
            return e.getCapitan();
        }
    }

    // getters
    public Jugador getCapitan(){
        return capitan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getpG() {
        return pG;
    }

    public int getpE() {
        return pE;
    }

    public int getpP() {
        return pP;
    }

    public int getgFavor() {
        return gFavor;
    }

    public int getgContra() {
        return gContra;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
    }

    public void setpG(int pG) {
        this.pG = pG;
    }

    public void setpE(int pE) {
        this.pE = pE;
    }

    public void setpP(int pP) {
        this.pP = pP;
    }

    public void setgFavor(int gFavor) {
        this.gFavor = gFavor;
    }

    public void setgContra(int gContra) {
        this.gContra = gContra;
    }

    // to string

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", capitan=" + capitan +
                ", pG=" + pG +
                ", pE=" + pE +
                ", pP=" + pP +
                ", gFavor=" + gFavor +
                ", gContra=" + gContra +
                '}';
    }
}
