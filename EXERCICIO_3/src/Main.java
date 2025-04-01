import java.util.Scanner;

class Main {

    // DECLARANDO AS VARIÁVEIS
    static double temperatura_Fahrenheit, temperatura_Celsius;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        //PEDINDO A TEMPERATURA EM FAHRENHEIT
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        temperatura_Fahrenheit = console.nextDouble();

        // CALCULANDO A TEMPERATURA EM GRAUS CELSIUS
        temperatura_Celsius = (temperatura_Fahrenheit - 32) / 1.8;

        // INFORMANDO A TEMPERATURA EM GRAUS CELSIUS
        System.out.println("A temperatura em graus Celsius é: " + temperatura_Celsius);

    }
}