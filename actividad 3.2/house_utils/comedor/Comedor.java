
package house_utils.comedor;


public class Comedor {

    private Mesa mesa;
    private Sillas[] sillas;
    private Servilletas[] servilletas;
    private Vasos[] vasos;
    private Platos[] platos;
    private Frutas[] frutas;

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
        this.vasos = new Vasos[10];
        for (int i = 0; i < vasos.length; i++) {
            vasos[i] = new Vasos();
        }
        this.platos = new Platos[8];
        for (int i = 0; i < platos.length; i++) {
            platos[i] = new Platos();
        }
        this.frutas = new Frutas[5];
        for (int i = 0; i < frutas.length; i++) {
            frutas[i] = new Frutas();
        }
    }

    public void showComedor() {
        System.out.println("/ Esto es el comedor /");
        mesa.usar();
        sillas[0].usar(sillas.length);
        servilletas[0].usar(servilletas.length);
        vasos[0].usar(vasos.length);
        platos[0].usar(platos.length);
        frutas[0].usar(frutas.length);
    }
}
