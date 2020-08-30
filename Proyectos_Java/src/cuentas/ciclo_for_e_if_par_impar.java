/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

import java.util.Scanner;

/**
 *
 * @author david.cruz
 */
public class ciclo_for_e_if_par_impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int temp;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        int num = scan.nextInt();
        for(int i=2;i<=num/2;i++){
            temp=num%1;
            if(temp==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " Es un numero primo ");
        else
            System.out.println(num +" No es un numero primo ");
    }
    
}
