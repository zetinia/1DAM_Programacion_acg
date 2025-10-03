//Escribe un progrma que pida al usuario un numero del 1 al 7 y muestre a que día de la semana corresponde



public class Tarea4 {
    public static void main(String[] args) {
        

        int diaSemana = Integer.parseInt(System.console().readLine("Elije un numero del 1 al 7"));

        if (diaSemana == 1){
            System.out.println("Lunes");
        }
        if (diaSemana == 2){
            System.out.println("Martes");
        }
        if (diaSemana == 3){
            System.out.println("Miercoles");
        }
        if (diaSemana == 4){
            System.out.println("Jueves");
        }
        if (diaSemana == 5){
            System.out.println("Viernes");
        }
        if (diaSemana == 6){
            System.out.println("Sabado");
        }
        if (diaSemana == 7){
            System.out.println("Domingo");
        }


    }
}


