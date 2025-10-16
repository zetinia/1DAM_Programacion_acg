//Haz un programa que pregunte la edad y si es mayor de edad da las siguientes opciones para jugar a la ruleta:
//1. Color aleatorio (rojo, negro o verde).
//2. Números aleatorios (de 0 a 36 incluidos).
//3. Secciones aleatorias (1, 2 o 3).
//4. Par o impar.
//En función de la opción seleccionada deberá mostrar aleatoriamente una de las opciones
//posibles.
//Si el usuario es menor de edad, el programa indicará que no puede acceder a la ruleta y
//finalizará

public class Ejercicio18 {
    public static void main(String[] args) {
        String edad = System.console().readLine("¿Eres mayor de edad?:");

        switch (edad) {
            case "si":
                System.out.println("Pa lante mi loco, elije uno de los siguientes juegos:");
                System.out.println("1) Color aleatorio: Rojo, Verde, Negro");
                System.out.println("2)Número aleatorio (0 a 36)");
                System.out.println("3)Seccion aleatoria : 1, 2 o 3");
                System.out.println("4)Selecciona par o impar");
                int juego = Integer.parseInt(System.console().readLine("¿Cual eliges?:"));

                switch (juego) {
                    case 1:
                    String elecionColor = System.console().readLine("Elige un color:");
                        double color = (int) Math.random() * 3;
                        if (color == 0) {
                            System.out.println("Rojo");
                        } else if (color == 1) {
                            System.out.println("Verde");

                        }

                        else if (color == 2) {
                            System.out.println("Negro");
                        }
                        break;
                    case 2:
                    int eleccion2 = Integer.parseInt(System.console().readLine("¿Cual eliges?:"));
                        double numero = (int) Math.random() * 37;

                        System.out.println(" Ha salido el Numero " + numero);

                        break;

                    case 3:
                        int seccion = (int) (Math.random() * 3 + 1);

                        System.out.println("Seccion " + seccion);

                        break;

                    case 4:

                        double parImpar = (int) Math.random() * 2;
                        if (parImpar == 0) {
                            System.out.println("A salido par");
                        }

                        else if (parImpar == 1) {
                            System.out.println("A salido impar");

                        }
                        break;
                }
                break;

            case "no":
                System.out.println("Pa casita bro uwu");
                break;
        }
    }
}
