public class EVA2_12_ARBOL_ORDENADO {
    public static void main(String[] args) throws Exception {
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
