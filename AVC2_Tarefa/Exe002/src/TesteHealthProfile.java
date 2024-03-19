import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class TesteHealthProfile {
    public static void main(String[] args){

        // Objeto Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicitando informações da pessoa
        System.out.println("Informe o primeiro nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Informe o genero (M/F):");
        String genero = scanner.nextLine();
        System.out.println("Informe o ano de nascimento (AAAA):");
        int ano = scanner.nextInt();
        System.out.println("Informe o mês de nascimento (MM):");
        int mes = scanner.nextInt();
        System.out.println("Informe o dia de nascimento (DD):");
        int dia = scanner.nextInt();
        System.out.println("Informe a altura (em metros):");
        double altura = scanner.nextDouble();
        System.out.println("Informe o peso (em quilogramas):");
        double peso = scanner.nextDouble();

        // Criando um objeto HealthProfile com as informações fornecidas
        HealthProfile pessoa = new HealthProfile(nome, sobrenome, genero, LocalDate.of(ano, mes, dia), altura, peso);

        // Imprimindo informações
        System.out.println("\nInformações:");
        System.out.println("Nome: "+ pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Genero: " + pessoa.getGenero());
        System.out.println("Data de nascimento: " + pessoa.getDataNascimento());
        System.out.println("Altura: " + pessoa.getAltura() + " metros");
        System.out.println("Peso: " + pessoa.getPeso() + " quilogramas");
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        System.out.println("IMC: " + pessoa.calcularIMC());
        System.out.println("Frequencia cardiaca maxima: " + pessoa.calcularFrequenciaCardiacaMaxima());
        System.out.println("Frequencia cardiaca alvo: " + pessoa.calcularFrequenciaCardiacaAlvo());

        scanner.close();
    }
}