public class Nodo <T> {
    //DOS ATRIBUTOS
    private T valor;
    private Nodo siguiente;
     private Nodo previo;
    //COSNTRUCTORES
    
    public Nodo() {
    this.siguiente = null;
    this.previo = null; // ESTO ES MUY IMPORTANTE, MARCA EL FIN DE LA LISTA
}
    public Nodo(T dato) { // PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NODO
        this.valor = dato;
        this.siguiente = null;
        this.previo = null;
    }
    //GET Y SET

    public T getValor() {
        return valor;
    }

    public void setValor(T dato) {
        this.valor = dato;
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

