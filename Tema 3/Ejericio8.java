public class Ejericio8 {
    public static void main(String[] args) {
        float ancho= Float.parseFloat(System.console().readLine(""));
        float alto = Float.parseFloat(System.console().readLine(""));



        float precio = (ancho*alto)*0.02f;

        String escudo = (System.console().readLine(""));




        if (escudo.equals("si")) {
         precio = precio + 2.5f;
        } else if (escudo.equals("no")){

        }
    }
}
