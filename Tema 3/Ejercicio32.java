//Pide al usuario que introduzca caracteres uno por uno y cuenta vocales ha introducdico.El bucle termina cuando el usuario introduce un 0
//



public class Ejercicio32 {
    public static void main(String[] args) {
        

      String carac = "";
      int numVoc = 0;

        do {
            carac = System.console().readLine("Introduce un caracterer");
        } while (carac.equals("a"))||(carac.equals("e"))||(carac.equals("i"))||(carac.equals("o"))||(carac.equals("u")){

        }

    }
}
