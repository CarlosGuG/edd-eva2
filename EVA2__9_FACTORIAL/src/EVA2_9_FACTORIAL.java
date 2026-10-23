public class EVA2_9_FACTORIAL {
    public static void main(String[] args) throws Exception {
        System.out.println("El factorial de 5 es: " + factorialCiclo(5));
        System.out.println("El factorial de 5 en recursivo es: " + factorialRecursivo(5));
    }
    public static int factorialCiclo(int valor){
        int factorial = 1;
        for (int i = 1; i <= valor; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static int factorialRecursivo(int valor){
        if (valor == 0) {
            return 1;
        } else {
            return valor * factorialRecursivo(valor - 1);
        }
    }
}
