package ia.rbfs.estructuras;

import java.util.ArrayList;

public class Nodo {
    private int g, etiqueta;
    private double f, h;
    private Estado estado;
    private Nodo padre;
    private ArrayList<Nodo> sucesores;

    public Nodo(double f, int g, double h, int etiqueta, int x, int y, Nodo padre, Nodo sucesores) {
        this.f = f;
        this. g = g;
        this.h = h;
        this.etiqueta = etiqueta;
        this.estado = new Estado(x, y);
        this.sucesores = new ArrayList<Nodo>();
    }

    public Estado getEstado() {
        return this.estado;
    }

    public double getF() {
        return f;
    }

    public int getG() {
        return g;
    }

    public double getH() {
        return h;
    }

    public Nodo getPadre() {
        return padre;
    }

    public ArrayList<Nodo> getSucesores() {
        return sucesores;
    }

    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public void setSucesores(ArrayList<Nodo> sucesores) {
        this.sucesores = sucesores;
    }
}
