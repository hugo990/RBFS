package ia.rbfs.estructuras;

import ia.rbfs.Movimientos;

import java.util.ArrayList;
import java.util.Collections;

public class RBFS {

    private int n;
    private boolean encontrado = false;
    private Nodo nodoInicial;
    private Nodo NodoFinal;
    private ArrayList<Nodo> nodosHijos;
    private char[][] tablero;
    private Movimientos movimientos;

    public RBFS(int n, char[][] tablero) {
        this.n = n;
        this.tablero = tablero;
    }

    public void busqueda(Nodo nodo){
        movimientos = new Movimientos(n);
        nodoInicial = nodo;
        if(encontrado == false) {
            if(nodoInicial.getEstado().getX() != 4 && nodoInicial.getEstado().getY() != 4) {
                movimientos.irNorte(tablero, nodo);
                movimientos.irSur(tablero, nodo);
                movimientos.irEste(tablero, nodo);
                movimientos.irOeste(tablero, nodo);
                Collections.sort(nodo.getSucesores(), new SortNodo());
                if(nodo.getSucesores().get(1).getF() < nodo.getF()) {

                }
            }
        }
    }

}
