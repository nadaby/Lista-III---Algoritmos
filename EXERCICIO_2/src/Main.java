import java.util.Scanner;

class Main {

    // DECLARANDO AS VARIÁVEIS
    static double valor_produto, produto_com_acrescimo;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String valorTexto;

        // PEDINDO O VALOR DO PRODUTO
        System.out.print("Digite o valor do produto: ");
        valorTexto = console.next().replace(",", ".");

        // CONVERTENDO PARA DOUBLE
        valor_produto = Double.parseDouble(valorTexto);

        // CALCULANDO O NOVO VALOR DO PRODUTO
        produto_com_acrescimo = valor_produto + (valor_produto * 0.10);

        // INFORMANDO O NOVO VALOR DO PRODUTO COM ACRÉSCIMO
        System.out.printf("O novo valor do produto é: R$ %.2f%n", produto_com_acrescimo);
    }
}
