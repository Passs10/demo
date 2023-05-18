
public class Cella {
    private int r;
    private char c;
    private Nave nave;
    private boolean colpita;
    private boolean occupata;


    /**
     * Default constructor
     */
    public Cella(int r, char c) {
        this.r = r;
        this.c = c;
        nave = null;
        colpita = false;
        occupata = false;
    }

    public int getRiga() {
        return r;
    }

    public char getColonna() {
        return c;
    }

    public Nave getNave() {
        return nave;
    }

    public boolean isColpita() {
        return colpita;
    }

    public boolean isOccupata() {
        return occupata;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

}