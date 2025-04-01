import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        // DECLARANDO AS VARIÁVEIS
        double capital, taxa_juros, montante;
        int prazo_aplicacao;
        String taxaTexto, capitalTexto;

        Scanner console = new Scanner(System.in);

        // PEDINDO OS VALORES
        System.out.print("Digite o valor do capital a ser aplicado (R$): ");
        capitalTexto = console.next().replace(",", ".");
        capital = Double.parseDouble(capitalTexto);

        System.out.print("Digite a taxa de juros mensal (%): ");
        taxaTexto = console.next().replace(",", ".");
        taxa_juros = Double.parseDouble(taxaTexto) / 100;

        System.out.print("Digite o prazo de aplicação (meses): ");
        prazo_aplicacao = console.nextInt();

        // CALCULANDO O VALOR DO MONTANTE A SE FORMAR
        montante = capital * Math.pow((1 + taxa_juros), prazo_aplicacao);

        // RETORNANDO O VALOR DO MONTANTE FORMADO
        System.out.printf("O valor do montante a ser recebido é: R$ %.2f%n", montante);
    }
}
