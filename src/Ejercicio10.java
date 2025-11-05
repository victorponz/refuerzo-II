public class Ejercicio10 {
    /*
    Por ejemplo:
    litros(5, 500, 10) -> 500 + 490 + 480 + 470 + 460 = 2400 //Voy
    litros(4, 300, 20) -> 300 + 280 + 260 + 240 = 1080

     */
    public static int litros(int compartimentos, int maxLitros, int diferencia){
        // Acumulador para los litros totales
        int litros = 0;
        // Litros del compartimento actual
        int litrosActual = maxLitros;
        // Hacemos el bucle las veces que diga la variable compartimentos
        for (int i = 1; i <= compartimentos ; i++) {
            // Sumamos la cantidad actual
            litros += litrosActual;
            // Y ahora la reducimos en diferencia
            litrosActual -= diferencia;
        }
        return litros;
    }
}

