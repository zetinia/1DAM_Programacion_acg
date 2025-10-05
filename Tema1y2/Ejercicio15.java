//Desarrolla un conversor de grados celsius a grados kelvin.





public class Ejercicio15 {
    public static void main(String[] args) {
        

        //Primero hacemos que pregunte el programa cuantos celsius serian


        float celsius = Float.parseFloat(System.console().readLine("Introduzca cantidad de grados celsius"));


        //Ahora creamos una variable para la operacion de conversor 

        float kelvin = celsius + 273.15f;

        //Por ultimo mostramos por pantalla el resultado


        System.out.println(celsius + "grados celsius son " + kelvin + " grados kelvin" );

    }
}
