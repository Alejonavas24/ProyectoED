package proyecto_final.com;

import java.io.BufferedReader;
import java.io.FileReader;
public class leertxt {

    public String  leerarchivo(String direccion){
        String texto="";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfread;
            while((bfread = bf.readLine()) !=null ){ // hacer ciclos hasta que se acabe el txt
                temp=temp+bfread;//guardar texto archivo
            }
            texto=temp;
            String ola [] = texto.split(",");
        } catch (Exception e) {System.err.println("no se pudo abrir el archivo");
        }
        return texto;
    }
}

