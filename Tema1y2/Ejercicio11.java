//Programa que pregunta cuantos trozos tiene una tarta, cuantas personas van a comer, y muestra cuantos trozos tocan por personas y cuantos sobran 



public class Ejercicio11 {
    public static void main(String[] args) {

        //Primero realizamos las preguntas 
        
        int trozos = Integer.parseInt(System.console().readLine("Cuantas trozos tiene la tarta?"));
        int personas = Integer.parseInt(System.console().readLine("Cuantas personas van a comer?"));

        //Ahora realizamos los resultados 

        System.out.println("A cada persona le toca " + (trozos/personas));
        System.out.println("Sobran " +  trozos%personas + " trozos ");



    }
}