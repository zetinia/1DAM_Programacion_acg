//Haz un programa que pregunte al usuario cuánto dinero tiene en el banco.
//Después, el programa debe preguntar cuánto quiere gastarse hoy y guardarlo. Después, el programa debe preguntar cuánto desea ingresar hoy y guardarlo. Por último, muestra el dinero final en la cuenta (tras el gasto y el ingreso)



public class Ejercicio14 {
    public static void main(String[] args) {
        
        //Primero creamos las variables de conversión para preguntar cuanto dinero tiene el usuario en el banco y demas.


        float cantidad = Float.parseFloat(System.console().readLine("¿Cuanto dinero tienes metido?:"));

        float sacar = Float.parseFloat(System.console().readLine("¿Cuanto desea extraer hoy?:"));

        float ingresar = Float.parseFloat(System.console().readLine("¿Cuanto desea ingresar hoy "));


        //Ahora creamos la variable de la cantidad final tras el gasto y el ingreso

        float total = cantidad - sacar + ingresar;


        //Por ultimo mostramos cuanto ha quedado en total en la cuenta
        
        System.out.println("Tienes en total " + total + "€");





    }
}
