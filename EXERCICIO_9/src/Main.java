import java.util.Scanner;

class Main {

    // DECLARANDO AS VARIÁVEIS
    static int total_segundos, horas, minutos, segundos;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // PEDINDO A QUANTIDADE TOTAL DE SEGUNDOS
        System.out.print("Digite a quantidade total de segundos: ");
        total_segundos = console.nextInt();

        // CALCULANDO A QUANTIDADE HORAS, MINUTOS E SEGUNDO

        // -> 1 HORA TEM 3600 SEGUNDOS
        // -> 1 MINUTO TEM 60 SEGUNDOS

        horas = total_segundos / 3600;
        minutos = (total_segundos % 3600) / 60;
        segundos = total_segundos % 60;

        // EXIBINDO O RESULTADO
        System.out.println("Em" + total_segundos + "segundos temos:" + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)."  );

    }

}



