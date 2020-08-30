package cuentas;

import java.util.Scanner;

/**
 *
 * @author david.cruz
 */
public class ciclo_if_mayor_de_edad {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Este programa sirve para decir si la persona es mayor de edad o mnor de edad");

        int numero;
        
        System.out.println("Digite el primer numero");
        numero = num.nextInt();
        
        if(numero >18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
    
}
