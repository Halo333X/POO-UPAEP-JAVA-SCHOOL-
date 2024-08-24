package house_utils.sala;

public class Sala {
    private Sillones[] sillones;
    private MesaBaja mesaBaja;
    private TV tv;
    private ControlTV controlTV;

    public Sala() {
        this.sillones = new Sillones[3];
        for (int i = 0; i < sillones.length; i++) {
            sillones[i] = new Sillones();
        }
        this.mesaBaja = new MesaBaja();
        this.tv = new TV();
        this.controlTV = new ControlTV();
    }

    public void showSala() {
        System.out.println("/ Esto es la sala /");
        sillones[0].usar(sillones.length);
        mesaBaja.usar();
        tv.usar();
        controlTV.usar();
    }
}

// No se me ocurrió nada más profa para la Sala :C