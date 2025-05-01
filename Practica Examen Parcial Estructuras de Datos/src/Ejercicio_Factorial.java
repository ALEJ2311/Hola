
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_Factorial {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int factor;
        System.out.print("Ingrese numero del factorial que dese: ");
        factor = tcl.nextInt();
        System.out.println(factorial(factor));
        
    }
    
    public static int factorial(int factor){
        if (factor == 1) {
            return 1;
        }
        
        return factor * (factorial(factor - 1));
    }
    
}
