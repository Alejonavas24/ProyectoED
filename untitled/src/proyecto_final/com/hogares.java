package proyecto_final.com;
import EstructurasDeDatos.Stack;
import java.util.Scanner;
public class hogares {
    Stack lugares = new Stack();
    String datos;
   public hogares(){
    datos =null;
    lugares.push("calle 13 sur 24d-86, manuel");
   }
   public void postulatuhogar(){
       System.out.println("Ingresa Tu Direccion y nombre");
       Scanner fx = new Scanner(System.in);
          datos=fx.nextLine();
          lugares.push(datos);
          System.out.println("Gracias por tu postulacion");

   }
   public void encuentraunhogar(){
       if(!lugares.empty()) {
           System.out.println("La direccion y Nombre del hogar de paso es:");
           System.out.println(lugares.pop());
       }else{
           System.out.println("No hay lugares disponibles en este momento");
       }

   }
}
