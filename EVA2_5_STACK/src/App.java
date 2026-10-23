public class App {
    public static void main(String[] args) throws Exception {
        MyStack lista = new MyStack();
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.imprimir();
        System.out.println();
        lista.push(14);
        lista.imprimir();
        System.out.println();
        lista.push(15);
        lista.imprimir();
        lista.pop();
        System.out.println();
        lista.imprimir();
    }
}
