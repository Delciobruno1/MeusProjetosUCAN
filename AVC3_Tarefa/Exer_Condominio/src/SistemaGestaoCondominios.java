import java.util.Scanner;

// Classe principal que contém o menu principal
public class SistemaGestaoCondominios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CondominioManager condominioManager = new CondominioManager();

        int escolha;
        do {
            System.out.println("==== Menu Principal ====");
            System.out.println("1. Gerir Condomínio");
            System.out.println("2. Gerir Condómino");
            System.out.println("3. Gerar Balancetes Mensais/Trimestrais");
            System.out.println("4. Gerar Relatório de Contas Anual");
            System.out.println("5. Gerir Funcionários");
            System.out.println("6. Gerir Empresas de Serviços");
            System.out.println("7. Consultar Informações do Condomínio");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (escolha) {
                case 1:
                    // Gerir Condomínio
                    condominioManager.exibirMenuGerirCondominios();
                    break;
                case 2:
                    // Gerir Condómino
                    condominioManager.exibirMenuGerirCondominos();
                    break;
                case 3:
                    // Gerar Balancetes Mensais/Trimestrais
                    condominioManager.gerarBalancetes();
                    break;
                case 4:
                    // Gerar Relatório de Contas Anual
                    condominioManager.gerarRelatorioContasAnual();
                    break;
                case 5:
                    // Gerir Funcionários
                    condominioManager.gerirFuncionarios();
                    break;
                case 6:
                    // Gerir Empresas de Serviços
                    condominioManager.gerirEmpresasServicos();
                    break;
                case 7:
                    // Sair
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 7);

        scanner.close();
    }
}
