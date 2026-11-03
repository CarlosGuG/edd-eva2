/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_ordenado;

/**
 *
 * @author nayar
 */
public class ArbolBinario {
    private NODO root;
    
    public ArbolBinario(){
        root = null;
    }
    
    public void agregar(int valor){
        // ESTA VACIO EL ARBOL
        if(root == null){ // arbol vacio
            root = new NODO(valor); // insertar el valor
        } else {
            agregarRecu(root, valor);
        }
    }
    // METODO RECURSIVO PARA AGREGAR UN NODO
    public void agregarRecu(NODO actual , int valor){
        if(valor > actual.getValor()){ // valor a la derecha
            if(actual.getDerecha() != null){ // Ocupado
                agregarRecu(actual.getDerecha(), valor);
            } else {
              actual.setDerecha(new NODO(valor));
            }  // Disponible 
        }else if(valor < actual.getValor()) { // valor a la izquierda
            if(actual.getIzquierda() != null){ // Ocupado
                agregarRecu(actual.getIzquierda(), valor);
            } else {
              actual.setIzquierda(new NODO(valor));
            }
        } // else ----> el valor esta repetido
    }
    
    public void preOrder(){
       preOrderRecu(root);
    }
    
    public void preOrderRecu(NODO actual){
       if(actual != null){
          System.out.print(actual.getValor() + "-"); // Lee el valor
          preOrderRecu(actual.getIzquierda()); // Lee lado izq
          preOrderRecu(actual.getDerecha());// Lee lado der
       } 
    }
    
    public void inOrder(){
       inOrderRecu(root);  
    }
    
    public void inOrderRecu(NODO actual){
       if(actual != null){
          inOrderRecu(actual.getIzquierda()); // Lee lado izq
          System.out.print(actual.getValor() + "-"); //  Lee el valor 
          inOrderRecu(actual.getDerecha()); // Lee lado der
       }
    }
    
    public void postOrder(){
       postOrderRecu(root);
    }
    
    public void postOrderRecu(NODO actual){
       if(actual != null){
          postOrderRecu(actual.getIzquierda()); // lee lado izq
          postOrderRecu(actual.getDerecha()); // lee lado der
          System.out.print(actual.getValor() + "-"); // lee el valor
       }
    }
    
}
