// Crea un menu qie te de a elegir entre si quieres que te felciite tu santo, por tu cumple o por tu aniversario.
//Si eliges tu santo te preguntara tu nombre y te dira 'feliz San + nombre 
//Si eliges cumple te pregutnara cauntos años cumples y entonces te felicitara incluyendo tu edad 





public class Ejercicio14 {
    public static void main(String[] args) {
        
System.out.println("Elije una de las siguientes opciones:");


String opciones = System.console().readLine("a) b) c) d):");


switch (opciones) {
    case "a":
    String nombre = System.console().readLine("Cual es tu nombre?");
    System.out.println("Feliz San " + nombre);
        
        break;

    case "b":
    int edad = Integer.parseInt(System.console().readLine());
    System.out.println("Feliz " + edad + " cumpleaños ");

    
        break;


    case "c":


    



}

    }
}
