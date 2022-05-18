package proyecto_final.com;

public class Sistema {

    String ola;

    public Sistema(){
        ola=null;
    }
    public void opcionesfinales(){
        System.out.println("1. Continuar");
        System.out.println("2. salir");
    }
    public void inicio(){
        System.out.println("Bienvenidos a PetHouse!");
        System.out.println("selecciones una opcion para empezar:");
        System.out.println("1. Casas de amor.");
        System.out.println("2. Agendar turno.");
        System.out.println("3. No se 2");
        System.out.println("4. salir");
    }
    public void hogares(){
        System.out.println("Selecciona una opcion");
        System.out.println("1.Postula tu hogar");
        System.out.println("2.Encuentra su hogar");
        System.out.println("3.salir");
    }
    public void turnos(){
        System.out.println("Selecciona una opcion");
        System.out.println("1.Crea un turno");
        System.out.println("2.Siguiente turno");
        System.out.println("3.salir");
    }

}
