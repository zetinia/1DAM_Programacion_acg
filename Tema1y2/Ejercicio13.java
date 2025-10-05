//Desarrolla un conversor de bits a Bytes (pide bits, devuelve bytes).
//


public class Ejercicio13 {
    public static void main(String[] args) {
        

// Primero creamos la variable que nos permita preguntar cuantos bits queremos pasar a bytes

        int conversor = Integer.parseInt(System.console().readLine("¿Cuantos bits quieres convertir?:"));

//Ahora creamos otra variable donde hacemos la operacion

        float bytes = conversor * 8f;

// Por ultimo realizamos el readline para mostrar el cambio

        System.out.println(conversor + " bits  son " +  bytes + " bytes");
    }

}
