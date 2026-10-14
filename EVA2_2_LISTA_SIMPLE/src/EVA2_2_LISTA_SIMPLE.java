public class EVA2_2_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple(); 
        /*int[] arreglo = new int[1000000];
        long ini, fin, tiempo;
        ini = System.nanoTime(); //TOMAMOS LA "HORA" ANTES DE EMPEZAR
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        fin = System.nanoTime(); //TOMAMOS LA HORA DESPUES DE REALIZAR EL PROCESO
        tiempo = fin - ini;
        System.out.println("Tiempo arreglo = " + tiempo + " nanosegundos");
         
        ini = System.nanoTime(); //TOMAMOS LA "HORA" ANTES DE EMPEZAR
        for (int i = 0; i < 1000000; i++) {
            lista.agregar((int)(Math.random() * 100));
        }
        fin = System.nanoTime(); //TOMAMOS LA HORA DESPUES DE REALIZAR EL PROCESO
        tiempo = fin - ini;
        System.out.println("Tiempo lista = " + tiempo + " nanosegundos");*/
        System.out.println("Tamaño de la lista: " + lista.longitud());
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimir();
        System.out.println("Tamaño de la lista: " + lista.longitud());
        System.out.println("Valor en la posicion 1: " + lista.valorEn(1));
        System.out.println("Posicion del valor 500: " + lista.encontrar(500));
        lista.imprimir();
        System.out.println("");
        lista.insertarEn(500,0);
        lista.imprimir();
        System.out.println("");
        System.out.println("Imprimir inverso: ");
        lista.imprimirInverso();
        System.out.println("Tamaño de la lista metodo 2: " + lista.longitudUno());
        lista.imprimirInverso();
    }
    
}
