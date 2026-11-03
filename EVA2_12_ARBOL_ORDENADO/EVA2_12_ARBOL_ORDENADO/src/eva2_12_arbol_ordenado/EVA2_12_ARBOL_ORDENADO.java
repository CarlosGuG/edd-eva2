/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_arbol_ordenado;

/**
 *
 * @author nayar
 */
public class EVA2_12_ARBOL_ORDENADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.agregar(13);
        arbol.agregar(10);
        arbol.agregar(18);
        arbol.agregar(2);
        arbol.agregar(17);
        arbol.agregar(20);
        arbol.agregar(16);
        arbol.agregar(11);
        System.out.println("PreOrder:");
        arbol.preOrder();
        System.out.println("InOrder:");
        arbol.inOrder();
        System.out.println("PostOrder:");
        arbol.postOrder();
    }
    
}
