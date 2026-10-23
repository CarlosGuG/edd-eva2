

public class MyQueue {
    private Nodo inicio;
    private Nodo fin;
    private int tama;

    public MyQueue() {
        inicio = null; // al crear la lista se crea vacia
        fin = null;
    }

    //O(N)
    public void imprimir() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print(temp.getValor() + " ");
            temp = temp.getSiguiente();
        }
    }

    public void imprimirInverso(){
        for (int i = tama - 1; i >= 0; i--) {
            Nodo temp = inicio;
            for (int j = 0; j < i; j++) {
                temp = temp.getSiguiente();
            }
            System.out.print(temp.getValor() + " ");
        }
        System.out.println();
    }

    //O(N)
    public int longitud(){
        return tama;
    }
    //O(1)
    public boolean listaVacia(){
        if (inicio == null) { //lista vacia verdadero
            return true;
        } else { // lista con nodos
            return false;
        }
    }

    //O(1)
    public void vaciarLista(){
        inicio = null;
        fin = null;
        tama = 0;
    }
    //siempre se agregan al final de la lista
    //Version 1: O(N) -----> Se agregan al final se recorren todos
    //Version mejorada: O(1) -----> Con nodo fin, ya no se recorren todos

    public void agregar(int valor){
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) { //lista vacia
            inicio = nuevo;
            fin = nuevo;
        } else { // lista con nodos
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
        this.tama++;
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
       if (listaVacia() || posicion < 0 || posicion >= tama) {
           System.out.println("Posicion no valida");
           return;
            } 
            if (posicion == 0){
                inicio = inicio.getSiguiente();
                if (inicio != null) {
                    inicio.setPrevio(null);
                } else {
                    fin = null;
                }
            } else if (posicion == tama - 1){
                fin = fin.getPrevio();
                if (fin != null) {
                    fin.setSiguiente(null);
                } else {
                    inicio = null;
                }
            }
            else {
                Nodo temp = inicio;
                for (int i = 0; i < posicion; i++) {
                    temp = temp.getSiguiente();
                }
                Nodo previo = temp.getPrevio();
                Nodo siguiente = temp.getSiguiente();

                previo.setSiguiente(siguiente);
                siguiente.setPrevio(previo);
            }
            tama--;   
        }
    }

    public int valorEn(int posicion) throws RuntimeException { 
        //excepcion
        //Validar la posición
        //que posiciones son validas? de 0 a n - 1 (n es la cantidad de nodos)
        int tama = longitud();
        if (posicion >= 0 && posicion < tama) {
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getValor();
        } else {
            throw new RuntimeException("Posicion no valida");
        }

        //QUEUE ---> FIFO(PRIMERO EN LLEGAR, PRIMERO EN SALIR)
        //AGREGAR UN VALOR AL FINAL DE LA LISTA
        public void push(int valor){
            agregar(valor);
        }
        //LEE EL VALOR DIRECTAMENTE ACCESIBLE SIN BORRARLO
        public int peek(){
            return valorEn(0);
        }
        //LEE EL VALOR DIRECTAMENTE ACCESIBLE Y LO BORRA
        public int pop(){
            int valor = valorEn(0);
            eliminarEn(0, false);
            return valor;
        }
}