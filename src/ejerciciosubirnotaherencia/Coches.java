package ejerciciosubirnotaherencia;

public class Coches extends Vehiculo{
    private int plazas;

    public Coches(int plazas, String matricula) {
        super(matricula);
        this.plazas = plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public double precioTotal(int dias) {
        return super.precioTotal(dias)+(plazas*1.5*dias);
    }
}
