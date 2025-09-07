public class LinkedList {
    private Nodo head;
    private int cantidad;

    public LinkedList (){
        head= null;
        cantidad= 0;
    }

    public void agregarPrimero(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        if (cantidad==0){
            head = nuevoNodo;
            cantidad++;
        } else {
            Nodo nodoSiguiente = head;
            head = nuevoNodo;
            head.setSiguiente(nodoSiguiente);
            cantidad++;
        }
    }

    public void agregarUltimo(int valor){
        if (cantidad==0){
            agregarPrimero(valor);
        } else {
            Nodo nuevoNodo = new Nodo(valor);
            Nodo aux = head;
            while (aux.getSiguiente()!=null){
                aux= aux.getSiguiente();
            }
            aux.setSiguiente(nuevoNodo);
            cantidad++;
        }
    }

    public void eliminarPrimero(){
        String mensaje = "No se pudo eliminar el primer elemento";
        if (cantidad!=0){
            Nodo segundoNodo = head.getSiguiente();
            head.setSiguiente(null);
            head= segundoNodo;
            cantidad--;
            mensaje = "Se eliminó el primer elemento";
        }
    }

    public void eliminarUltimo(){
        String mensaje = "No se pudo eliminar el último elemento";
        if (cantidad == 1){
            eliminarPrimero();
        } else if (cantidad!=0){
            Nodo aux = head;
            while (aux.getSiguiente().getSiguiente()!=null){
                aux= aux.getSiguiente();
            }
            aux.setSiguiente(null);
            cantidad--;
            mensaje = "Se eliminó el último elemento";
        }
    }

}
