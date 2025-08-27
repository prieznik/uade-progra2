//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList listaPrueba = new LinkedList();

        listaPrueba.agregarPrimero(1);
        listaPrueba.agregarPrimero(5);
        listaPrueba.agregarUltimo(8);
        listaPrueba.eliminarPrimero();
        listaPrueba.eliminarUltimo();
    }
}