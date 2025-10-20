// Programa que te pide una contraseña y te dice si has acertado con 3 intentos 





public class Ejercicio27 {
    public static void main(String[] args) {
        

String constrasenaReal = "aeiou";
String contrasenaUsu = "";
boolean acierto = false;

for(int i = 0; i<3; i++){
    contrasenaUsu = System.console().readLine("Introduce la contraseña:");


    if(contrasenaUsu == constrasenaReal){
        System.out.println("Contraseña correcta");
        acierto = true;
        break;
    }
}

System.out.println("Programa finalizado");

if (acierto==true){
    System.out.println("Programa finalizado correctamente");
    
}else{


    System.out.println("Programa finalizado correctamente");
}


    }
}
