import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {5, 7, 4, 3, 1, 6};
        System.out.println(mediana(numeros));
    }
    public static double mediana(int[] numeros){
        double mediana;
        // Ordenamos los números de menor a mayor, para poder coger los que están
        // en medio
        Arrays.sort(numeros);
        // Si la longitud es par, me debo quedar con los dos centrales y sacar la media
        if (numeros.length % 2 == 0){
            double a = (double)numeros[numeros.length / 2];
            double b = (double)numeros[numeros.length / 2 - 1];
            mediana = (a + b)/ 2;
        }else{
            // En este caso, como hay un número impar de elementos, se coge solo el del medio
            mediana = numeros[numeros.length / 2];
        }

        return mediana;
    }
}
