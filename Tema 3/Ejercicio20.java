//Desarrolla un juego por consola en el que pueda jugar a piedra, papel o tijera el usuario
//contra el PC. Primero el usuario introduce su elección, después el programa genera
//aleatoriamente la suya y la muestra, y por último el programa indica quién ha ganado.

//
//
//
//

public class Ejercicio20 {
    public static void main(String[] args) {
        

        String eleccion = System.console().readLine("¿Que eleccion escoges?:");

        double pc = (int) Math.random()*3;

        switch (eleccion) {
            case "piedra":

                if ( pc == 0 ){
                    System.out.println("La pc a sacado piedra, es un empate");
                }
                
                

               else if (pc == 1 ){
                    System.out.println("La pc a sacado papel, gana la pc");
                 }
                
        
           else if (pc == 2){
                System.out.println("La pc saca tijeras, gana el usuario");
            }
                break;
        }
        switch (eleccion) {
            case "papel":
                if ( pc == 0 ){
                    System.out.println("La pc a sacado piedra, gana el usuario");
                }
                
                

               else if (pc == 1 ){
                    System.out.println("La pc a sacado papel, es un empate");
                }
                
        
          else  if (pc == 2){
                System.out.println("La pc saca tijeras, gana la pc");
            }
                break;
                
        
            
        }
        switch (eleccion) {
            case "tijeras":
                if ( pc == 0 ){
                    System.out.println("La pc a sacado piedra, gana la pc");
                }
                
                

            else    if (pc == 1 ){
                    System.out.println("La pc a sacado papel, gana el usuario");
                }
                
        
           else if (pc == 2){
                System.out.println("La pc saca tijeras,es un empate");
            }
                break;
                
        
            
        }
        



    }
     }

