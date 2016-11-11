package ejerciciosubirnotaherencia;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        try{
            boolean salir=false;
            do{
                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Introduce la matricula de uno de nuestros vehículos:");
                String matricula= br.readLine();
            for(Vehiculo v : misVehiculos){
                if(v.getMatricula().equalsIgnoreCase(matricula)){
                    System.out.println("Introduce los días que desea utilizarlos:");
                    int dias=Integer.parseInt(br.readLine());
                    if(v instanceof Coches){
                         Coches coche = (Coches) v;
                        System.out.println(coche.precioTotal(dias));
                    }
                    else if(v instanceof Microbuses){
                         Microbuses microbus = (Microbuses) v;
                        System.out.println(microbus.precioTotal(dias));
                    }
                    else if(v instanceof Camiones){
                         Camiones camion = (Camiones) v;
                        System.out.println(camion.precioTotal(dias));
                    }
                    else if(v instanceof FurgonetaCarga){
                        FurgonetaCarga furgo = (FurgonetaCarga) v;
                        System.out.println(furgo.precioTotal(dias));
                    }
                    salir=true;
                }        
              }
                if(!salir){
                    System.out.println("No exite ningún vehículo con esta matricula en nuestra BBDD.");
                }
            }while(!salir);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
