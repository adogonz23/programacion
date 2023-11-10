package ies.puerto;
/** Supongamos que tenemos que implementar un programa que clasifica a los estudiantes según sus calificaciones en un examen.

Las notas son:

    Entre 0-4.99. Suspenso.

    Entre 5-6. Aprobado.

    Entre 6-6.99. Bien.

    Entre 7-8.99. Notable.

    Entre 9-9.99. Sobresaliente.

    Entre 10. Matrícula.

    Implementa la solución realizando dos métodos/programas. El primero utilizando if/else y el segundo utilizando switch.

 * @author adogonz23
 */


public class Notas {
    private double notas;

    public Notas(double notas) {
        this.notas = notas;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public String calificacion( double promedio){
        if (promedio <= 4.99) {  
            return "suspenso";
        }else{
            if ((promedio>=5)&&(promedio<=6.99)) {
                return "aprovado";
            }else{
                if ((promedio>=7)&&(promedio<=8.99)) {
                    return "bien";
                }else{
                    if ((promedio>=9)&&(promedio<=9.99)) {
                    return "sobresalinte";
                }else{
                    if ((promedio == 10.0)) {
                        return "matricula";
                    }
                }
                }

            }
        }
        return"";
    }
    public void calificacionSwitch(double notas){
        
        switch ((int)notas) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("supendido");
                break;
            case 5:
            case 6:
                System.out.println("aprovado");
                break;
            case 7:
            case 8:
            System.out.println("notable");
            break;
            case 9:
            System.out.println("Sobresaliente");
            break;
            case 10: 
            System.out.println("matricula");
            break;
            default:
            System.out.println("algo anda mal");
            break;

        }
        
    }
}


