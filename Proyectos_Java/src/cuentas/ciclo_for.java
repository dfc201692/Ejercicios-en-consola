package cuentas;

/**
 *
 * @author david.cruz
 * Ciclo for en JAVA
 */
public class ciclo_for {

    public static void main(String[] args) {

        System.out.println("Este programa simula la hora en un reloj");

        for (int h = 0; h <=23; h++) { //hora
            for (int m = 0; m <=59; m++) { //minuto 
                for (int s = 0; s <=59; s++) { //segundo
                    System.out.println("" + h + " : " + m + " : " + s);//imprime resultado
                }
            }
        }
    }

}
