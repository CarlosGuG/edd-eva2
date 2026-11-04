import java.util.LinkedList;
import java.util.Iterator;

public class EVA2_14_ITERATOR {
    public static void main(String[] args) throws Exception {
     LinkedList<Integer> lista = new LinkedList<>();
     /*lista.add(100);
     lista.add(200);
     lista.add(300);
     lista.add(400);
     lista.add(500);/* */
        for (int i = 0; i < 1000000; i++) {
            lista.add((int)(Math.random() * 1000));
        }  
        System.out.println("Cantidad de nodos: " + lista.size());

        /*int promedio = 0;
        for (int i = 0; i < 1000000; i++) { //O(N2)
            promedio += lista.get(i);

        }
        System.out.println("Sumatoria: " + promedio); /* */
        //ITERADOR Proporciona un mecanismo para acceder a todos los valores
        // almacenados en nuestra lista
        Iterator<Integer> iterador = lista.iterator();
        int promedio = 0;
        while (iterador.hasNext()) {
            promedio += iterador.next();
        }
        System.out.println("Sumatoria: " + promedio);
        System.out.println("Promedio: " + (promedio / 1000000.0)); 
    }
}
