package house_utils.comedor;

public class Comedor {
    private Mesa mesa;
    private Sillas[] sillas;
    private Servilletas[] servilletas;

    public Comedor() {
        this.mesa = new Mesa();
        this.sillas = new Sillas[4];
        for (int i = 0; i < sillas.length; i++) {
            sillas[i] = new Sillas();
        }
        this.servilletas = new Servilletas[100];
        for (int i = 0; i < servilletas.length; i++) {
            servilletas[i] = new Servilletas();
        }
    }

    public void showComedor() {
        System.out.println("/ Esto es el comedor /");
        mesa.usar();
        sillas[0].usar(sillas.length);
        servilletas[0].usar(servilletas.length);
    }
}