package house_utils.cocina;

public class Cocina {
    private Cubiertos cubiertos;
    private Horno horno;
    private Parrilla parrilla;
    private Refrigerador refrigerador;
    private Lavabo lavabo;
    private Microondas microondas;

    public Cocina() {
        this.cubiertos = new Cubiertos();
        this.horno = new Horno();
        this.parrilla = new Parrilla();
        this.refrigerador = new Refrigerador();
        this.lavabo = new Lavabo();
        this.microondas = new Microondas();
    }

    public void showCocina() {
        System.out.println("/ Esto es la cocina /");
        cubiertos.usar();
        horno.usar();
        parrilla.usar();
        refrigerador.usar();
        lavabo.usar();
        microondas.usar();
    }
}