//Realiza un algoritmo  Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). El programa, al finalizar debe informar de cuántos números introducidos son mayores que 100, cuántos menores que 100 y cuántos iguales a 100


public class Ejercicio36 {
    public static void main(String[] args) {
        
        int numeroVeces;
        int numeros;
       

        numeroVeces = Integer.parseInt(System.console().readLine("Introduzca cantidad de numero que usara:"));
        numeros = Integer.parseInt(System.console().readLine("Introduzca numero"));

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        
        for (int i = 0; i < numeroVeces; i++) {
            
         numeros = Integer.parseInt(System.console().readLine("Introduzca numero"));
            if (numeros < 100) {
                contador1++;
                
            }
            else if (numeros > 100){
                contador2++;
            }
            else if (numeros == 100){
                contador3++;
            }

        
        }
        System.out.println("Numeros mayores que cien : " + contador1);
         System.out.println("Numeros menores que cien : " + contador2);
          System.out.println("Numeros iguales que cien : " + contador3);
        


    }
}
