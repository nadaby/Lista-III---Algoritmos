import java.util.Scanner;

class Main {

    // DECLARANDO AS VARIÁVEIS
    static double valor_1, valor_2, valor_3, media_aritmetica, media_harmonica, media_geometrica;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // PEDINDO OS VALORES
        System.out.print("Digite o primeiro valor: ");
        valor_1 = console.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor_2 = console.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        valor_3 = console.nextDouble();

        // CALCULANDO A MÉDIA ARITMÉTICA
        media_aritmetica = (valor_1 + valor_2 + valor_3) / 3;

        // CALCULANDO A MÉDIA HARMÔNICA
        media_harmonica = 3 / ((1 / valor_1) + (1 / valor_2) + (1 / valor_3));

        // CALCULANDO A MÉDIA GEOMÉTRICA
        media_geometrica = Math.cbrt(valor_1 * valor_2 * valor_3);


        // EXIBINDO O RESULTADO
        System.out.printf("A média aritmética é: %.2f%n", media_aritmetica);
        System.out.printf("A média harmônica é: %.2f%n", media_harmonica);
        System.out.printf("A média geométrica é: %.2f%n", media_geometrica);


    }

}



