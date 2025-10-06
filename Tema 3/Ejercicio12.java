//Pregunta el precio de un producto y si es de primera necsudad o no, calcula su precio con IVA (primera necesidad)

public class Ejercicio12 {
    public static void main(String[] args) {

        int precio = Integer.parseInt(System.console().readLine("¿Cual es el precio del producto?:"));
        String necesidad = System.console().readLine("¿Es de primera necesidad o no?:");

        switch (necesidad) {
            case "si":

                System.out.println("el precio es de " + precio * 1.21 + "ieruos");

                break;
            case "no":
                System.out.println("El precio es de " + precio + "ieuros");
            default:
                break;
        }

    }
}
