import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        


       

        // Generar número aleatorio para el valor (1 a 13)
        double valorAleatorio = (int) Math.random () *13 + 1;
        // Generar número aleatorio para el palo (1 a 4)
        double paloAleatorio = (int) Math.random()*4 + 1;

        

        // Asignar el valor según el número aleatorio
        switch (valor) {
            case 1:
                valor = "2";
                break;
            case 2:
                valor = "3";
                break;
            case 3:
                valor = "4";
                break;
            case 4:
                valor = "5";
                break;
            case 5:
                valor = "6";
                break;
            case 6:
                valor = "7";
                break;
            case 7:
                valor = "8";
                break;
            case 8:
                valor = "9";
                break;
            case 9:
                valor = "10";
                break;
            case 10:
                valor = "J";
                break;
            case 11:
                valor = "Q";
                break;
            case 12:
                valor = "K";
                break;
            case 13:
                valor = "A";
                break;
        }

        // Asignar el palo según el número aleatorio
        switch (palo) {
            case 1:
                palo = "picas";
                break;
            case 2:
                palo = "corazones";
                break;
            case 3:
                palo = "diamantes";
                break;
            case 4:
                palo = "tréboles";
                break;
        }

        // Mostrar la carta seleccionada
        System.out.println("Carta aleatoria: " + valor + " de " + palo);
    }
}

    

