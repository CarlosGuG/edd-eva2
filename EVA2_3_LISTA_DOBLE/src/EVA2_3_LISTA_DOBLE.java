public class EVA2_3_LISTA_DOBLE {
    public static void main(String[] args) throws Exception {
        ListaDoble lista = new ListaDoble();
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);        
        lista.imprimir();
        lista.imprimirInverso();
        lista.insertarEn(2, 250);
        lista.imprimir();
        System.out.println("");
        lista.eliminarEn(4, false);
        lista.imprimir();
        System.out.println("");

    }
}
