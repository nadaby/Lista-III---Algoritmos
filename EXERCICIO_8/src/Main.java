import java.util.Scanner;

class Main {

    // DECLARANDO AS VARIÁVEIS
    static int total_veiculos, total_rodas, total_motos, total_carros;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // PEDINDO A QUANTIDADE TOTAL DE VEÍCULOS
        System.out.print("Digite a quantidade total de veículos no estacionamento: ");
        total_veiculos = console.nextInt();

        // PEDINDO A QUANTIDADE TOTAL DE RODAS QUE HÁ NO ESTACIONAMENTO
        System.out.print("Digite a quantidade total de rodas que há no estacionamento: ");
        total_rodas = console.nextInt();

        // VERIFICANDO SE OS VALORES SÃO VÁLIDOS
        if (total_veiculos <= 0 || total_rodas <= 0 || total_rodas % 2 != 0) {
            System.out.println("Os valores inseridos são inválidos!");
        } else {

            // CALCULANDO A QUANTIDADE DE CARROS E MOTOS
            total_motos = (4 * total_veiculos - total_rodas) / 2;
            total_carros = total_veiculos - total_motos;

            // EXIBINDO O RESULTADO
            System.out.println("Quantidade de carros: " + total_carros);
            System.out.println("Quantidade de motos: " + total_motos);
        }

    }

}

