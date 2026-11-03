/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_ordenado;

/**
 *
 * @author nayar
 */
public class NODO {
    //DOS ATRIBUTOS
    private int valor;
    private NODO Derecha;
    private NODO izquierda;
    // CONSTRUCTORES
    public NODO(){
        this.Derecha = null;
        this.izquierda = null;// ESTO ES MUY IMPORTANTE
    }
    public NODO(int dato){ // PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NODO
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

    public NODO getDerecha() {
        return Derecha;
    }

    public void setDerecha(NODO Derecha) {
        this.Derecha = Derecha;
    }

   public NODO getIzquierda() {
      return izquierda;
   }

   public void setIzquierda(NODO izquierda) {
      this.izquierda = izquierda;
   }
    
}
