package ies.puerto.presentacion;

import ies.puerto.modelo.abstractas.Articulo;
import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.fichero.csv.implementacion.FileCsv;
import ies.puerto.negocio.abstractas.TiendaNegocio;

import java.util.List;
import java.util.Scanner;

import javax.swing.SwingConstants;


public class AppTienda {
    static TiendaNegocio tiendaNegocio;
    static Scanner scanner;
        
    public static void main(String[] args) {
        tiendaNegocio = new TiendaNegocio();
        scanner = new Scanner(System.in);
        
        int opcion = 0;
        do {
            System.out.println("********MENU********");
            System.out.println("1.Mostrar Listas");
            System.out.println("2.Agregar Articulo");
            System.out.println("3.Eliminar Articulo");
            System.out.println("4.Actualizar Articulo");
            System.out.println("5.Mostrar Recomendados");
            System.out.println("6.Mostrar Ganancias");
            System.out.println("7.salir");
            System.out.println("**********************");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                        menuListas();
                    break;
                case 2:
                        menuArticulos();
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break; 
                case 5:
                    //tiendaNegocio.mostrarRecomendados(tiendaNegocio.obtenerCuidados());
                    break;
                case 6:
                    tiendaNegocio.ganancias();
                    break;               
                default:
                    break;
            }
        } while (opcion !=7);
    }
    public static void menuListas(){
        scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Que listas desea mostrar");
        System.out.println("1.Mostrar Todos los articulos");
        System.out.println("2.Mostrar Alimentos");
        System.out.println("3.Mostrar Souvenirs");
        System.out.println("4.Mostrar Aparatos");
        System.out.println("5.Mostrar Cuidado personal");
        System.out.println("6.volver atras");
        opcion= scanner.nextInt();
        scanner.close();
        switch (opcion) {
            case 1:
                System.out.println(tiendaNegocio.obtenerArticulos());
                break;
            case 2:
                System.out.println(tiendaNegocio.obtenerAlimentos());
                break;
            case 3:
                System.out.println(tiendaNegocio.obtenerSouvenirs());
                break;
            case 4:
                System.out.println(tiendaNegocio.obtenerAparatos());
                break; 
            case 5:
                System.out.println(tiendaNegocio.obtenerCuidados());

                break;
                        
            default:
            System.out.println("opcion invalida");
                break;
        }
        } while (opcion!= 6);
        
    }
    public static void menuArticulos(){
        scanner= new Scanner(System.in);
        int opcion= 0;
        do {
        System.out.println("Introduzca el tipo de articulo");
        System.out.println("1.Alimento");
        System.out.println("2.Souvenir");
        System.out.println("3.Aparato");
        System.out.println("4.CuidadoPersonal");
        System.out.println("5.salir");
        opcion = scanner.nextInt();
        } while (opcion !=5);
        
        
        
        
    }
    public static void menuDatos(){
        scanner= new Scanner(System.in);
        int opcion =2;
        switch (opcion) {
            case 1:
                System.out.println("introduzca el nombre");
                String nombreAlimento =scanner.nextLine();
                System.out.println("introduzca el Id");
                String idAlimento =scanner.nextLine();
                System.out.println("introduzca el fecha de Entrada");
                String fEntradaAlimento =scanner.nextLine();
                System.out.println("introduzca el precio");
                Float precioAlimento =scanner.nextFloat();
                System.out.println("introduzca el fecha de caducidad");
                String fCaducidad =scanner.nextLine();
                Alimento alimento = new Alimento(idAlimento, nombreAlimento, precioAlimento, fCaducidad, fEntradaAlimento);
                
                break;
                case 4:
                System.out.println("introduzca el nombre");
                String nombreCuidados =scanner.nextLine();
                System.out.println("introduzca el Id");
                String idCuidados =scanner.nextLine();
                System.out.println("introduzca el fecha de Entrada");
                String fEntradaCuidados =scanner.nextLine();
                System.out.println("introduzca el precio");
                Float precioCuidados =scanner.nextFloat();
                System.out.println("introduzca la popularidad del producto");
                int popularidad =scanner.nextInt();
                break;
        
            default:
                System.out.println("introduzca el nombre");
                String nombre =scanner.nextLine();
                System.out.println("introduzca el Id");
                String id =scanner.nextLine();
                System.out.println("introduzca el fecha de Entrada");
                String fEntrada =scanner.nextLine();
                System.out.println("introduzca el precio");
                Float precio =scanner.nextFloat();
                break;
        }

    }

}
