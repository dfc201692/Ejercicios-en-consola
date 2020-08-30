package cuentas;

import java.util.Scanner;

public class suma {

    public static void main(String[] args) {

        //SE PONE LA LIBERIA SCANNER PARA QUE CAPTURE LOS NUMEROS 
        Scanner reader = new Scanner(System.in); 

        //SE DEFINEN LAS VARIABLES
        int numero1 = 0;
        int numero2 = 0;
        int r = 0;

        //SE SOLICITA EL PRIMERO NUMERO
        System.out.println("Introduce el primer número:");
        numero1 = reader.nextInt();

        //SE SOLICITA EL SEGUNDO NUMERO
        System.out.println("Introduce el segundo número:");
        numero2 = reader.nextInt();

        //PRESENTA EL RESULTADO DE LA OPERACION
        r = numero1 + numero2;

        //SE IMPRIME EL RESULTADO EN CONSOLA
        System.out.println("La suma de " + numero1 + " + " + numero2 + " = " + r);

    }

}
