package school.sptech;
import java.util.Scanner;

public class javi {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Informe sua quantidade de discos instalados: ");
        Integer qtd_discos = sc1.nextInt();
        if (qtd_discos<1) {
            System.out.println("Informe corretamente");
        }
        int[] total_discos = new int[qtd_discos];
        int[] utilizada_discos = new int[qtd_discos];
        Integer discos = 1;
        for (int i = 0; i < total_discos.length; i++) {
            System.out.print("Informe a capacidade total de armazenamento do disco " + discos + " : ");
            total_discos[i] = sc1.nextInt();
            System.out.print("Informe a quantidade já utilizada de armazenamento do disco " + discos + " : ");
            utilizada_discos[i] = sc1.nextInt();
            discos++;
        }
        Double todos_utilizado = 0.0;
        Double todos_total = 0.0;
        Double resultado1 = 0.0;
        Double[] individual_discos = new Double[qtd_discos];

        for (int j = 0; j < total_discos.length; j++) {
            todos_utilizado += utilizada_discos[j];
            todos_total += total_discos[j];
            individual_discos[j] = (utilizada_discos[j] * 100.0) / total_discos[j];
        }
        resultado1 = (todos_utilizado * 100.0) / todos_total;
        System.out.println("\n--- Porcentagem de uso de cada disco ---");
        for (int i = 0; i < qtd_discos; i++) {
            System.out.printf("Disco %d: %.2f%% utilizado\n", i + 1, individual_discos[i]);
        }
        System.out.println("\n--- Porcentagem total de uso do servidor ---");
        System.out.printf("Uso total: %.2f%%\n", resultado1);

    }
    }
