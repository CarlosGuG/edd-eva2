

public class EVA2_4_QUEUE {
    public static void main(String[] args) throws Exception {
        MyQueue lista = new MyQueue();
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimir();
        System.out.println("Orden Inverso: ");
        lista.imprimirInverso();
        System.out.println("Insertar en el valor 3: ");
        lista.insertarEn(300, 0);
        lista.imprimir();
        System.out.println("Eliminar en el valor 2: ");
        lista.eliminarEn(2, false);
        lista.imprimir();
    }
}
