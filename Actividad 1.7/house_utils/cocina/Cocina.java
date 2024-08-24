package house_utils.cocina;

public class Cocina {
    private Cubiertos cubiertos;
    private Horno horno;
    private Parrilla parrilla;

    public Cocina() {
        this.cubiertos = new Cubiertos();
        this.horno = new Horno();
        this.parrilla = new Parrilla();
    }

    public void showCocina() {
        System.out.println("/ Esto es la cocina /");
        cubiertos.usar();
        horno.usar();
        parrilla.usar();
    }
}