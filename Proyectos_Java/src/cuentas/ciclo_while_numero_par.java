package cuentas;

import java.util.Scanner;

/**
 * Numero Par
 * @author david.cruz
 */
public class ciclo_while_numero_par {

    public static void main(String[] args) {
    
        Scanner comienzo = new Scanner(System.in);
        
        int numero;
        System.out.print("Digite un numero par: ");
        numero = comienzo.nextInt();
        
        while(numero%2 == 0){
            System.out.print("Digita un numero: ");
            numero = comienzo.nextInt();
        }
        System.out.println("El numero es impar: "+numero);
    }
    
}
