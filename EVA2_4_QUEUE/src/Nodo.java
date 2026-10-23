

public class Nodo {
    //DOS ATRIBUTOS
    private int valor;
    private Nodo siguiente;
    private Nodo previo;
    //CONSTRUCTOR
    public Nodo(){
        siguiente = null;
        previo = null; //ESTO ES MUY IMPORTANTE
    }
    public Nodo (int dato){ //PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NODO
        this.valor = dato;
        siguiente = null;
        previo = null; 
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo getPrevio() {
        return previo;
    }
    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
}
