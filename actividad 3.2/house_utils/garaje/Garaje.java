package house_utils.garaje;

public class Garaje {
    private Carros[] carros;
    private Taller taller;
    private Puerta puerta;

    public Garaje() {
        this.carros = new Carros[2];
        for (int i = 0; i < carros.length; i++) {
            carros[i] = new Carros();
        }
        this.taller = new Taller();
        this.puerta = new Puerta();
    }
    public void showGarage() {
        System.out.println("/ Esto es el garaje /");
        carros[0].usar(carros.length);
        taller.usar();
        puerta.usar();
    }
}

// No se me ocurrió nada más profa para el Garaje tampoco :c
