package ies.puerto.app;



import ies.puerto.vehiculos.Coche;
import ies.puerto.vehiculos.Concesionario;
import ies.puerto.vehiculos.Motocicleta;

public class AppConcecionario {
    
    
    
    
    
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();

        concesionario.addMotocicleta(new Motocicleta("Yamaha","YZF","PQR678",90));
        concesionario.addMotocicleta(new Motocicleta("Harley-Davidson","Sportster","MNO345",50));
        concesionario.addMotocicleta(new Motocicleta("DUCATI","MONSTER","STU901",70));
        concesionario.addMotocicleta(new Motocicleta("SUZUKI","GSX-R750","VWX234",80));
        concesionario.addMotocicleta(new Motocicleta("KAWASAKI","NINJA","ZAB567",85));
        concesionario.addCoche(new Coche("toyota","Corola","ABC123", 50));
        concesionario.addCoche(new Coche("Honda","Civic","XYZ789",75));
        concesionario.addCoche(new Coche("Ford","Mustang","DEF456",100));
        concesionario.addCoche(new Coche("Chevrolet","Impala","GHI789",80));
        concesionario.addCoche(new Coche("Volkswagen","Golf","JKL012",65));

        for (Motocicleta moto : concesionario.getMotocicletas()) {
            System.out.println(moto);
        }
        for (Coche coche : concesionario.getCoches()){
            System.out.println(coche);
        }
        System.out.println("Velocidad media de coches es = "+concesionario.velocidadMediaCoches());
        System.out.println("Velocidad media de todos los vehivulos del concecvionario es = "+concesionario.mediaVehiculos());
    }
    }

