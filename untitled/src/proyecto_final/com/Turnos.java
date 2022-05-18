package proyecto_final.com;

import EstructurasDeDatos.cola;

import java.util.Scanner;

public class Turnos {
    cola orden =new cola();
    String datos;

    public Turnos(){
        datos=null;
    }

    public void agendarturno(){
        System.out.println("Ingresa tu nombre");
        Scanner fx = new Scanner(System.in);
        datos=fx.nextLine();
        orden.enqueue(datos);
        int x = orden.tamaño();
        if (x==0){
            System.out.println("Eres el siguiente");
        }else{
            System.out.println("Tu numero de fila es : "+x);
        }
    }
    public int Verificarturno(){
        System.out.println("Ingresa tu nombre");
        Scanner fx = new Scanner(System.in);
        datos=fx.nextLine();
        int X =orden.Encontrarindex(datos);
        return X;
    }

    public Object TurnoSiguiente(){
        return orden.dequeue();
    }
}
