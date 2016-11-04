package ejerciciosubirnotaherencia;

public class Camiones extends Vehiculo{
    private double pma;

    public Camiones(double pma, String matricula) {
        super(matricula);
        this.pma = pma;
    }

    public double getPma() {
        return pma;
    }

    public void setPma(double pma) {
        this.pma = pma;
    }

    @Override
    public double precioTotal(int dias) {
        return super.getPrecioBase()*dias+20*pma+40;
    }
    
}
