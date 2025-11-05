public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {6, 7, 7, 8};

        System.out.println(orden(numeros));
    }
    public static String orden(int ...numeros){
        boolean ascendente = false;
        boolean descendente = false;
        // Recorremos el array y, cada vez que veamos que el siguiente es mayor que el actual, marcamos la
        // bandera `ascendente`. Si es menor que el actual, marcamos `descendente`
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < numeros[i + 1]){
                ascendente = true;
            }else if (numeros[i] > numeros[i + 1]) {
                descendente = true;
            }
        }

        /*
        Una vez llegados aquí, tememos la siguiente tabla de verdad:
        | ascendente | descendente | resultado   | Explicación
        -----------------------------------------------------------------------------------------
        |     true   |    false   | Ascendente  | Como SÍ ha entrado alguna vez en ascendente, pero nunca en descendente, solo puede ser Ascendente
        |     false  |    true    | Descendente | Como SÌ ha entrado alguna vez en descendente, pero nunca en ascendente, solo puede ser Descendente
        |     true   |    true    | Desordanado | Como alguna vez ha ido creciendo y alguna decreciendo es que está Desordenado
        |     false  |    false   | Iguales     | No ha cumplido nunca ninguna condición por lo que las banderas siguen false
         */
        if (ascendente && !descendente){
            return "Ascendente";
        }else if (descendente && !ascendente){
            return "Descendente";
        }else if(ascendente && descendente){
            return "Desordenado";
        }else {
            return "Iguales";
        }
    }
    public static String orden1(int[] numeros){
        int orden = 0;
        boolean ordenado = true;
        boolean comparado = false;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i+1] > numeros[i]){
                //Si ya hemos comparado
                if (orden != 1 && comparado){
                    ordenado = false;
                    break;
                }
                orden = 1;
                comparado = true;

            }else  if (numeros[i+1] < numeros[i]){
                //Si ya hemos comparado
                if (orden != 2 && comparado){
                    ordenado = false;
                    break;
                }
                orden = 2;
                comparado = true;
            }
        }
        if (ordenado){
            if (orden == 1){
                return "Ascendente";
            }else if (orden == 2){
                return "Descendente";
            }else{
                return "Iguales";
            }
        }else{
            return "Desordenado";
        }

    }
}
