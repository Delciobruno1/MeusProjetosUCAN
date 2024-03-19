import java.util.Scanner;
import java.time.LocalDate;

/**
 * Esta classe é responsável por solicitar informações da pessoa, criar uma instância da classe FrequenciaCardiaca
 * e imprimir informações sobre a pessoa e sua frequência cardíaca.
 */
public class TesteFreqCardiaca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando informações da pessoa
        System.out.println("Informe o primeiro nome:");
        String nome = scanner.nextLine();
        System.out.println("Informe o sobrenome:");
        String sobrenome = scanner.nextLine();
        System.out.println("Informe o ano de nascimento (AAAA):");
        int ano = scanner.nextInt();
        System.out.println("Informe o mês de nascimento (MM):");
        int mes = scanner.nextInt();
        System.out.println("Informe o dia de nascimento (DD):");
        int dia = scanner.nextInt();

        // Criando um objeto FrequenciaCardiaca com as informações fornecidas
        FrequenciaCardiaca pessoa = new FrequenciaCardiaca(nome, sobrenome, LocalDate.of(ano, mes, dia));

        // Imprimindo informações
        System.out.println("\nInformações:");
        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Data de nascimento: " + pessoa.getDataNascimento());
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        System.out.println("Frequência cardíaca máxima: " + pessoa.calcularFrequenciaCardiacaMaxima() + " bpm");
        System.out.println("Frequência cardíaca alvo: " + pessoa.calcularFrequenciaCardiacaAlvo());

        scanner.close();
    }
}
