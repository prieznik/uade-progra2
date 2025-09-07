package Ejercicio5;

import Ejercicio4.TempMinEstacion;

public class TemperaturaEstacion extends TempMinEstacion {
    public TemperaturaEstacion(int cantidad) {
        super(cantidad);
    }

    // adicionales
    public float menorTemperatura(){
        float menor= S[0];
        for (int i=0; i<S.length; i++ ){
            if (menor > S[i]){
                menor= S[i];
            }
        } return menor;
    }

    public int posMenorTemperatura(){
        float n = menorTemperatura();
        int p = 0;
        for (int i=0; i<S.length; i++){
            if (n == S[i]){
                p= i;
            }
        } return p;
    }

    public boolean todosPositivos(){
        if (this.cantHeladas() == 0){
            return true;
        } else return false;
    }

    public int contarCoincidencias(TemperaturaEstacion s){
        int contador= 0;
        for (int i=0; i<S.length; i++){
            if (S[i] == s.getS()[i]){
                contador+=1;
            }
            } return contador;
    }

    public TemperaturaEstacion invertir(){
        int largo= S.length;
        TemperaturaEstacion arregloInvertido = new TemperaturaEstacion(largo);
        for (int i=0; i<arregloInvertido.getS().length; i++){
            arregloInvertido.establecerTempMin(--largo,S[i]);
        }
        return arregloInvertido;
    }

    public void reemplazar(float val1, float val2){
        for (int i=0; i<S.length; i++){
            if (S[i] == val1){
                S[i]= val2;
            }
        }
    }

    public String intercambiar(int pos1, int pos2){
        if (pos1 > 0 && pos1 <= S.length && pos2 > 0 && pos2 <= S.length){
            float aux= S[pos2];
            S[pos2]= S[pos1];
            S[pos1]= aux;
            return "[]";
        } else return "Error: posición no encontrada";
    }

    public void invertirMe(){
        TemperaturaEstacion aux = this.invertir();
        this.S = aux.getS();
    }

    // NO ESTÁ RESUELTO:
    public void ordenar(){
        float[] base = S;
        float[] ordenado = new float[S.length];
        int primero = 0;
        int ultimo = base.length-1;

        while (primero <= ultimo){
            int medio = (primero+ultimo)/2;
        }
    }



}
