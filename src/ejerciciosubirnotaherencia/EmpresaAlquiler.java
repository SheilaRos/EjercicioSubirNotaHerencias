package ejerciciosubirnotaherencia;

import java.util.ArrayList;
import java.util.List;

public class EmpresaAlquiler {
    public static void main(String[] args) {
        List<Vehiculo> misVehiculos = new ArrayList<>();
        Coches miCoche = new Coches(4, "7478DFZ");
        Microbuses miMicrobus = new Microbuses(25, "6666SAT");
        FurgonetaCarga miFurgonetaCarga = new FurgonetaCarga(32.5, "4546MKT");
        Camiones miCamion=new Camiones(50.0, "8529ASD");
        
        misVehiculos.add(miCoche);
        misVehiculos.add(miMicrobus);
        misVehiculos.add(miFurgonetaCarga);
        misVehiculos.add(miCamion);
        
        for(Vehiculo v : misVehiculos){
            try{
                System.out.println("Introduce la matricula");
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
}
