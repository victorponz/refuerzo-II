public class Ejercicio4{
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 5, 5, 3, 2, 1, 3, 3, 5, 5};
        System.out.println(moda(numeros));
    }
    public static int moda(int[] numeros){
        int candidato = 0, cantidad;
        int max = 0;

        for (int i = 0; i < numeros.length; i++) {
            // Vamos a ver cuántos números hay del dígito i-ésimo
            cantidad = 0;
            for (int j = i; j < numeros.length; j++) {
                // Cada vez que el número j-ésimo es igual al i-ésimo, aumentamos la cantidad
                if (numeros[j] == numeros[i]){
                    cantidad++;
                }
            }
            // Y ya solo falta comprobar si es el máximo y gua
            if (cantidad > max){
                max = cantidad;
                candidato = numeros[i];
            }
        }

        return candidato;
    }
}