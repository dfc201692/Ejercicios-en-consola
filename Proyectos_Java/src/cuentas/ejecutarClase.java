
package cuentas;

import javax.swing.JOptionPane;


public class ejecutarClase {

public static void main(String [] args){
    
CuentaCorriente cuenta_1 = new CuentaCorriente ("paty", 200000);
CuentaCorriente cuenta_2 = new CuentaCorriente ("paty2", 100000);


// abonar dinero en las cuentas

cuenta_1.abonar(100000);
cuenta_2.abonar(60000);

// cargar dinero a las cuentas

cuenta_1.cargar(-50000);
cuenta_2.cargar(-25000);

// mostrando informacion de las cuentas

System.out.println(cuenta_1);
   // JOptionPane.showMessageDialog(null, cuenta_1);
System.out.println(cuenta_2);
        }
}
