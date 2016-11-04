package ejerciciosubirnotaherencia;

public class Vehiculo {
    private String matricula;
    final private int precioBase = 50;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getPrecioBase() {
        return precioBase;
    }
    public double precioTotal(int dias){
        return precioBase * dias;
    }
}
