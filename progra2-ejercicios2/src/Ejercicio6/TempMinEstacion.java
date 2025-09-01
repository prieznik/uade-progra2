package Ejercicio6;

// dejo esta clase en espanol por motivos practicos, ya que hice los demas puntos en espanol
public class TempMinEstacion extends LinkedList<Float>{


    // comandos y consultas adaptadas
    // agrego establecerTempMin para que se mantengan los mismos nombres del enunciado
    public void establecerTempMin(float temp){
        addValue(temp);
    }

    public float mayorTempMin(){
        if (getHead() != null){
            Node<Float> aux = getHead();
            float mayor = aux.getData();
            while (aux.getNext() != null){
                aux = aux.getNext();
                if (aux.getData() > mayor){
                    mayor = aux.getData();
                }
            }
            return mayor;
        } else throw new NullPointerException("No hay elementos en la lista para identificar al mayor");

    }

    public float promedioTempMin(){
        float promedio = 0;
        if (getHead() != null){
            float suma = 0;
            Node<Float> aux = getHead();
            while (aux.getNext() != null){
                suma+=aux.getData();
                aux = aux.getNext();
            } suma+=aux.getData(); // agrego uno al finalizar para que tome todos los casos
            promedio = suma/this.getQuantity();
        } return promedio;
    }
}
