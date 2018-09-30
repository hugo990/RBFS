package ia.rbfs.heuristica;

public class Heuristica {

    public static final double costoH(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

    }
}
