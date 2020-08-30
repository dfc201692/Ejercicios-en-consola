package cuentas;

import java.util.Scanner;

/**
 *
 * @author david.cruz
 */
public class ciclo_mientras {

    public static void main(String[] args) {
        Scanner comienzo = new Scanner(System.in);

        System.out.println("Este programa sirve para contar los numero del 1 al 100");

        int numero1 = 0, cont = 0; //se define el numero y el cont
 
        System.out.println("Numero del 1 al 100"); //mensaje

        //ciclo while 
        while (numero1 < 100) { //se define el numero inicial hasta el 100
            numero1++; // adiciona de 1 en 1 
            System.out.println(numero1); //Imprime los numeros por consola
        }

    }

}
