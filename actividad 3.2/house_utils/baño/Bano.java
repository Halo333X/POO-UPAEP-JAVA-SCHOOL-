package house_utils.baño;

public class Bano {
    private WC wc;
    private Regadera regadera;
    private Lavabo lavabo;
    private Espejo espejo;
    private Toallas[] toallas;
    private Tapete tapete;

    public Bano() {
        this.wc = new WC();
        this.regadera = new Regadera();
        this.lavabo = new Lavabo();
        this.espejo = new Espejo();
        this.toallas = new Toallas[2];
        for (int i = 0; i < toallas.length; i++) {
            this.toallas[i] = new Toallas();
        }
        this.tapete = new Tapete();
    }

    public void showBano() {
        System.out.println("/ Esto es el baño /");
        wc.usar();
        regadera.usar();
        lavabo.usar();
        espejo.usar();
        toallas[0].usar(toallas.length);
        tapete.usar();
    }
}
