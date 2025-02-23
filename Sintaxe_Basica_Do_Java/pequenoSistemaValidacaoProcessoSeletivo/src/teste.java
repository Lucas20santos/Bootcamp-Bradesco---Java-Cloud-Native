public class teste {
    public static void main(String[] args) {
        int [] numeros = {0, 0, 0, 0, 0};

        System.out.println(numeros.length);

        for (int i = 0; i < 5; i++) {
            numeros[i] = i;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
