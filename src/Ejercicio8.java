import java.util.Arrays;

public class Ejercicio8 {
    public static int cualFalta(int[] numeros) {
        //Ordenamos los números de menor a mayor
        Arrays.sort(numeros);
        // Recorremos el array hasta la length -1 porque en el `if` estamos comprobando
        // coon el siguiente, y el último NO tiene siguiente
        for (int i = 0; i < numeros.length -1; i++) {
            if (numeros[i+1] - numeros[i] == 2){
                return  numeros[i] + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numeros = {5,6,4,2};
        System.out.println(cualFalta(numeros));
    }
}

