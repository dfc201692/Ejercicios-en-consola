package cuentas;

import java.util.Scanner;

/**
 *
 * @author david.cruz
 */
public class Ciclo_if_numero_mayor_menor {

    public static void main(String[] args) {

        Scanner comienzo = new Scanner(System.in);
        
        System.out.println("Este programa sirve para hallar cual es numero mayor");

        int num1, num2;
        
        System.out.println("Por favor digite el primer numero");
        num1 = comienzo.nextInt();
        
        System.out.println("Por favor digite el segundo numero");
        num2 = comienzo.nextInt();
        
        if(num1>num2){
            System.out.println("El numero mayor es: "+num1);
        }else{
            System.out.println("El numero mayor es: "+num2);
        }
           
    }
    
}
