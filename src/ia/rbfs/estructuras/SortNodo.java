package ia.rbfs.estructuras;

import java.util.Comparator;

public class SortNodo implements Comparator<Nodo> {
    @Override
    public int compare(Nodo nodo, Nodo nodo2) {
        return (int) nodo.getF() - (int)nodo2.getF();
    }
}
