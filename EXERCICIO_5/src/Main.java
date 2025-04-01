import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        // DECLARANDO AS VARIÁVEIS
        double horas_trabalhadas, valor_hora, valor_salario, valor_porFilho, valor_salarioFamilia, valor_salarioBruto;
        int qntdd_filhos;
        String qntdd_horas_Texto, valor_hora_Texto;

        Scanner console = new Scanner(System.in);

        // PEDINDO OS VALORES
        System.out.print("Digite a quantidade de horas trabalhadas (mês): ");
        qntdd_horas_Texto = console.next().replace(",", ".");
        horas_trabalhadas = Double.parseDouble(qntdd_horas_Texto);

        System.out.print("Digite o valor de cada hora trabalhada (R$): ");
        valor_hora_Texto = console.next().replace(",", ".");
        valor_hora = Double.parseDouble(valor_hora_Texto);

        // CALCULANDO O VALOR DO SALÁRIO SEM O SALÁRIO FAMÍLIA
        valor_salario = horas_trabalhadas * valor_hora;

        // RECEBENDO A QUANTIDADE DE FILHOS DO TRABALHADOR
        System.out.print("Digite a quantidade de filhos com idade <= 14 anos e/ou que sejam deficientes: ");
        qntdd_filhos = console.nextInt();


        // REGRAS USADAS PARA CALCULAR O SALÁRIO FAMÍLIA
        if (valor_salario <= 1651.00) {
            valor_porFilho = 58.21;

        } else if (valor_salario >= 1651.01 && valor_salario <= 2488.28) {
            valor_porFilho = 41.76;

        } else {
            valor_porFilho = 0;
            System.out.println("O trabalhador não tem direito ao salário família por ter o salário superior a máxima permitida.");
        }


        // CALCULANDO O VALOR DO SALÁRIO FAMÍLIA
        valor_salarioFamilia = valor_porFilho * qntdd_filhos;

        // RETORNANDO O VALOR DO SALÁRIO FAMÍLIA
        System.out.println("O valor a ser recebido de salário família é: R$" + valor_salarioFamilia);

        // CALCULANDO O VALOR DO SALÁRIO BRUTO
        valor_salarioBruto = valor_salario + valor_salarioFamilia;

        // RETORNANDO O VALOR DO SALÁRIO BRUTO
        System.out.printf("O valor do salário bruto a ser recebido é: R$ %.2f%n", valor_salarioBruto);
    }
}
