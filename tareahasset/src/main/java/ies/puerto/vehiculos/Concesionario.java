package ies.puerto.vehiculos;

import java.util.ArrayList;
import java.util.HashSet;


import ies.puerto.abstractas.Vehiculo;


public class Concesionario {
    private HashSet<Coche>coches;
    private ArrayList<Motocicleta>motocicletas;


    
    public Concesionario() {
    }
    public Concesionario(ArrayList<Motocicleta> motocicletas) {
        this.motocicletas = motocicletas;
    }
    public Concesionario(HashSet<Coche> coches) {
        this.coches = coches;
    }
    public Concesionario(HashSet<Coche> coches, ArrayList<Motocicleta> motocicletas) {
        this.coches = coches;
        this.motocicletas = motocicletas;
    }
    public HashSet<Coche> getCoches() {
        return coches;
    }
    public void setCoches(HashSet<Coche> coches) {
        this.coches = coches;
    }
    public ArrayList<Motocicleta> getMotocicletas() {
        return motocicletas;
    }
    public void setMotocicletas(ArrayList<Motocicleta> motocicletas) {
        this.motocicletas = motocicletas;
    }
    boolean addMotocicleta (Motocicleta motocicleta){
        if (motocicletas.contains(motocicleta)) {
            return false;
        }
        motocicletas.add(motocicleta);
        return true;
    }
    boolean removeMotocicleta (Motocicleta motocicleta){
        if (motocicletas.contains(motocicleta)) {
            motocicletas.remove(motocicleta);
            return true;
        }
        
        return false;
    }
    boolean addCoche (Coche coche){
        if (coches.contains(coche)) {
            return false;
        }
        coches.add(coche);
        return true;
    }
    boolean removeCoche (Coche coche){
        if (coches.contains(coche)) {
            coches.remove(coche);
            return true;
        }
        
        return false;
    }
    float velocidadMediaCoches(){
        float resultado= 0;
        if (coches.isEmpty()) {
            return resultado;
        }
        for (Coche coche : coches) {
            resultado+=coche.getVelocidad();
        }
        resultado=resultado/coches.size();
        return resultado;
    }
    float velocidadMediaMotos(){
        float resultado= 0;
        if (motocicletas.isEmpty()) {
            return resultado;
        }
        for (Motocicleta motocicleta : motocicletas) {
            resultado+= motocicleta.getVelocidad();
        }
        resultado=resultado/motocicletas.size();
        return resultado;
    }
    float mediaVehiculos(){
        float resultado=0;
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.addAll(motocicletas);
        vehiculos.addAll(coches);
        if (vehiculos.isEmpty()) {
            return resultado;
        }
        for (Vehiculo vehiculo : vehiculos) {
            resultado+=vehiculo.getVelocidad();

        }
        resultado=resultado/vehiculos.size();
        
        return resultado;
    }
    
}
