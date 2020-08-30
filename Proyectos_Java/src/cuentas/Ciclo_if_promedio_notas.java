package cuentas;

import java.util.Scanner;

/**
 *
 * @author david.cruz
 */
public class Ciclo_if_promedio_notas {

 
    public static void main(String[] args) {
       
       int num1, num2, num3;
       Scanner comienzo = new Scanner(System.in);
        System.out.print("Digite primer numero: ");
        num1 = comienzo.nextInt();
        System.out.print("Digite segundo numero: ");
        num2 = comienzo.nextInt();
        System.out.print("Digite tercer numero: ");
        num3 = comienzo.nextInt();
        
        int promedio = (num1 + num2 + num3)/3;
        
        if(promedio >=5){
            System.out.println("El promedio es: "+promedio);
            System.out.println("El alumno aprobo");
        }
        if(promedio <5){
            System.out.println("El promedio es: "+promedio);
            System.out.println("El alumno reprobo");
        }
                
    }
    
}
