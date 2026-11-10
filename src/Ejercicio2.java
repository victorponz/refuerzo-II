public class Ejercicio2 {

    public static void main(String[] args) {
        int dia, mes;

        dia = 20;
        mes = 1;

        System.out.println( diasHastaNochevieja(dia, mes) );

    }

    public static int diasHastaNochevieja(int dia, int mes){
        final int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int res;
        // Del mes actual solo me quedan desde el día actual hasta final de mes.
        // Por ejemplo, si estoy a 20 de enero, me quedan 11 días
        res = diasMes[mes-1] - dia;
        // Y ahora sumamos todos los días de los meses posteriores
        for (int i = mes; i < 12; i++){
            res += diasMes[i];
        }
        return res;
    }

}
