/**
     * O método main é o ponto de entrada para o programa.
     * Ele cria instâncias de filmes, exibe informações sobre eles e instância mais filmes para testar.
     * 
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
public class TestarFilme {
    public static void main(String[] args) {
        // Criando um objeto filme1 do tipo Filme
        Filme filme1 = new Filme("Os Vingadores", 142);

        // Alterando os atributos do filme1
        filme1.setTitulo("Os Vingadores");
        filme1.setDuracaoEmMinutos(142);

        // Chamando o método exibirDuracaoEmHoras() para mostrar quantas horas o filme1 possui
        filme1.exibirDuracaoEmHoras();

        // Criando um objeto filme2 do tipo Filme
        Filme filme2 = new Filme("Hotel Transilvânia", 93);

        // Alterando os atributos do filme2
        filme2.setTitulo("Hotel Transilvânia");
        filme2.setDuracaoEmMinutos(93);

        // Chamando o método exibirDuracaoEmHoras() para mostrar quantas horas o filme2 possui
        filme2.exibirDuracaoEmHoras();

        // Exibindo a mensagem com os títulos dos filmes em cartaz
        System.out.println("Os filmes em cartaz são " + filme1.getTitulo() + " e " + filme2.getTitulo());

        // Instanciando mais 5 filmes e realizando as mesmas ações
        Filme filme3 = new Filme("Matrix", 136);
        filme3.exibirDuracaoEmHoras();

        Filme filme4 = new Filme("Jurassic Park", 127);
        filme4.exibirDuracaoEmHoras();

        Filme filme5 = new Filme("Senhor dos Anéis", 178);
        filme5.exibirDuracaoEmHoras();

        Filme filme6 = new Filme("Harry Potter", 152);
        filme6.exibirDuracaoEmHoras();

        Filme filme7 = new Filme("Toy Story", 81);
        filme7.exibirDuracaoEmHoras();
    }
 }


