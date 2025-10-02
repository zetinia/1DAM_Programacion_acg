//Programa que te pide el precio de un producto y le añade el IVA (lo multiplica por 1,21). Ojo el IVA siempre es 1,21 y no debe modificarse 


public class Ejercicio12 {
    public static void main(String[] args) {
        
        //Primero realizamos la pregunta para saber cuanto cuesta el producto

        int precioProducto = Integer.parseInt(System.console().readLine("Cuanto cuesta el producto :"));


        //Ahora creamos una variable que sera el IVA 1,21 y le añadimos primero el final ya que es un dato que no se modificara nunca

       final float IVA = 1.21f;

       float productoFinal = precioProducto * 1.21f;

       //Ahora imprimimos la respuestas, el precio del producto más IVA


       System.out.println("El producto cuesta " + productoFinal + " euros ");




    }
}
