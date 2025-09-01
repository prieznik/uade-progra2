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
            while (aux != null){
                suma+=aux.getData();
                aux = aux.getNext();
            } promedio = suma/this.getQuantity();
        } return promedio;
    }

    public int cantHeladas(){
        int cantHeladas = 0;
        Node<Float> aux = getHead();
        while (aux != null){
            if (aux.getData() <= 0){
                cantHeladas++;
            }
            aux = aux.getNext();
        }  return cantHeladas;
    }

    public boolean huboHeladas(){
        if (cantHeladas()>0){
            return true;
        } else return false;
    }

    public float primeroMayor(float t){
        Node<Float> aux = getHead();
        while (aux != null){
            if (aux.getData() > t){
                return aux.getData();
            }
            aux = aux.getNext();
        } return t;
    }

    public boolean ordenadoCreciente(){
        if (getHead() != null){
            Node<Float> aux = getHead();
            while (aux.getNext() != null){
                if (aux.getData() > (Float) aux.getNext().getData()){ // agregue el (Float) porque sino me compara con un object
                    return false;
                }
                aux = aux.getNext();
            } return true;
        } else throw new NullPointerException("No hay elementos en la lista para determinar si está ordenada");

    }


}
