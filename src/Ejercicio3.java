public class Ejercicio3{
 
    public static void main(String[] args){
        String digitos = "3433";
        System.out.println(sumaDigitos(digitos));
    }
    public static String sumaDigitos(String digitos){
        int suma;
        int digito;
        String resultado = "";

        suma = 0;

        //Recorremos toda la cadena
        for(int i = 0; i < digitos.length(); i++){
            // Convertimos a int el dígito situado en la posición `i`
            digito = Integer.parseInt("" + digitos.charAt(i));
            // Y ahora acumulamos el dígito `i`
            suma += digito;

            // En el caso de que sea el último dígito, imprimimos el dígito, el signo `=` y la suma
            if(i == digitos.length()-1){
                resultado += digito + " = " + suma;
            } else {
                // Aquí solo imprimimos el dígito y el signo `=`
                resultado += digito + " + ";
            }

        }
        return resultado;
    }
}