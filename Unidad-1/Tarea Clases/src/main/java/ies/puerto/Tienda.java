package ies.puerto;


import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Producto>inventario;

    public List<Producto> getInventario() {
        return inventario;
    }
    public void setInventario(List<Producto> inventario) {
        this.inventario = inventario;
    }
    /**
     * constructor basico
     */
    public Tienda(){
        this.inventario= new ArrayList<>();

    }
    /**
     * metodo qeu agrega el producto a nuestro array list inventario
     * @param producto 
     */
    public void agregarProducto(Producto producto){
        inventario.add(producto);
    }
    /**
     * 
     * @param nombre de producto    
     * @param cantidad cantidad de producto que se desea
     */
    public void venderProductos(String nombre, int cantidad){
        int nuevoStock=0;
        for(Producto producto:inventario){
            if (producto.getNombre().equals(nombre)) {
                if (producto.getStock()>=cantidad) {
                    nuevoStock= producto.getStock()-cantidad;
                    producto.setStock(nuevoStock);
                            
                }else{
                System.out.println("producto no encontrado");}
            }
        }
        
    }
    public String mostrarInventario(){
        for(Producto producto:inventario){
            return "Nombre: "+producto.getNombre()+", precio: "+producto.getPrecio()+", Stock: "+producto.getStock();
        }
        return"";
    }
    
} 
