//Crea un programa que genere un numero aleatorio entre 1 y 100 y pida al usuario que lo adivine. El programa debe seguir preguntando
//una y otra vez hasta que el usuario realmente lo acierte ( sin numero maximo de intentos ). Tras cada pregunta, ira diciendo si el numero buscado es mayor o menor que el introducido para dar pistas al usuario.


public class Ejercicio31 {
    public static void main(String[] args) {
        

        int numAleatorio = (int) Math.random()*100 + 1;
        int numUsuario = Integer.parseInt(System.console().readLine("Elige un numero"));

        while (numAleatorio != numUsuario) {
            numUsuario = Integer.parseInt(System.console().readLine("Elige un numero"));



            
        }
        if (numAleatorio) {
            
        }


    }
}
