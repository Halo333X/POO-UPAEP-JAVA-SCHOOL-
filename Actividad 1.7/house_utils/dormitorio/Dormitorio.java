package house_utils.dormitorio;

public class Dormitorio {

    private Camas[] camas;
    private MesitasDeNoche[] mesitasDeNoche;
    private Lamparas[] lamparas;
    private Closets[] closets;

    public Dormitorio() {
        this.camas = new Camas[2];
        for (int i = 0; i < camas.length; i++) {
            camas[i] = new Camas();
        }
        this.mesitasDeNoche = new MesitasDeNoche[2];
        for (int i = 0; i < mesitasDeNoche.length; i++) {
            mesitasDeNoche[i] = new MesitasDeNoche();
        }
        this.lamparas = new Lamparas[2];
        for (int i = 0; i < lamparas.length; i++) {
            lamparas[i] = new Lamparas();
        }
        this.closets = new Closets[2];
        for (int i = 0; i < closets.length; i++) {
            closets[i] = new Closets();
        }
    }

    public void showDormitorio() {
        System.out.println("/ Esto es el dormitorio /");
        camas[0].usar(camas.length);
        mesitasDeNoche[0].usar(mesitasDeNoche.length);
        lamparas[0].usar(lamparas.length);
        closets[0].usar(closets.length);
    }
}
