//Crea un programa que pregunte al isiario si quiere apagar el sistema cin la pregunta "¿Seguro qie quieres apagar eñ sistema (s/n)"Usa un blucle while para seguir pidiendo al usuario la respuesta hasta que introduzca una respuesta valida s para si n para no
//
//



public class Ejercicio30 {
    public static void main(String[] args) {
        

    String opcion = System.console().readLine("Seguro que quieres apagar el sistema (s/n)?");


    while (!opcion.equals("si")) {
        opcion = System.console().readLine("Seguro que quieres apagar el sistema (s/n)?");
     
    }
System.out.println("Se apago el sistema");

    }
}
