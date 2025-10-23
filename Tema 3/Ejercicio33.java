//Crea un programa que simule un saldo bancario. El usuario puede introducir un importe positivo para ingresar dinero y uno negativo para retirar. El programa sigue ejecutandose sea inferior inferior a cero euros.








public class Ejercicio33 {
    public static void main(String[] args) {
        int cuenta;
        int retirada;
        int ingreso;

       

         cuenta = Integer.parseInt(System.console().readLine("¿Cuanto dinero tienes?"));
         ingreso = Integer.parseInt(System.console().readLine("¿Cuanto quieres ingresar?"));
        retirada = Integer.parseInt(System.console().readLine("Cuanto deseas retirar?"));

        int menosDinero = cuenta - retirada;
        int masDinero = cuenta + ingreso;
        int cuentaTotal = cuenta + masDinero - menosDinero;
        
            
       do {ingreso = Integer.parseInt(System.console().readLine("¿Cuanto quieres ingresar?"));
         retirada = Integer.parseInt(System.console().readLine("Cuanto deseas retirar?"));
            
        
       } while (cuentaTotal >= 0);
            
        System.out.println(cuentaTotal);


    }
  
}
 
