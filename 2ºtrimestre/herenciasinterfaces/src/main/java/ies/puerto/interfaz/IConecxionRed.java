package ies.puerto.interfaz;
/**
 * Define una interfaz IConexionRed que declare un método conectar(). Implementa esta interfaz en dos clases: ConexionEthernet y ConexionWifi. 
 * Proporciona implementaciones concretas para conectar en ambas clases. (Conectando vía Ethernet y Conectando vía Wifi) respectivamente.
 */
public interface IConecxionRed {
    public String conectar();
}
