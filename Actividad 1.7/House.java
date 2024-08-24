import house_utils.baño.Bano;
import house_utils.cocina.Cocina;
import house_utils.comedor.Comedor;
import house_utils.dormitorio.Dormitorio;
import house_utils.garaje.Garaje;
import house_utils.sala.Sala;

public class House {
    private Cocina cocina;
    private Comedor comedor;
    private Sala sala;
    private Dormitorio dormitorio;
    private Bano baño;
    private Garaje garaje;

    public House() {
        this.cocina = new Cocina();
        this.comedor = new Comedor();
        this.sala = new Sala();
        this.dormitorio = new Dormitorio();
        this.baño = new Bano();
        this.garaje = new Garaje();
    }

    public void showHouse() {
        System.out.println("[ Bienvenido a la casa de tus sueños! ]");
        cocina.showCocina();
        comedor.showComedor();
        sala.showSala();
        dormitorio.showDormitorio();
        baño.showBano();
        garaje.showGarage();
    }

    public static void main(String[] args) {
        House house = new House();
        house.showHouse();
    }
}