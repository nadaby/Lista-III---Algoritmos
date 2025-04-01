import java.util.Scanner;

class Main {

    // DECLARANDO AS VARIÁVEIS
    static double primeiro_numero, segundo_numero, resultado_logaritmo;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // PEDINDO O PRIMEIRO NÚMERO
        System.out.print("Digite o primeiro número: ");
        primeiro_numero = console.nextDouble();

        // PEDINDO O SEGUNDO NÚMERO
        System.out.print("Digite o segundo número para representar a base: ");
        segundo_numero = console.nextDouble();

        // VERIFICANDO SE OS VALORES PASSADOS SÃO VÁLIDOS
        if (primeiro_numero <= 0 || segundo_numero <= 0) {
            System.out.println("Os números passados não podem ser negativos");
        } else if (segundo_numero == 1) {
            System.out.println("O segundo número passado, que representa a base, não pode ser 1");
        } else {
            // FAZENDO OS CÁLCULOS
            resultado_logaritmo = Math.log(primeiro_numero) / Math.log(segundo_numero);

            // PASSANDO O RESULTADO
            System.out.println("O logaritmo de " + primeiro_numero + " na base " + segundo_numero + " é: " + resultado_logaritmo);
        }

    }
}
