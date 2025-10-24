public class EjercicioExamen {
    public static void main(String[] args) {
        

        String diaSemana = "";
        int precioTicket = 0;
        int presupuesto = 0;
       int canttickets = 0;

         

            
             

            diaSemana = System.console().readLine("Introduzca el dia que quiere ir al cine:");
            
            if (diaSemana .equals("lunes")||diaSemana.equals("martes")||diaSemana.equals("jueves")){
                precioTicket = 7;
                System.out.println("El precio del ticket ese dia es de 7 euros");
            }
            
             
            else if (diaSemana.equals("miercoles")){
                precioTicket = 5;
                System.out.println("El precio del ticket ese dia es de 5 euros");
            }
           
            
            else if (diaSemana.equals("viernes")||diaSemana.equals("sabado")){
                precioTicket = 9;
                System.out.println("El precio del ticket ese dia es de 9 euros");
            }


            else if (diaSemana.equals("domingo ")){
                System.out.println("Pruebe otra vez");
            }
            


            presupuesto = Integer.parseInt(System.console().readLine("Introduzca cantidad de su presupuesto:"));

            canttickets = presupuesto/precioTicket;

            System.out.println(canttickets + "tickets puedes comprar");


            System.out.println("Dia al que va a venir  : "  + diaSemana);
            System.out.println("Presupuesto :"+ presupuesto);
            System.out.println("El precio del ticket del dia " + diaSemana + "es de 7");


            int devuelto = presupuesto%precioTicket;

            System.out.println("Se devuelven " + devuelto + "euros");
           
        

    }
}
