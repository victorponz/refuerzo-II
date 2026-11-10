public class EncadenandoPalabras {
    public static boolean jugar(String palabra) {
        String[] palabras = palabra.split("\\s+");
        String primera, ultima;
        // Recorrer cada palabra menos la última porque no tiene siguiente
        for (int i = 0; i < palabras.length - 1; i++) {
            // Cogemos la última sílaba de la actual y la primera de la siguiente
            ultima = ultimaSilaba(palabras[i]);
            primera = primeraSilaba(palabras[i + 1]);
            // Si son distintas, devolvemos false
            if (!primera.equals(ultima)) return false;
        }
        // Devolvemos true, porque si llega hasta aquí es que nunca ha sido false
        return true;
    }
    private static String ultimaSilaba(String palabra){
        // Cogemos las dos últimas letras.
        // Si a `substring` no se le pasa el segundo parámetro, devuelve hasta el final de la cadena
        return palabra.substring(palabra.length() - 2);
        // Esto equivale a esta llamada
        // return palabra.substring(palabra.length() - 2, palabra.length());

    }
    private static String primeraSilaba(String palabra){
        return palabra.substring(0, 2);
    }

}
