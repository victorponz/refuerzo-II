public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(esHyperpar(100)); //false
        System.out.println(esHyperpar(202)); //true
        System.out.println(esHyperpar(1024)); //false
    }
    public static boolean esHyperpar(int num){
        String numero = Integer.toString(num);
        for (int i = 0; i < numero.length(); i++) {
            if (Integer.parseInt("" + numero.charAt(i)) % 2 != 0)
                return false;

        }
        return true;
    }
    //Sin convertir a String
    public static boolean esHyperpar2(int num){
      int digito;
        do {
            // Me quedo con el último dígito
            digito = num % 10;
            // Y ahora los dígitos del número se reducen una unidad
            num = num / 10;
            // Si es impar, ya hemos acabado
            if (digito % 2 != 0) return false;
        }while (num > 0);
        // Si llega aquí es porque sí es hyperpar 
        // si no hubiera salido por return false
        return true;
    }
       
}
