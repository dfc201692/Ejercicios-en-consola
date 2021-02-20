package cuentas;

import java.util.Scanner;

/**
 * @author david.cruz
 */
public class imprime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la piramide: ");
        int in = sc.nextInt();
        int contador = in;
        sc.close();
        int espacio = contador;
        for (int j = 1; j < contador; j++) {
            //lineas
            for (int j2 = espacio; j2 > 1; j2--) {
                System.out.print(" ");
            }
            for (int j3 = espacio; j3 <= contador; j3++) {
                System.out.print("*");
            }
            System.out.print("  ");
            for (int j2 = espacio; j2 > 1; j2--) {
                System.out.print("*");
            }
            espacio--;
            System.out.println("");
        }
    }
}
