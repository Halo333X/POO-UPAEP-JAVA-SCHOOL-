package house_utils.sala;

public class Sala {
    private Sillones[] sillones;
    private MesaBaja mesaBaja;
    private TV tv;

    public Sala() {
        this.sillones = new Sillones[3];
        for (int i = 0; i < sillones.length; i++) {
            sillones[i] = new Sillones();
        }
        this.mesaBaja = new MesaBaja();
        this.tv = new TV();
    }

    public void showSala() {
        System.out.println("/ Esto es la sala /");
        sillones[0].usar(sillones.length);
        mesaBaja.usar();
        tv.usar();
    }
}