package Ejercicio2;

public class Flor {
    private String nombre;
    private int petalos;
    private float precio;

    public Flor(String nombre, int petalos, float precio) {
        this.nombre = nombre;
        this.petalos = petalos;
        this.precio = precio;
    }

    public Flor() {
        this.nombre = "Margarita";
        this.petalos = 10;
        this.precio = 34.3F;
    }

    public String getNombre(){
        return nombre;
    }
    public int getPetalos(){
        return petalos;
    }
    public float getPrecio(){
        return precio;
    }

    public void setNombre(String newNombre){
        this.nombre=newNombre;
    }
    public void setPetalos(int newPetalos){
        this.petalos=newPetalos;
    }
    public void setPrecio(float newPrecio){
        this.precio=newPrecio;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "nombre='" + nombre + '\'' +
                ", petalos=" + petalos +
                ", precio=" + precio +
                '}';
    }
}
