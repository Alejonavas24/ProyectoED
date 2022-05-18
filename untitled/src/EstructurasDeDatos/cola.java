package EstructurasDeDatos;

public class cola {
Nodo head;
Nodo tail;
Nodo finder;
int size;

public cola(){
    head=null;
    tail=null;
    finder=null;
    size=0;
}
public void enqueue(Object obj) {
    size++;
    if (head==null) {
        head=new Nodo(obj);
        tail=head;
    } else {
        Nodo temp=new Nodo(obj);
        tail.next(temp);
        tail=temp;
        System.out.println(tail.ObtenerValor());
    }
}
public boolean vacio(){
    return size == 0;
}
public Object dequeue(){

    if(vacio()){
        size--;
        System.out.println("la cola esta vacia");
        return null;
}else{
        Nodo temp=new Nodo(head.ObtenerSiguiente().ObtenerValor());
        temp.next(head.ObtenerSiguiente().ObtenerSiguiente());
        Nodo temp2=new Nodo(head.ObtenerValor());
        head.next(null);
        head=temp;
        size--;
        return temp2.ObtenerValor();

    }
}
public int tamaño(){
    return size;
}
public int Encontrarindex(Object obj){
    Nodo comparador=new Nodo(obj);
    int contador=0;
    int i=0;
    while(i<size){
        i++;
        contador++;
        if(i==0 ){
            finder=head;
            if(head.ObtenerValor()==comparador.ObtenerValor()){
               break;
            }
            }else{
            finder=finder.ObtenerSiguiente();
            if(finder.ObtenerValor()==comparador.ObtenerValor()){
                break;
            }
        }
            }
            return contador;
        }

    }


