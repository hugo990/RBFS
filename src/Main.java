import ia.rbfs.estructuras.Nodo;
import ia.rbfs.estructuras.RBFS;
import ia.rbfs.estructuras.Tablero;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        Tablero tablero = new Tablero(n);
        char[][] tab = tablero.getTablero();

        tablero.llenarTablero();
        tablero.colocaObstaculos(4);
        tablero.imprimeTablero();
        RBFS rbfs = new RBFS(n, tab);
        rbfs.busqueda(new Nodo(0, 0, 0, 0, 0, 0, null, null));
    }
}
