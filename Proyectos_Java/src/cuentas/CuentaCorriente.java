package cuentas;


public class CuentaCorriente {
    
//atributos
private String titular;
private double numero;
private int saldo;


// constructores

    public CuentaCorriente(String titular, double numero) {
        this.titular = titular;
        //si la cantidad es menor o igual a 0 se pone en 0
        if (numero < 0){
            this.numero=0;
        
        } else{
            this.numero=numero;
       
    }
    }
    //metodos

    CuentaCorriente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    CuentaCorriente(String paty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
public void abonar(double numero){
    if (numero >0){
        this.numero+=numero;
    }
}
    public void cargar(double numero){
      if(this.numero - numero <0){
          this.numero=0;
      }else{
          this.numero -=numero;
          
      }   
    }

    @Override
    public String toString() {
        return "CuentaCorriente " + "titular= " + " tiene " + numero +" pesos en la cuenta";
    }


}