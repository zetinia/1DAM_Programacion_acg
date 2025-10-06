//El programa tiene que calcular la nomina  de construccion 
//El programa te pregunta si eres albañil, personal de adminstración, comercial o arquitecto. Despues te pide cuantas horas has trabajado esta semana y calcula tu nomina teniendo en cuenta la siguiente tabla semanal:

public class Ejercicio13 {
    public static void main(String[] args) {

        String profesion = System.console().readLine("¿Cual es tu cargo?:");
        int horasTrabajadas = Integer.parseInt(System.console().readLine("¿Cuantas horas has trabajado?"));

        switch (profesion) {
            case "albañil":
                if (horasTrabajadas <= 40) {
                    System.out.println("Ganas " + horasTrabajadas * 15);
                } else if (horasTrabajadas > 40) {
                    System.out.println("Has ganado " + horasTrabajadas * 20);
                }

                break;

            case "administrador":
                if (horasTrabajadas <= 40) {
                         System.out.println("Ganas " + horasTrabajadas * 15);
                } else if (horasTrabajadas > 40) {
                    System.out.println("Has ganado " + horasTrabajadas * 20);
                }

                break;
                
           case "comercial":
                if (horasTrabajadas <= 40) {
                         System.out.println("Ganas " + horasTrabajadas * 15);
                } else if (horasTrabajadas > 40) {
                    System.out.println("Has ganado " + horasTrabajadas * 20);
                }

                break;
            case "Arquitecto":
                if (horasTrabajadas <= 40) {
                         System.out.println("Ganas " + horasTrabajadas * 15);
                } else if (horasTrabajadas > 40) {
                    System.out.println("Has ganado " + horasTrabajadas * 20);
                }

                break;
                

        }

     }
 }    


