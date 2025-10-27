

public class Ejemplo1 {
    public static void main(String[] args) {
        


        //Programacion modular -->Crear metodos 
        String nombre = System.console().readLine("Como te llamas:");
        String apellido = System.console().readLine("Como te apellidas?");
        saludar (nombre, apellido);//Lanzar el metodo
        despedirse(nombre);

        


    }//Crear un metodo (trocito de codigo)
    public static void saludar( String n,String a){
        System.out.println("hola" + n);

        

    }

    public static void despedirse(String u){
        System.out.println("Aio + " + u);
    }
}
