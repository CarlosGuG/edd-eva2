public class Nodo {
    //DOS ATRIBUTOS
    private int valor;
    private Nodo Derecha;
    private Nodo izquierda;
    // CONSTRUCTORES
    public Nodo(){
        this.Derecha = null;
        this.izquierda = null;// ESTO ES MUY IMPORTANTE
    }
    public Nodo(int dato){ // PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NODO
        this.valor = dato;
        this.Derecha = null;
        this.izquierda = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo Derecha) {
        this.Derecha = Derecha;
    }

   public Nodo getIzquierda() {
      return izquierda;
   }

   public void setIzquierda(Nodo izquierda) {
      this.izquierda = izquierda;
   }
    
}


