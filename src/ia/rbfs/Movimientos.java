package ia.rbfs;

import ia.rbfs.estructuras.Nodo;
import ia.rbfs.heuristica.Heuristica;

import java.util.ArrayList;

public class Movimientos {

    private int n;
    private ArrayList<Nodo> nodosHijos = new ArrayList<Nodo>();

    public Movimientos(int n) {
        this.n = n;
    }

    public void irNorte(char[][] tablero, Nodo nodo) {
        try {
            if(tablero[nodo.getEstado().getX()][nodo.getEstado().getY() - 1] == 'x') {
                int g = nodo.getG() + 1;
                double h = Heuristica.costoH(nodo.getEstado().getX(), nodo.getEstado().getY() - 1, n - 1, n - 1);
                Nodo nodoHijo = new Nodo(g + h, g, h, 0, nodo.getEstado().getX(), nodo.getEstado().getY() - 1, nodo,null);
                nodoHijo.setPadre(nodo);
                nodo.getSucesores().add(nodoHijo);
            }
        } catch (ArrayIndexOutOfBoundsException e) { }
    }


    public void irSur(char[][] tablero, Nodo nodo) {
        try {
            if(tablero[nodo.getEstado().getX()][nodo.getEstado().getY() + 1] == 'x') {
                double h = Heuristica.costoH(nodo.getEstado().getX(), nodo.getEstado().getY() + 1, n - 1, n - 1);
                int g = nodo.getG() + 1;
                Nodo nodoHijo = new Nodo(g + h, g, h, 0, nodo.getEstado().getX(), nodo.getEstado().getY() + 1, nodo,null);
                nodoHijo.setPadre(nodo);
                nodo.getSucesores().add(nodoHijo);
            }
        } catch (ArrayIndexOutOfBoundsException e) { }
    }


    public void irEste(char[][] tablero, Nodo nodo) {
        try {
            if(tablero[nodo.getEstado().getX() + 1][nodo.getEstado().getY()] == 'x') {
                double h = Heuristica.costoH(nodo.getEstado().getX() + 1, nodo.getEstado().getY(), n - 1, n - 1);
                int g = nodo.getG() + 1;
                Nodo nodoHijo = new Nodo(g + h, g, h, 0, nodo.getEstado().getX() + 1, nodo.getEstado().getY(), nodo,null);
                nodoHijo.setPadre(nodo);
                nodo.getSucesores().add(nodoHijo);
            }
        } catch (ArrayIndexOutOfBoundsException e) { }
    }


    public void irOeste(char[][] tablero, Nodo nodo) {
        try {
            if(tablero[nodo.getEstado().getX() - 1][nodo.getEstado().getY()] == 'x') {
                int g = nodo.getG() + 1;
                double h = Heuristica.costoH(nodo.getEstado().getX() - 1, nodo.getEstado().getY(), n - 1, n - 1);
                Nodo nodoHijo = new Nodo(g + h, g, h, 0, nodo.getEstado().getX() - 1, nodo.getEstado().getY(), nodo,null);
                nodoHijo.setPadre(nodo);
                nodo.getSucesores().add(nodoHijo);
            }
        } catch (ArrayIndexOutOfBoundsException e) { }
    }

    public ArrayList<Nodo> getHijos() {
        return this.nodosHijos;
    }



}
