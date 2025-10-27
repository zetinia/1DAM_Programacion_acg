// el main pregunta dos numeros, y se los pasa a 4 metodos 
//Uno lo suma 
//otro lo resta 
// otro lo multiplica 
//otro lo divide

public class Ejercicio1 {
    public static void main(String[] args) {
        
       

        int numero1 = Integer.parseInt(System.console().readLine("Elige un numero"));
        int numero2 = Integer.parseInt( System.console().readLine("Elige otro numero"));

        suma(numero1, numero2);
        resta(numero1, numero2);
        multiplicacion(numero1, numero2);
        division(numero1, numero2);



    }
public static void suma (int n1 , int n2){
    System.out.println(n1 + n2);
}
public static void resta (int n1, int n2){
    System.out.println(n1 - n2);
}
public static void multiplicacion (int n1, int n2){
    System.out.println(n1*n2);
}
public static void    division (int n1, int n2){
    System.out.println(n1/n2);
}
}
