

/*Desarrolla un programa que poda im numero al usuario e imprima 
 * 
 * 
 */


public class Ejercicio2 {
    
public static void main(String[] args) {
    int numero = Integer.parseInt(System.console().readLine("Num:"));

    repetir(numero);
}

    public static void repetir(int n){
        for(int i = 0; i<n;i++){
            System.out.println("Hola");
        }
    }


}
