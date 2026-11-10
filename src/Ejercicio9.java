
public class Ejercicio9{
    /*
    NO VA PARA EL EXAMEN
     */
    public static int dividirFactoriales(int dividendo, int divisor) {
        int resultado = 1;
        for (int i = dividendo; i > divisor; i--) {
            resultado *= i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(dividirFactoriales(14, 8));
    }
}
