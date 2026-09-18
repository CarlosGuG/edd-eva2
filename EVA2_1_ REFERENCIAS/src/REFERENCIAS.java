public class REFERENCIAS {
    public static void main(String[] args) throws Exception {
       Ejemplo inicio = new Ejemplo();
       inicio.valor = 100;
       System.out.println("inicio: " + inicio.valor);
       System.out.println("inicio.valor: " + inicio.valor);
       System.out.println("inicio.otro: " + inicio.otro);
       //CREAR UNA LISTA:
       inicio.otro = new Ejemplo();
       inicio.otro.valor = 200; //SEGUNDO OBJETO
       inicio.otro.otro = new Ejemplo();
       inicio.otro.otro.valor = 300; //TERCER OBJETO
       inicio.otro.otro.otro = new Ejemplo();
       inicio.otro.otro.otro.valor = 400; //CUARTO OBJETO

       Ejemplo sig = inicio;
       while(sig != null){
           System.out.println("[" + sig.valor + "] ");
           sig = sig.otro;
       }
    }
}

class Ejemplo{
    int valor; 
    Ejemplo otro;
}