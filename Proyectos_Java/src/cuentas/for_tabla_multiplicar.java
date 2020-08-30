package cuentas;

import java.util.Scanner;

/**
 *
 * @author david.cruz
 */
public class for_tabla_multiplicar {

    /**
     * Tablas de multiplicar
     */
    public static void main(String[] args) {

        Scanner obtenernumero = new Scanner(System.in);
        int numero, i, j;

        System.out.print("Indica la tabla de multiplicar: ");
        numero = obtenernumero.nextInt();
        System.out.println("");

        for (i = 1; i <= numero; i++) { //for para hacer recorrido hasta el numero que indica el usuario 
            for (j = 1; j <= 10; j++) {//for para hacer el recorrido hasta 10
                System.out.println(i + " X " + j + " = " + i * j); // ejemplo 5 x 5 = 25
            }
            System.out.println(); //da un salto de linea 
        }

    }

}
