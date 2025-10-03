//Escribe un progrma que te pregunte la nota que has sacado en una asignatura y te diga si corresponde a un insuficientem,sufi,etc




public class Tarea5 {
    public static void main(String[] args) {
        
        int asignatura = Integer.parseInt(System.console().readLine("Que has sacado en matrs?:"));




        if(asignatura <= 4){
            System.out.println("Has sacado insuficiente");
        }
        else if (asignatura >= 5 && asignatura <=5){
            System.out.println("Has sacado Suficiente");
        }
        else if (asignatura >= 6 && asignatura <=6){
            System.out.println("Has sacado Bien");
        }   
        else if (asignatura >= 7 && asignatura <=7){
            System.out.println("Has sacado Notable");
        }
        else if (asignatura >= 8 && asignatura <=8){
            System.out.println("Has sacado Notable alto");
        }
        else if (asignatura >= 9 && asignatura <=9){
            System.out.println("Has sacado Sobresaliente");
        }
        else if (asignatura == 10 && asignatura <=10){
            System.out.println(" Has sacado Sobresaliente alto");
        }
             
            
            

            }

        }

    

