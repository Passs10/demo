
public class Nave {
    private int dimensione;
    private int celleRimaste;
    private boolean affondata;
    private Cella[] celle;


    /**
     * Default constructor
     */
    public Nave(int dimensione, int celleRimaste) {
        this.dimensione = dimensione;
        this.celleRimaste = dimensione;
        this.affondata = false;
        
    }

    public int getDimensione() {
        return dimensione;
    }
    
    public int getCelleRimaste() {
        return celleRimaste;
    }

    public boolean isAffondata() {
        return affondata;
    }

    public void setAffondata() {
        affondata = true;
    }

    public void setCella(Cella[] celle) {
        this.celle = celle;
    }

}