public class ejercicios {
    public static void main(String[] args) {
        // 1. Operaciones con enteros
        int a = 25;
        int b = 7;
        int suma = a + b;
        int producto = a * b;
        long numeroGrande = 9000000000L;
        System.out.println("Suma: " + suma + ", Producto: " + producto + ", Número grande: " + numeroGrande);

        // 2. Operaciones con decimales
        float t = 3.14f;
        float r = 5.6f;
        float sumadecimales = t * r;
        System.out.println(sumadecimales);

        // 3. Caracteres y cadenas
        char letra = 'J';
        String palabra = "Java";
        System.out.println("Letra: " + letra + ", Palabra: " + palabra);

        // 4. Booleanos
        boolean esMayor = (a > b);
        System.out.println("¿a > b? "+esMayor);

        // 5. Uso de arreglos
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.print("Arreglo: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
