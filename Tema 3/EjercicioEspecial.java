//Desarrolla un programa que imprima todos los numeros desde el cero hasta el que diga el usuario, excepto:
//Todos los multiplos de 3, en cuyo lugar dira bolly 

//Todos los multiplos de 5 en lugar dira cao y de 3 de 5 imprimira bollycao 



public class EjercicioEspecial {
    public static void main(String[] args) {
        
       
        for (int i = 0; i < 100 + 1; i++) {

            if (i % 3 == 0) {
                System.out.println("bolly");
                
            }
            else if (i % 5 == 0){
                System.out.println("cao");
            }
            else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("bollycao");
            
        }
        System.out.println(i);
    }

    
}
 

 }