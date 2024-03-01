package ies.puerto.negocio.abstractas;

import ies.puerto.modelo.abstractas.Articulo;
import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.entity.CuidadoPersonal;
import ies.puerto.modelo.fichero.csv.implementacion.FileCsv;

import java.util.ArrayList;
import java.util.List;

public class TiendaNegocio {
    FileCsv fileCsv;
    public TiendaNegocio() {
        fileCsv = new FileCsv();
    }

    public List<Articulo> obtenerAlimentos() {
        return fileCsv.obtenerAlimentos();
    }

    public List<Articulo> obtenerAparatos() {
        return fileCsv.obtenerAparatos();
    }

    public List<Articulo> obtenerSouvenirs() {
        return fileCsv.obtenerSouvenirs();
    }

    public List<Articulo> obtenerCuidados() {
        return fileCsv.obtenerCuidados();
    }

    public List<Articulo> obtenerArticulos() {
        List<Articulo> articulos = new ArrayList<>();
        articulos.addAll(fileCsv.obtenerAlimentos());
        articulos.addAll(fileCsv.obtenerAparatos());
        articulos.addAll(fileCsv.obtenerSouvenirs());
        articulos.addAll(fileCsv.obtenerCuidados());

        return articulos;
    }
    
    public List<CuidadoPersonal> mostrarRecomendados(List<CuidadoPersonal>cuidadoPersonal){
        List<CuidadoPersonal> recomendados = new ArrayList<>();
        for (CuidadoPersonal cuidadoPersonal2 : cuidadoPersonal) {
            if (cuidadoPersonal2.recomendable()) {
                recomendados.add(cuidadoPersonal2);
            }
        }
        return recomendados;
    }
    public boolean comprobarListas(List<Articulo>articulos){
        return (articulos.isEmpty());
    }
    public boolean existeArticulo(List<Articulo>articulos, Articulo articulo){
        return articulos.contains(articulo);
    }
    public int cantidadArticulos(List<Articulo>articulos){
        return articulos.size();
    }
    public float precioTotalArticulo(List<Articulo> articulos){
        float resultado=0;
        if (comprobarListas(articulos)) {
            return resultado;
        }
        for (Articulo articulo : articulos) {
            resultado += articulo.getPrecio();
        }
        return resultado;
    }
    public float precioTotalAlimentos(List<Alimento>alimentos){
        float resultado=0;
        if (alimentos.isEmpty()) {
            return resultado;
        }
        for (Alimento alimento : alimentos) {
            if (!alimento.esCaducado()) {
                resultado+= alimento.getPrecio();
            }
        }
        return resultado;
    }
    public float precioTotalTienda( ){
        return precioTotalArticulo(obtenerAparatos())+precioTotalArticulo(obtenerCuidados())
        +precioTotalArticulo(obtenerSouvenirs());
    }
    public float precioTotalTiendaMaximo( ){
        return (precioTotalArticulo(obtenerAparatos())* 1.42f) +(precioTotalArticulo(obtenerCuidados())* 1.8f)
        +(precioTotalArticulo(obtenerSouvenirs())*1.3f);
    }
    public float precioMaximoArticulos(String lista){
        switch (lista) {
                case "Aparatos":
                    return precioTotalArticulo(obtenerAparatos())* 1.42f;
                case "Cuidados":
                    return precioTotalArticulo(obtenerCuidados())* 1.8f;
                case "Souvenir":
                    return precioTotalArticulo(obtenerSouvenirs()) *1.3f;
                case "Alimentos":
                    
            default:
            return 0;
                
        }
    }
    public float ganancias(){
        return precioTotalTiendaMaximo() - precioTotalTienda();
    }
    public boolean existeProducto(Articulo articulo){
        return obtenerArticulos().contains(articulo);
    }
    public Articulo obtenerProducto(Articulo articulo) {
        if (existeProducto(articulo)) {
            int posicion =obtenerArticulos().indexOf(articulo);
            return obtenerArticulos().get(posicion);
        }
        return null;
    }
    public boolean crearProducto(Articulo articulo) {
        if (!existeProducto(articulo)) {
            return obtenerArticulos().add(articulo);
        }
        return true;
    }
    public boolean actualizarProducto(Articulo articulo) {
        if (existeProducto(articulo)) {
            int posicion =obtenerAlimentos().indexOf(articulo);
            obtenerArticulos().set(posicion, articulo);
            return true;
        }
        return true;
    }
    public boolean eliminarProducto(Articulo articulo) {
    return obtenerArticulos().remove(articulo);
    }
}
