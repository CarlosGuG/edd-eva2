public class ArbolBinario {
    private Nodo root;
    
    public ArbolBinario(){
        root = null;
    }
    
    public void agregar(int valor){
        // ESTA VACIO EL ARBOL
        if(root == null){ // arbol vacio
            root = new Nodo(valor); // insertar el valor
        } else {
            agregarRecu(root, valor);
        }
    }
    // METODO RECURSIVO PARA AGREGAR UN NODO
    public void agregarRecu(Nodo actual , int valor){
        if(valor > actual.getValor()){ // valor a la derecha
            if(actual.getDerecha() != null){ // Ocupado
                agregarRecu(actual.getDerecha(), valor);
            } else {
              actual.setDerecha(new Nodo(valor));
            }  // Disponible 
        }else if(valor < actual.getValor()) { // valor a la izquierda
            if(actual.getIzquierda() != null){ // Ocupado
                agregarRecu(actual.getIzquierda(), valor);
            } else {
              actual.setIzquierda(new Nodo(valor));
            }
        } // else ----> el valor esta repetido
    }
    
    public void preOrder(){
       preOrderRecu(root);
    }
    
    public void preOrderRecu(Nodo actual){
       if(actual != null){
          System.out.print(actual.getValor() + "-"); // Lee el valor
          preOrderRecu(actual.getIzquierda()); // Lee lado izq
          preOrderRecu(actual.getDerecha());// Lee lado der
       } 
    }
    
    public void inOrder(){
       inOrderRecu(root);  
    }
    
    public void inOrderRecu(Nodo actual){
       if(actual != null){
          inOrderRecu(actual.getIzquierda()); // Lee lado izq
          System.out.print(actual.getValor() + "-"); //  Lee el valor 
          inOrderRecu(actual.getDerecha()); // Lee lado der
       }
    }
    
    public void postOrder(){
       postOrderRecu(root);
    }
    
    public void postOrderRecu(Nodo actual){
       if(actual != null){
          postOrderRecu(actual.getIzquierda()); // lee lado izq
          postOrderRecu(actual.getDerecha()); // lee lado der
          System.out.print(actual.getValor() + "-"); // lee el valor
       }
    }
    
}
