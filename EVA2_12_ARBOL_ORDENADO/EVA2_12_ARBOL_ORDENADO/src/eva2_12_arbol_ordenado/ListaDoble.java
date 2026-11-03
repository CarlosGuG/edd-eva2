/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_ordenado;

/**
 *
 * @author Usuario
 */
public class ListaDoble {
   private NODO inicio;
   private NODO fin;
   private int tama;
   
   public ListaDoble(){
        inicio = null;// al crear la lista, se crea vacia
        fin = null;
    }
   // O(N)
    public void imprimir(){
       NODO temp = inicio;
       while(temp != null){
           System.out.println("[" + temp.getValor() + "]");
           temp = temp.getIzquierda();
       }
    }
    public void ImprimirInverso(){
       for (int i = longitud() - 1; i >= 0; i--) { 
        NODO temp = inicio;
        for (int j = 0; j < i; j++) {
            temp = temp.getIzquierda();
        }
        System.out.print("[" + temp.getValor() + "] ");
    }
    System.out.println();
    }
    // O(N)
    public int longitud(){
       return tama;
    }
    //O(1)
    public boolean listaVacia(){
      if(inicio == null){ // lista vacia verdadero
            return true;
        } else { // Lista con nodos
          return false;
      } 
    }
    //O(1)
    public void vaciarLista(){
        inicio = null;
        fin = null;
        tama = 0;
    }
    // Siempre se agregan al final de la lista
    //  Version: 1 O(N) ---> Se agrega al final se recorren todos
    //  Version Mejorada: 0(1) ---> Con nodo fin, ya no se recorren todos
    public void agregar(int valor){
        NODO nuevo = new NODO(valor); // creo el nodo para el valor a insertar
        if(inicio == null){ // lista vacia verdadero
            inicio = nuevo;
            fin = nuevo;// nuevo es el primer nodo de la lista
        } else { // Lista con nodos
            fin.setDerecha(nuevo);
            // Conectar previo
            nuevo.setIzquierda(fin);
            fin = nuevo;
        }
        this.tama++;
    }
    public void insertarEn(int valor, int posicion) {
    if (posicion < 0 || posicion > longitud()) {
        throw new IndexOutOfBoundsException("Posicion no valida");
    }
    
    NODO nuevo = new NODO(valor);
    
    if (posicion == 0) {
        // Insertar al inicio
        if (inicio == null) { // Lista vacía
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setIzquierda(inicio);
            inicio.setIzquierda(nuevo);
            inicio = nuevo;
        }
    } else if (posicion == longitud()) {
        // Insertar al final
        nuevo.setIzquierda(fin);
        fin.setIzquierda(nuevo);
        fin = nuevo;
    } else {
        // Insertar en medio
        NODO temp = inicio;
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getIzquierda();
        }
        NODO siguienteNodo = temp.getIzquierda();
        
        nuevo.setIzquierda(siguienteNodo);
        nuevo.setIzquierda(temp);
        
        temp.setIzquierda(nuevo);
        if (siguienteNodo != null) {
            siguienteNodo.setIzquierda(nuevo);
        }
    }
    this.tama++;
}
     public void borrarEn(int posicion) {
    if (posicion < 0 || posicion >= longitud()) {
        throw new RuntimeException("La posicion " + posicion + " no es valida para borrar");
    }
    
    if (posicion == 0) {
        // Borrar el primero
        inicio = inicio.getIzquierda();
        if (inicio != null) {
            inicio.setIzquierda(null);
        } else {
            fin = null; // La lista se quedó vacía
        }
    } else if (posicion == longitud() - 1) {
        // Borrar el último
        fin = fin.getIzquierda();
        if (fin != null) {
            fin.setIzquierda(null);
        } else {
            inicio = null;
        }
    } else {
        // Borrar en medio
        NODO temp = inicio;
        for (int i = 0; i < posicion; i++) {
            temp = temp.getIzquierda();
        }
        
        NODO previo = temp.getIzquierda();
        NODO siguiente = temp.getIzquierda();
        
        if (previo != null) {
            previo.setIzquierda(siguiente);
        }
        if (siguiente != null) {
            siguiente.setIzquierda(previo);
        }
    }
    this.tama--;
   }
     
}
