
public class ListaSimple {
     private Nodo inicio;
     private Nodo fin;

    public ListaSimple(){
        inicio = null; //al crear la lista se crea vacia
        fin = null; // el fin sera vacio
    }
    // Siempre se agregan al final de la lista 
    // Version 1: O(n) ----> Se agregan se recorren todos
    //Version mejorada: O(1) 
    public void agregar(int valor){
        Nodo nuevo = new Nodo(valor);//creamos nodo para el valor a insertar
        //y luego ??
        if (inicio == null){ //lista vacia? verdadero
            inicio = nuevo;
            fin = nuevo;

        } else{/*
            Nodo   temp = inicio;
            while (temp.getSiguiente() != null) { 
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);// concto de nuevo al final de la lista*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
            
        }
    }
    public void imprimir(){
        Nodo  temp = inicio;
        while (temp != null) {
            System.out.print("["+ temp.getValor() + " ] ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    //IMPRIMAN EN ORDEN INVERSO
    //O(N2)
    public void imprimirInverso() {
        for (int i = longitud() - 1; i >= 0; i--) { //RECORRER LA LISTA DE ATRAS HACIA ADELANTE
          Nodo temp = inicio;
          for (int j = 0; j < i; j++) { //IMPRIMIR EL VALOR EN LA POSICION i
            temp = temp.getSiguiente();
          }
          System.out.print("[" + temp.getValor() + "] ");
        }
        System.out.println("");
    }
    
    public int longitud(){
        int cont = 0;
        Nodo temp = inicio; 
        while (temp != null){
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
    //LONGITUD 0(1)
    public int longitudUno(){
       return this.longitud();
    }
    //0(1)
    public boolean listaVacia(){
        if(inicio == null){//LISTA VACIA? VERDADERO
            return true;
        }else{ //LISTA CON NODOS
            return false;
        }
    }
    //0(1)
    public void vaciarLista(){
        inicio = null;
        fin = null;
    }
    //VALIDAR: posición tenga un valor válido
                                      //throws
    public int valorEn(int posicion) throws RuntimeException {
        //excepción
        //VALIDAR posición
        //1 que posiciones son validas? De 0 (cero) a N - 1 (N es la cantidad de nodos)
       int tama = longitud();
        if(posicion > 0 && posicion < tama){
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++){
            temp = temp.getSiguiente();
            }
            return temp.getValor();
       }else{ // POSICION NO VALIDA
            throw new RuntimeException("La Posicion " + posicion + " no es valida");
        }
     }
    //REGRESA LA PRIMERA APARICION DEL VALOR EN LA LISTA
    //REGRESA LA POSICION
    //O(??))
    public int encontrar(int valor){
        boolean bande = false;
        int posi = 0;
        Nodo temp = inicio;
        while(temp != null){
            if(valor == temp.getValor()){
                bande = true;
                break;
            }
            temp = temp.getSiguiente();
            posi++;
        }
        if(bande)
            return posi;
        else
            return -1;
    }
     
    public void insertarEn (int valor, int posicion){
        if(posicion < 0 || posicion > longitud()){ //SE VALIDA LA POSICIÓN
            throw new IndexOutOfBoundsException("Posicion no valida");
        }else{
            Nodo nuevo = new Nodo(valor);
            if(posicion ==0){ //SI SE QUIERE INSERTAR AL INICIO
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                if(fin == null){ //SI LA LISTA ESTABA VACIA
                    fin = nuevo;
                }
            }else if (posicion == longitud()){
                fin.setSiguiente(nuevo);
                fin = nuevo;
            }else{ //SI SE QUIERE INSERTAR EN EL MEDIO DE LA LISTA
                Nodo temp = inicio;
                for (int i= 0; i < posicion -1; i++){
                    temp = temp.getSiguiente();
                }
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }
        }
    }
    //O(N)
    public void eliminarEn (int posicion){
        if(posicion < 0 || posicion >= longitud()){ //SE VALIDA LA POSICIÓN
            throw new IndexOutOfBoundsException("Posicion no valida");
        }else{
            if(posicion == 0){
                inicio = inicio.getSiguiente();
                if(inicio == null){ //SI LA LISTA QUEDA VACIA
                    fin = null;
                }
            }else{
                Nodo temp = inicio;
                for (int i= 0; i < posicion -1; i++){
                    temp = temp.getSiguiente();
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if(temp.getSiguiente() == null){ //SI ELIMINAMOS EL ULTIMO NODO
                    fin = temp;
                }
            }
        }
    }
}