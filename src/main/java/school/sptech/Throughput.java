package school.sptech;

import java.util.Scanner;

public class Throughput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de pacotes recebidos inicialmente: ");
        int pktRecebidosInicial = scanner.nextInt();

        System.out.print("Informe a quantidade de pacotes enviados inicialmente: ");
        int pktEnviadosInicial = scanner.nextInt();

        System.out.print("Informe o intervalo de tempo da comparação (em segundos): ");
        int tempoComparacao = scanner.nextInt();

        System.out.print("Informe a quantidade de pacotes recebidos posteriormente: ");
        int pktRecebidosPosterior = scanner.nextInt();

        System.out.print("Informe a quantidade de pacotes enviados posteriormente: ");
        int pktEnviadosPosterior = scanner.nextInt();

        if (tempoComparacao <= 0) {
            System.out.println("Intervalo de tempo inválido.");
            return;
        }

        double throughputEntrada = (double)(pktRecebidosPosterior - pktRecebidosInicial) / tempoComparacao;
        double throughputSaida = (double)(pktEnviadosPosterior - pktEnviadosInicial) / tempoComparacao;
        double throughputTotal = throughputEntrada + throughputSaida;

        System.out.printf("Throughput de entrada: %.2f pkts/seg\n", throughputEntrada);
        System.out.printf("Throughput de saída: %.2f pkts/seg\n", throughputSaida);
        System.out.printf("Throughput total: %.2f pkts/seg\n", throughputTotal);

        double[] throughputValores = {throughputSaida, throughputEntrada, throughputTotal};

        String[] nomes = {"Throughput de saída", "Throughput de entrada", "Throughput total"};

        for (int i = 0; i < throughputValores.length; i++) {
            double valor = throughputValores[i];
            System.out.printf("\n%s: %.2f pkts/seg -> ", nomes[i], valor);

            if (valor > 2000) {
                System.out.println("Crítico, muito alto, suspeita");
            } else if (valor > 1000) {
                System.out.println("Atenção, acima do esperado");
            } else if (valor >= 500) {
                System.out.println("Ideal");
            } else if (valor >= 100) {
                System.out.println("Atenção, abaixo de esperado");
            } else {
                System.out.println("Crítico, muito baixo, lentidão");
            }
        }
    }
}
