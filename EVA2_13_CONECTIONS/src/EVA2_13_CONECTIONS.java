import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class EVA2_13_CONECTIONS {
    public static void main(String[] args) throws Exception {
        //OPERA COMO UNA LISTA DOBLE
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        
        System.out.println(lista);
        System.out.println(lista.size());
        lista.clear();
        System.out.println(lista);
        System.out.println(lista.size());

        //ARRAYLIST
        //TRABAJA CON ARREGLOS
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hola");
        arrayList.add("");
        arrayList.add("Mundo");
        arrayList.add("!!");
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        //QUEUE
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
