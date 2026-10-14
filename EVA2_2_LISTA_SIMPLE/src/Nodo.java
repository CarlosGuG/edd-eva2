public class Nodo {
    //DOS ATRIBUTOS
    private int valor;
    private Nodo siguiente;
    //COSNTRUCTORES
    
    public Nodo() {
    siguiente = null; // ESTO ES MUY IMPORTANTE, MARCA EL FIN DE LA LISTA
}
    public Nodo(int dato) { // PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NODO
        this.valor = dato;
        siguiente = null;
    }
    //GET Y SET

    public int getValor() {
        return valor;
    }

    public void setValor(int dato) {
        this.valor = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
