public class A12_cocienteResto {
    public static void main(String[] args) {
        final int MINUTO_POR_HORA = 60; //Valor constante, 1 hora siempre es igual a 60 min
        int minuto = 145; //Primer ejercicio con 145 min

        int hora = minuto / MINUTO_POR_HORA; //Division de minutos a transformar con 60
        int minuto_resto = minuto % MINUTO_POR_HORA; // resto de las division anterior planteada

        System.out.println("Horas: " + hora); //las dos salidas a la consola
        System.out.println("minutos: " + minuto_resto);

        int minuto1 = 59; // renombre de variables para 2do ejercicio 59 min

        int hora1 = minuto1 / MINUTO_POR_HORA;
        int minuto_resto1 = minuto1 % MINUTO_POR_HORA;

        System.out.println("Horas: " + hora1);
        System.out.println("minutos: " + minuto_resto1);

        int minuto2 = 121; // renombre de variables para 3er ejercicio 59 min

        int hora2 = minuto2 / MINUTO_POR_HORA;
        int minuto_resto2 = minuto2 % MINUTO_POR_HORA;

        System.out.println("Horas: " + hora2);
        System.out.println("minutos: " + minuto_resto2);

    }
}

