package ies.puerto.vehiculos;

import java.util.ArrayList;
import java.util.HashSet;


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
    Motocicleta obternerMotocicleta(String matricula){
        if (motocicletas.contains(matricula)) {
            return M

        }
    }
}
