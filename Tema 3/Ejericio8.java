public class Ejericio8 {
    public static void main(String[] args) {
        float ancho= Float.parseFloat(System.console().readLine(""));
        float alto = Float.parseFloat(System.console().readLine(""));



        float precio = (ancho*alto)*0.02f;

        String escudo = (System.console().readLine(""));


        //.equals es el igual para letras
        

        if (escudo.equals("si")) {
         precio = precio + 2.5f;
         System.out.println("Ok lo ponemos ");
        } else if (escudo.equals("no")){
            System.out.println("OK, no lo ponemos ");

        }
    }
}
