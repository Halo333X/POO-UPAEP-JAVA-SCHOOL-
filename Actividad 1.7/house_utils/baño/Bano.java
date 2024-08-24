package house_utils.baño;

public class Bano {
    private WC wc;
    private Regadera regadera;
    private Lavabo lavabo;
    private Espejo espejo;

    public Bano() {
        this.wc = new WC();
        this.regadera = new Regadera();
        this.lavabo = new Lavabo();
        this.espejo = new Espejo();
    }

    public void showBano() {
        System.out.println("/ Esto es el baño /");
        wc.usar();
        regadera.usar();
        lavabo.usar();
        espejo.usar();
    }
}
