public class ListaGrafo<TIPO> {
    private Nodo inicio;
    private TIPO dato;
    private Nodo fin;
    private int tama;
    
    public ListaGrafo() {
        this.inicio = null; //AL CREAR LA LISTA SE CREA VACIA
        this.fin = null;
        this.tama = 0;
    }
    public int longitud(){
        return tama;
    }
    //O(1)
    public boolean listaVacia(){
        if(inicio == null){//LISTA VACIA? VERDADERO
            return true;
        }else{ //LISTA CON NODOS
            return false;
        }
    }
    //O(1)
    public void vaciarLista(){
        inicio = null;
        fin = null;
        tama = 0;
    }
    
    public void agregar(TIPO valor){
        Nodo nuevo = new Nodo<TIPO>(valor);//creamos nodo para el valor a insertar
        //y luego ??
        if (inicio == null){ //lista vacia? verdadero
            inicio = nuevo; //NUEVO ES EL PRIMER NODO DE LA LISTA   
            fin = nuevo;

        } else{
            fin.setSiguiente(nuevo);
            //CONECTAR PREVIO
            nuevo.setPrevio(fin);
            fin = nuevo;
            
        }
        this.tama++; // Incrementamos el tamaño de la lista
    }

}

