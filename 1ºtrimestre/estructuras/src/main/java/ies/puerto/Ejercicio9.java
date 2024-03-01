package ies.puerto;
/** 
 * @author adogonz
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int[] arrray={40,60,30,80,50,45,70};
        for(int num : arrray){
            if (num<=50) {
                continue;
            }
            System.out.println(num);
        }
        for(int num : arrray){
            if (num>50) {
                System.out.println(num);   
            }
        
        }
    }
}
