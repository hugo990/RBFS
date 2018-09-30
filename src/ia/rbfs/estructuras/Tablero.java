package ia.rbfs.estructuras;

public class Tablero {
    /**
     * Propiedades
     */
    private int n;
    private static final char obstaculo = 'o';
    private static final char libre = 'x';
    private static final char inicio = 'i';
    private static final char fin = 'f';
    private char[][] tablero;

    /**
     * Constructor del tablero
     * @param n int
     *  Recibe un parametro n, el cual es el tamaño del tablero
     */
    public Tablero(int n) {
        this.n = n;
        this.tablero = new char[n][n];
    }

    /**
     * Coloca el inicio en las coordenadas n,m
     * @param n int
     * @param m int
     */
    public void colocaInicio(int n, int m) {
        this.tablero[n][m] = inicio;
    }

    /**
     * Coloca el fin en las coordenadas n,m
     * @param n int
     * @param m int
     */
    public void colocaFin(int n, int m) {
        this.tablero[n][m] = fin;
    }

    /**
     * Llena el tablero con x, x = camino libre
     */
    public void llenarTablero() {
        for(int i = 0; i < this.n; i++) {
            for(int j = 0; j < this.n; j++) {
                this.tablero[i][j] = libre;
            }
        }
        colocaInicio(0, 0);
        colocaFin(this.n-1, this.n-1);
    }

    /**
     * Pinta el tablero en la consola
     */
    public void imprimeTablero() {
        for(int i = 0; i < this.n; i++) {
            for(int j = 0; j < this.n; j++) {
                System.out.print(this.tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /**
     * Genera una posicion aleatoria al cual representa una coordenada en el eje x
     * @return prosicionX int
     */
    private int posObstaculoX() {
        int posicionX = (int) (Math.random() * this.n);
        return posicionX;
    }

    /**
     * Genera una posicion aleatoria al cual representa una coordenada en el eje y
     * @return prosicionY int
     */
    private int posObstaculoY() {
        int posicionY = (int) (Math.random() * n);
        return posicionY;
    }

    /**
     * Posiciona un obstaculo con el simbolo o, generando la posicion con los metodos posObstaculoX y posObstaculoY
     * @param numObstaculos int
     */
    public void colocaObstaculos(int numObstaculos) {
        for(int i = 0; i < numObstaculos; i++) {
            this.tablero[this.posObstaculoX()][this.posObstaculoY()] = obstaculo;
        }
    }

    public char[][] getTablero() {
        return this.tablero;
    }

}
