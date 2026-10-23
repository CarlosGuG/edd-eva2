public class EVA2_8_RECURSIVIDAD {
    public static void main(String[] args) throws Exception {
        imprimirCliclo(5);
        imprimirRecu(5);
    }
    public static void imprimirCliclo(int numero){
        for (int i = numero; i >= 1; i--){
            System.out.println(i + " - ");
        }
        System.out.println("");
    }
    public static void imprimirRecu(int numero){
        //RESUELVA UNA PARTE DEL PROBLEMA
        System.out.println(numero + " - ");
        // SE LLAME A SI MISMO
        if (numero > 1){ // DETENER LA RECURSIVIDAD
        imprimirRecu(numero - 1);
        
        }
    }
}
