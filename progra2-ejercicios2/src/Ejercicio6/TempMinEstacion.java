package Ejercicio6;

import Ejercicio5.TemperaturaEstacion;

// dejo esta clase en espanol por motivos practicos, ya que hice los demas puntos en espanol
public class TempMinEstacion extends LinkedList<Float>{


    // comandos y consultas adaptadas
    // agrego establecerTempMin para que se mantengan los mismos nombres del enunciado
    public void establecerTempMin(float temp){
        addValueEnd(temp);
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

    public float menorTemperatura(){
        if (getHead() != null){
            Node<Float> aux = getHead();
            float menor = aux.getData();
            while (aux.getNext() != null){
                aux = aux.getNext();
                if (aux.getData() < menor){
                    menor = aux.getData();
                }
            }
            return menor;
        } else throw new NullPointerException("No hay elementos en la lista para identificar al menor");
    }

    public int posMenorTemperatura(){
        if (getHead() != null){
            float menor = menorTemperatura();
            int posicion = 0;
            Node<Float> aux = getHead();
            while (aux.getData() != menor){
                posicion++;
                aux = aux.getNext();
            } return posicion;
        } else throw new NullPointerException("No hay elementos en la lista para identificar la posición de la menor temperatura");
    }

    public boolean todosPositivos(){
        if (this.cantHeladas() == 0)
            return true;
        else return false;
    }

    // esta resolucion me permite comparar dos linkedlist que no contengan necesariamente la misma cantidad de elementos
    public int contarCoincidencias(TempMinEstacion e){
        int contador = 0;
        if (e.getQuantity() == 0 || this.getQuantity() == 0){
            return contador;
        }
        Node<Float> auxThis = this.getHead();
        Node<Float> auxE = e.getHead();
        while (auxThis != null || auxE != null){
            if (auxThis.getData().equals(auxE.getData())){ // es equals porque == compara si son el mismo objeto, equals compara si tienen el mismo valor
                contador++;
            }
            auxThis = auxThis.getNext();
            auxE = auxE.getNext();
        } return contador;
    }

    public TempMinEstacion invertir(){
        TempMinEstacion listaInvertida = new TempMinEstacion();
        Node<Float> aux = this.getHead();
        while (aux != null){
            listaInvertida.addValueStart(aux.getData());
            aux = aux.getNext();
        } return listaInvertida;
    }

    public void reemplazar(float val1, float val2){
        Node<Float> aux = this.getHead();
        while (aux != null){
            if (aux.getData().equals(val1)){
                aux.setData(val2);
            }
            aux= aux.getNext();
        }
    }

    /*public String intercambiar(int pos1, int pos2){
        if (getQuantity() >= pos1 && getQuantity() >= pos2){
            int pos = 0;
            Node<Float> aux = this.getHead();
            float auxVal = aux.getData();
            while (aux != null){
                if (pos == pos1 || pos == pos2){

                }
            }
        }
    }
     */

    public void invertirMe(){
        this.setHead(invertir().getHead());
    }

}
