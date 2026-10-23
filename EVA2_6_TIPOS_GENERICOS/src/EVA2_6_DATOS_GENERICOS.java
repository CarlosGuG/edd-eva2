public class EVA2_6_DATOS_GENERICOS {
    public static void main(String[] args) throws Exception {
        //int ----> integer, double ---> Double
        Ejemplo<Integer> prueba = new Ejemplo<Integer>();
        prueba.setDato(4);
    }
}
class listaDoble<T> {
    // Implementation for doubly linked list with generic type T
}
class Ejemplo<T> {
   private T dato;
   public Ejemplo(){

   }
   public Ejemplo(T dato){
       this.dato = dato;
   }
   public T getDato() {
       return dato;
   }
   public void setDato(T dato) {
       this.dato = dato;
   }
}