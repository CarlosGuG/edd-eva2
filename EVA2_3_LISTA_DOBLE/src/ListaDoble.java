public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int tama;
    
    public ListaDoble() {
        this.inicio = null; //AL CREAR LA LISTA SE CREA VACIA
        this.fin = null;
        this.tama = 0;
    }
    public void imprimir(){
        Nodo  temp = inicio;
        while (temp != null) {
            System.out.print("["+ temp.getValor() + " ] ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    //O(N)
    public void imprimirInverso(){
        Nodo  temp = fin;
        while (temp != null) {
            System.out.print("["+ temp.getValor() + " ] ");
            temp = temp.getPrevio();
        }
        System.out.println("");
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

    public void agregar(int valor){
        Nodo nuevo = new Nodo(valor);//creamos nodo para el valor a insertar
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

    
    public void insertarEn(int posicion, int valor) {
        if (posicion < 0 || posicion > longitud()) {
        throw new IndexOutOfBoundsException("Posicion no valida");
        } else {
            Nodo nuevo = new Nodo(valor);

            if (posicion == 0) {
            nuevo.setSiguiente(inicio);

            if (inicio != null) {
                inicio.setPrevio(nuevo);
            }
            inicio = nuevo;
            if (fin == null) {
                fin = nuevo;
            }
            } else {
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            if (temp == null) {
                nuevo.setPrevio(fin);
                fin.setSiguiente(nuevo);
                fin = nuevo;
            } else {
                nuevo.setSiguiente(temp);
                nuevo.setPrevio(temp.getPrevio());
                nuevo.getPrevio().setSiguiente(nuevo);
                temp.setPrevio(nuevo);
             }
         }

         this.tama++;
        }
    }

    public void eliminarEn( int posicion, boolean eliminarUltimo) {
        if (posicion < 0 || posicion >= longitud()) { // SE VALIDA LA POSICIÓN
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else {
            if (posicion == 0) {
                inicio = inicio.getSiguiente();
                if (inicio == null) { // SI LA LISTA QUEDA VACIA
                    inicio.setPrevio(null);
                } else {
                    fin = null; // SI ELIMINAMOS EL UNICO NODO
                }
                Nodo temp = inicio;
                for (int i = 0; i < posicion; i++) {
                    temp = temp.getSiguiente();
                }
            temp.getPrevio().setSiguiente(temp.getSiguiente());
            if(temp.getSiguiente() != null) {
                temp.getSiguiente().setPrevio(temp.getPrevio());
            } else {
                fin = temp.getPrevio(); // SI ELIMINAMOS EL ULTIMO NODO
            }
            this.tama--; // Restamos el tamaño de la lista
            }
        }
    
    }
}

