package ejerciciosubirnotaherencia;

public class Microbuses extends Vehiculo{
    private int plazas;
    public Microbuses(int plazas, String matricula) {
        super(matricula);
        this.plazas = plazas;
    }

    @Override
    public double precioTotal(int dias) {
        return super.precioTotal(dias)+(plazas*1.5*dias)+(2*plazas);
    }
    
}
