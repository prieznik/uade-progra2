package Ejercicio4;

public class TempMinEstacion {
    protected float[] S;
    private int cantElementos;

    // constructor
    public TempMinEstacion(int cantidad) {
        S = new float[cantidad];
    }

    // comandos
    public void establecerTempMin(int i, float elem){
        S[i]=elem;
        cantElementos++;
    }

    // consultas
    public float mayorTempMin(){
        float mayor= S[0];
        for (int i=0; i<S.length; i++){
            if (S[i]>mayor){
                mayor= S[i];
            }
        } return mayor;
    }

    public float promedioTempMin(){
        float promedio= 0.0F;
        for (int i=0; i<cantElementos ; i++){
            promedio+=S[i];
        } return promedio/=cantElementos;
    }

    public int cantHeladas(){
        int cant = 0;
        for (int i=0; i<S.length; i++){
            if (S[i]<0){
                cant++;
            }
        } return cant;
    }

    public boolean huboHeladas(){
        if (cantHeladas()>0){ // está bien, pero no tan bien. bien porque utilizo el métdo que ya creé, pero mal porque técnicamente estoy recorreindo de nuevo el arreglo completo
            return true;
        } else return false;
    }

    public float primeroMayor(float t){
        for (int i=0; i<S.length; i++){
            if (S[i]>t){
                return S[i];
            }
        } return t;
    }

    public boolean ordenadoCreciente(){
        boolean flag= true;
        for (int i=1; i<S.length; i++){
            if (S[i]<S[i-1]){
                flag= false;
            }
        } return flag;
    }

    // getter agregado por ejercicio 5
    public float[] getS() {
        return S;
    }
}
