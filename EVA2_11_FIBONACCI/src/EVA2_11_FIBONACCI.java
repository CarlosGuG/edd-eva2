public class EVA2_11_FIBONACCI {
    public static void main(String[] args) throws Exception {
      System.out.println("Cuál es el Fibonacci de  7 es:  " + fibonacciCrear(7));
      
        }
    
    
     //Crear fibonacci
    public static int fibonacciCrear(int posi) {
        if (posi > 1) {
            return fibonacciCrear(posi - 2) + fibonacciCrear(posi - 1);
        } else {
            return 1;
        }
    }
        
}