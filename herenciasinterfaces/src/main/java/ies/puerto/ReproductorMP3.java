package ies.puerto;

public class ReproductorMP3 implements IReproductor {
    private String estadoCancion;
    

    public ReproductorMP3(String estadoCancion) {
        this.estadoCancion = estadoCancion;
    }

    public String getEstadoCancion() {
        return estadoCancion;
    }

    public void setEstadoCancion(String estadoCancion) {
        this.estadoCancion = estadoCancion;
    }

    @Override
    public void detener() {
        if (estadoCancion.equalsIgnoreCase("reproduciendo")) {
            this.estadoCancion= "detenida";
        }
    }
    @Override
    public void reproducir() {
        if (estadoCancion.equalsIgnoreCase("detenida")) {
            this.estadoCancion= "reproduciendo";
        }
    }
    @Override
    public String toString(){
        return "la canciona ahora mismo esta: "+estadoCancion;
    }
}
