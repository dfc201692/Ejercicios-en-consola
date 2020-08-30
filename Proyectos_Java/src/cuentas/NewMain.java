package cuentas;

public class NewMain {

    public static void main(String[] args) {
    /*    for (int i = 5; i <= 100; i += 5) {
            System.out.println(i);
        }
    }*/
    int contador = 0; //Iniciamos el contador en cero

    for(int i = 1;i <= 100; i++)
{//Notemos que escribir i++ es similar a escribir i = i + 1
    if (i % 2 == 0) //Preguntamos si el residuo es 0 (es múltiplo de 20)
        {
            contador++; //Si es múltiplo aumentamos el contador en 1
        }
        //Si no es múltiplo no hacemos nada
    }

//Mostramos el valor del contador
    System.out.println (contador);
    }}
