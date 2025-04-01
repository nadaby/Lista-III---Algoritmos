import java.util.Scanner;

class Main {

    // DECLARANDO AS VARIÁVEIS
    static int primeiro_numero, segundo_numero, media_aritmetica;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        //PEDINDO O PRIMEIRO NÚMERO
        System.out.print("Digite o primeiro número: ");
        primeiro_numero = console.nextInt();

        //PEDINDO O SEGUNDO NÚMERO
        System.out.print("Digite o segundo número: ");
        segundo_numero = console.nextInt();

        //CALCULANDO A MÉDIA ARITMÉTICA DOS NÚMEROS
        media_aritmetica = (primeiro_numero + segundo_numero) / 2;

        // INFORMANDO A MÉDIA ARITMÉTICA DOS NÚMEROS INFORMADOS
        System.out.println("A média aritmética dos números informados é: " + media_aritmetica);

    }
}

