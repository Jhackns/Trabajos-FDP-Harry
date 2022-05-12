import java.util.Scanner;
import java.util.jar.Manifest;

/**
 * EjerciciosR
 */
public class EjerciciosR {

    public static void imprimirWhileN1_20() {
        int numInit=20;
        while (numInit<=20) {
            System.out.println( numInit);
            numInit=numInit+1;
        }
    }
    public static void imprimirDowhilen1_20() {
        int numInit=20;
        do {
            System.out.println(numInit);
            numInit++;
        } while (numInit<=20);
    }
    public static void ImprimirForN1_20() {
        for (int numInit = 1; numInit <= 20; numInit++) {
            System.out.println(numInit);
            
        }
        
    }
    public static void nombrevertical() {
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre=lt.next();
        for (int i = nombre.length()-1; i >=0; i--) {
            System.out.println(nombre.charAt(i));
        }
    }

    public static void main(String[] args) {
       /*System.out.println("Imprime while:"); imprimirWhileN1_20();
       System.out.println("Imprime Do while:"); imprimirDowhilen1_20();
       System.out.println("Imprime for:"); ImprimirForN1_20();*/

       nombrevertical();
       
    }
        
    }

