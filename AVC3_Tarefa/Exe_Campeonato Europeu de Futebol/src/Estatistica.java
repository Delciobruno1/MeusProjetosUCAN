/**
 * Classe que representa uma Estatística de jogo.
 */
public class Estatistica {
    private Equipe equipe;
    private int remates;
    private int livres;
    private int forasDeJogo;

    public Estatistica(Equipe equipe, int remates, int livres, int forasDeJogo) {
        this.equipe = equipe;
        this.remates = remates;
        this.livres = livres;
        this.forasDeJogo = forasDeJogo;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public int getRemates() {
        return remates;
    }

    public void setRemates(int remates) {
        this.remates = remates;
    }

    public int getLivres() {
        return livres;
    }

    public void setLivres(int livres) {
        this.livres = livres;
    }

    public int getForasDeJogo() {
        return forasDeJogo;
    }

    public void setForasDeJogo(int forasDeJogo) {
        this.forasDeJogo = forasDeJogo;
    }
}