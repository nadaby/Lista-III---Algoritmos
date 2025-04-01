import java.util.Scanner;

class Main {

    // DECLARANDO AS VARIÁVEIS
    static double salario_fixo, total_vendas, percentual_comissao, salario_total;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // PEDINDO O VALOR DO SALÁRIO FIXO
        System.out.print("Digite o valor do salário fixo do vendedor (mês): ");
        salario_fixo = console.nextDouble();

        // PEDINDO O VALOR TOTAL DAS VENDAS FEITAS NO MÊS
        System.out.print("Digite o valor total das vendas realizadas (mês): ");
        total_vendas = console.nextDouble();

        // PEDINDO O PERCENTUAL DE COMISSÃO SOB AS VENDAS
        System.out.print("Digite o percentual de comissão a receber sob o total das vendas mensais (%): ");
        percentual_comissao = console.nextDouble();

        // FAZENDO OS CÁLCULOS
        salario_total = salario_fixo + (total_vendas * (percentual_comissao / 100));

        // PASSANDO O RESULTADO
        System.out.println("O salário total do vendedor é: R$" + salario_total);

    }

}

