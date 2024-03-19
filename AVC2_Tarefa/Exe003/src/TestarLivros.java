/**
 * A classe TestarLivros é responsável por testar a funcionalidade da classe Livro,
 * demonstrando a criação de objetos Livro, modificação de atributos e verificação do progresso da leitura.
 */
public class TestarLivros {
    /**
     * O método principal da classe TestarLivros, que inicia a execução do programa.
     *
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Criando um objeto livrofavorito do tipo Livro
        Livro livrofavorito = new Livro("O Pequeno Príncipe", 98);

        // Alterando os atributos do livrofavorito
        livrofavorito.setTitulo("O Pequeno Príncipe");
        livrofavorito.setQtdPaginas(98);

        // Imprimindo informações sobre o livrofavorito
        System.out.println("O livro " + livrofavorito.getTitulo() + " possui " + livrofavorito.getQtdPaginas() + " páginas");

        // Alterando a quantidade de páginas lidas e verificando o progresso
        livrofavorito.setPaginasLidas(20);
        livrofavorito.verificarProgresso();

        // Alterando novamente a quantidade de páginas lidas e verificando o progresso
        livrofavorito.setPaginasLidas(50);
        livrofavorito.verificarProgresso();

        // Instanciando outros 10 livros e chamando os métodos desenvolvidos
        for (int i = 1; i <= 10; i++) {
            Livro livro = new Livro("Livro " + i, i * 20);
            System.out.println("O livro " + livro.getTitulo() + " possui " + livro.getQtdPaginas() + " páginas");
            livro.setPaginasLidas(i * 10);
            livro.verificarProgresso();
        }
    }
}

