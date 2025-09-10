package school.sptech;

import java.util.Scanner;

public class Armazenamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua quantidade de discos instalados: ");
        int quantidadeDiscos = scanner.nextInt();

        if (quantidadeDiscos < 1) {
            System.out.println("Informe corretamente");
            return;
        }

        int[] capacidadeTotalDiscos = new int[quantidadeDiscos];
        int[] armazenamentoUtilizadoDiscos = new int[quantidadeDiscos];

        int numeroDisco = 1;

        for (int i = 0; i < capacidadeTotalDiscos.length; i++) {
            System.out.print("Informe a capacidade total de armazenamento do disco " + numeroDisco + " : ");
            capacidadeTotalDiscos[i] = scanner.nextInt();

            do {
                System.out.print("Informe a quantidade já utilizada de armazenamento do disco " + numeroDisco + " : ");
                armazenamentoUtilizadoDiscos[i] = scanner.nextInt();

                if (armazenamentoUtilizadoDiscos[i] > capacidadeTotalDiscos[i]) {
                    System.out.println("Erro: o valor utilizado não pode ser maior que a capacidade total.");
                }
            } while (armazenamentoUtilizadoDiscos[i] > capacidadeTotalDiscos[i]);

            numeroDisco++;
        }

        double somaUtilizado = 0.0;
        double somaCapacidadeTotal = 0.0;
        double porcentagemTotalUso = 0.0;
        double[] porcentagemUsoPorDisco = new double[quantidadeDiscos];

        for (int i = 0; i < capacidadeTotalDiscos.length; i++) {
            somaUtilizado += armazenamentoUtilizadoDiscos[i];
            somaCapacidadeTotal += capacidadeTotalDiscos[i];
            porcentagemUsoPorDisco[i] = (armazenamentoUtilizadoDiscos[i] * 100.0) / capacidadeTotalDiscos[i];
        }

        porcentagemTotalUso = (somaUtilizado * 100.0) / somaCapacidadeTotal;

        System.out.println("\n--- Porcentagem de uso de cada disco ---");
        for (int i = 0; i < quantidadeDiscos; i++) {
            System.out.printf("Disco %d: %.2f%% utilizado\n", i + 1, porcentagemUsoPorDisco[i]);
            if (porcentagemUsoPorDisco[i] < 80.00) {
                System.out.println("Uso Adequado do armazenamento");
            } else if (porcentagemUsoPorDisco[i] >= 80.00 && porcentagemUsoPorDisco[i] < 95.00) {
                System.out.println("Atenção ao uso do armazenamento");
            } else {
                System.out.println("Alerta! Uso Crítico do armazenamento");
            }

        }

        System.out.println("\n--- Porcentagem total de uso do servidor ---");
        System.out.printf("Uso total: %.2f%%\n", porcentagemTotalUso);
        if (porcentagemTotalUso < 80.00) {
            System.out.println("Uso Adequado do armazenamento");
        } else if (porcentagemTotalUso >= 80.00 && porcentagemTotalUso < 95.00) {
            System.out.println("Atenção ao uso do armazenamento");
        } else {
            System.out.println("Alerta! Uso Crítico do armazenamento");
        }
    }
}
