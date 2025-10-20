//un bucle pretende imprimir todos los numeros de 0 a 100, pero se interrumpe en el numero que le diga previamente el usuario










public class Ejercicio28 {
    public static void main(String[] args) {
        

        
      int  numeroUsu = Integer.parseInt(System.console().readLine("Indica el número:"));

        for (int i = 0; i < 101; i++) {
            System.out.println(i);
         if (numeroUsu == i){
            break;
         }
            
        }

    }
}
