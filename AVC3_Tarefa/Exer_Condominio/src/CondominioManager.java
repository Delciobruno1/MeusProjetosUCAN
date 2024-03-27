import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

// Classe para gerenciar operações relacionadas aos condomínios
class CondominioManager {
    private List<Condominio> condominios;

    public CondominioManager() {
        this.condominios = new ArrayList<>();
    }

    public void exibirMenuGerirCondominios() {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("==== Menu Gerir Condomínios ====");
            System.out.println("1. Adicionar Condomínio");
            System.out.println("2. Remover Condomínio");
            System.out.println("3. Listar Condomínios");
            System.out.println("4. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    adicionarCondominio();
                    break;
                case 2:
                    // Implementar remoção de condomínio
                    removerCondominio();
                    break;
                case 3:
                    listarCondominiosEdificios();
                    break;
                case 4:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 4);
    }

    // Método para remover condomínio e seus edifícios
    public void removerCondominio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do condomínio a ser removido: ");
        String nomeCondominio = scanner.nextLine();

        Iterator<Condominio> iterator = condominios.iterator();
        while (iterator.hasNext()) {
            Condominio condominio = iterator.next();
            if (condominio.getNome().equalsIgnoreCase(nomeCondominio)) {
                iterator.remove();
                System.out.println("Condomínio removido com sucesso.");

                // Remover todos os edifícios associados ao condomínio
                for (Edificio edificio : condominio.getEdificios()) {
                    System.out.println("Removendo edifício: " + edificio.getNome());
                }
                condominio.getEdificios().clear(); // Limpar a lista de edifícios
                return;
            }
        }
        System.out.println("Condomínio não encontrado.");
    }

    // Método para listar condomínios e seus edifícios
    public void listarCondominiosEdificios() {
        if (condominios.isEmpty()) {
            System.out.println("Não há condomínios cadastrados.");
            return;
        }

        System.out.println("=== Lista de Condomínios e Edifícios ===");
        for (Condominio condominio : condominios) {
            System.out.println("Condomínio: " + condominio.getNome());
            System.out.println("Endereço: " + condominio.getEndereco());

            ArrayList<Edificio> edificios = condominio.getEdificios();
            if (edificios.isEmpty()) {
                System.out.println("   - Não há edifícios associados a este condomínio.");
            } else {
                System.out.println("   - Edifícios:");
                for (Edificio edificio : edificios) {
                    System.out.println("      - " + edificio.getNome());
                }
            }
            System.out.println();
        }
    }


    // Método para adicionar condomínio com gestão de edifícios
    public void adicionarCondominio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do condomínio: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço do condomínio: ");
        String endereco = scanner.nextLine();

        Condominio condominio = new Condominio(nome, endereco);

        // Adicionando edifícios ao condomínio
        int numEdificios;
        do {
            System.out.print("Quantos edifícios deseja adicionar ao condomínio? ");
            numEdificios = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            for (int i = 0; i < numEdificios; i++) {
                System.out.print("Nome do edifício " + (i + 1) + ": ");
                String nomeEdificio = scanner.nextLine();
                Edificio edificio = new Edificio(nomeEdificio);
                condominio.adicionarEdificio(edificio);
            }
        } while (numEdificios <= 0);

        condominios.add(condominio);
        System.out.println("Condomínio adicionado com sucesso!");
    }

    public void exibirMenuGerirCondominos() {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("==== Menu Gerir Condóminos ====");
            System.out.println("1. Adicionar Condómino");
            System.out.println("2. Remover Condómino");
            System.out.println("3. Listar Condóminos");
            System.out.println("4. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    adicionarCondomino();
                    break;
                case 2:
                    removerCondomino();
                    break;
                case 3:
                    listarCondominos();
                    break;
                case 4:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 4);
    }

    private void listarCondominos() {
    }

    private void removerCondomino() {
    }

    // Método para adicionar um condômino
    public void adicionarCondomino() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do condomínio para adicionar o condômino: ");
        String nomeCondominio = scanner.nextLine();
        Condominio condominio = encontrarCondominioPorNome(nomeCondominio);

        if (condominio == null) {
            System.out.println("Condomínio não encontrado.");
            return;
        }


        System.out.print("Informe o nome do edifício onde o condômino será adicionado: ");
        String nomeEdificio = scanner.nextLine();
        System.out.print("Informe o nome do condômino: ");
        String nomeCondomino = scanner.nextLine();

        Condomino condomino = new Condomino(nomeCondomino);
        condominio.adicionarCondomino(nomeEdificio, condomino);


    }

    // Método auxiliar para encontrar um condomínio pelo nome
    private Condominio encontrarCondominioPorNome(String nomeCondominio) {
        for (Condominio condominio : condominios) {
            if (condominio.getNome().equalsIgnoreCase(nomeCondominio)) {
                return condominio;
            }
        }
        return null; // Retorna null se o condomínio não for encontrado
    }

    // Método para gerar balancetes mensais/trimestrais
    // Método para gerar balancetes mensais ou trimestrais
    public void gerarBalancetes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Gerar Balancetes ===");
        System.out.print("Informe o ano: ");
        int ano = scanner.nextInt();
        System.out.print("Informe o mês (1 a 12) ou trimestre (1 a 4): ");
        int periodo = scanner.nextInt();

        for (Condominio condominio : condominios) {
            System.out.println("== Balancete do Condomínio " + condominio.getNome() + " ==");

            // Calcular despesas e receitas do condomínio para o período especificado
            double despesas = condominio.calcularDespesas(ano, periodo);
            double receitas = condominio.calcularReceitas(ano, periodo);

            // Exibir o balancete
            System.out.println("Despesas: R$ " + despesas);
            System.out.println("Receitas: R$ " + receitas);
            System.out.println("Saldo: R$ " + (receitas - despesas));
            System.out.println();
        }
    }

    // Método para gerar relatório de contas anual
    public void gerarRelatorioContasAnual() {
        System.out.println("=== Relatório de Contas Anual ===");

        for (Condominio condominio : condominios) {
            System.out.println("== Relatório de Contas para o Condomínio " + condominio.getNome() + " ==");

            // Calcular despesas, receitas e saldo para o ano especificado
            int ano
                    = 0;
            double despesasAno = condominio.calcularDespesasAno(ano);
            double receitasAno = condominio.calcularReceitasAno(ano);
            double saldoAno = receitasAno - despesasAno;

            // Exibir o relatório
            System.out.println("Ano: " + ano);
            System.out.println("Despesas: R$ " + despesasAno);
            System.out.println("Receitas: R$ " + receitasAno);
            System.out.println("Saldo: R$ " + saldoAno);
            System.out.println();
        }
    }

    // Método para gerar relatório de contas anual
    // Método para gerir funcionários
    public void gerirFuncionarios() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Gerenciamento de Funcionários ===");

        // Listar condomínios disponíveis
        listarCondominios();

        // Solicitar o nome do condomínio
        System.out.print("Digite o nome do condomínio para gerenciar funcionários: ");
        String nomeCondominio = scanner.nextLine();

        // Encontrar o condomínio pelo nome
        Condominio condominio = encontrarCondominioPorNome(nomeCondominio);
        if (condominio == null) {
            System.out.println("Condomínio não encontrado.");
            return;
        }

        // Menu para gerenciar funcionários
        int opcao;
        do {
            System.out.println("== Opções de Gerenciamento de Funcionários ==");
            System.out.println("1. Adicionar funcionário");
            System.out.println("2. Remover funcionário");
            System.out.println("3. Listar funcionários");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarFuncionario(condominio);
                    break;
                case 2:
                    removerFuncionario(condominio);
                    break;
                case 3:
                    listarFuncionarios(condominio);
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);
    }

    private void listarCondominios() {
        if (condominios.isEmpty()) {
            System.out.println("Não há condomínios cadastrados.");
            return;
        }
    }

    // Método auxiliar para adicionar funcionário
    private void adicionarFuncionario(Condominio condominio) {
        // Implementação para adicionar funcionário ao condomínio especificado
    }

    // Método auxiliar para remover funcionário
    private void removerFuncionario(Condominio condominio) {
        // Implementação para remover funcionário do condomínio especificado
    }

    // Método auxiliar para listar funcionários
    private void listarFuncionarios(Condominio condominio) {
        System.out.println("== Funcionários do Condomínio " + condominio.getNome() + " ==");
        for (Funcionario funcionario : condominio.getFuncionarios()) {
            System.out.println("- " + funcionario.getNome());
        }
        System.out.println();
    }

    // Método para gerir empresas de serviços
    public void gerirEmpresasServicos() {
        // Implementação para gerir empresas de serviços contratadas pelo condomínio
    }
}