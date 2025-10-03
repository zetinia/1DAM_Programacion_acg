//Realiza un programa que pida una hora por teclado y que muestre "buenos dias ", "buenas tardes "o "buenas noches " segun la hora. Se utilizaran los tramos

//DE 6 a 12 bono dia
// de 13 a 20 bona tarde
// de 21 a 5 bona nota 
// "y" para poner varias condiciones es &

import java.util.concurrent.locks.Condition;

public class Tarea2 {
    public static void main(String[] args) {
        int hora = Integer.parseInt(System.console().readLine("Indique la hora que es:"));


        if (hora >= 6 && hora <= 12  ){
            System.out.println("Buenos dias");
        } else if (hora <= 13 && hora <= 20){
            System.out.println("Bona tarde");

        }else if (hora >= 21 && hora <= 5){
            System.out.println("bona nota");
        }
    }
}
