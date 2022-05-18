package proyecto_final.com;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner lector = new Scanner(System.in);
        hogares casas = new hogares();
        Turnos posiciones=new Turnos();
        Sistema prints=new Sistema();
        while (true) {
            prints.inicio();
            int opcion = lector.nextInt();
             if (opcion == 1) {
               prints.hogares();
                  int selecion = lector.nextInt();
                 if (selecion == 1) {
                   casas.postulatuhogar();
                   prints.opcionesfinales();
                   int ultima=lector.nextInt();
                   if(ultima==2){break;}
                }
                else if (selecion == 2) {
                  casas.encuentraunhogar();
                  prints.opcionesfinales();
                  int ultima=lector.nextInt();
                  if(ultima==2){break;}
                }
                else if (selecion==3){
                  break;
                }
            } else if (opcion == 2) {
                prints.turnos();
                 int selecion = lector.nextInt();
                 if(selecion==1){
                     posiciones.agendarturno();
                     prints.opcionesfinales();
                     int ultima=lector.nextInt();
                     if(ultima==2){break;}
                 }
                 else if (selecion==2) {
                    Object ola=posiciones.TurnoSiguiente();
                    System.out.println(ola);
                    prints.opcionesfinales();
                     int ultima=lector.nextInt();
                     if(ultima==2){break;}
                 } else if (selecion==3) {
                     break;
                 }

             } else if (opcion == 3) {
                System.out.println("opcion 3");
            } else if (opcion == 4) {
                break;
            } else {
                System.out.println("seleccione una opcion valida");
            }
        }
    }
}




