//Programa que calcula la media de todas de una asignatura para calcular la media. De primeras no se sabe cuantas notas se van a introducir asi que se le va preguntando notas de forma indefinida. Cuando el usuario introduzca un número negativo finaliza el bucle mostrando entonces el resultado 
public class Ejercicio34 {
    public static void main(String[] args) {
        
        float notas;
        float media;
        do {
             notas = Float.parseFloat(System.console().readLine("¿Introduce una nota"));

             notas += notas;
             
             media = notas;

        } while ( notas >= 0);

        System.out.println("La media es de " + media);


    }
}
