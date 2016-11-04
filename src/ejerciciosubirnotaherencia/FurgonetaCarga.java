package ejerciciosubirnotaherencia;

public class FurgonetaCarga extends Vehiculo{
    private double pma;

    public FurgonetaCarga(double pma, String matricula) {
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
        return super.getPrecioBase()*dias+20*pma;
    }
    
    
}
