import java.util.ArrayList;

/**
 * Classe que representa um Grupo de equipes.
 */
public class Grupo {
    private ArrayList<Equipe> equipes;

    public Grupo() {
        this.equipes = new ArrayList<>();
    }

    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }

    public void adicionarEquipe(Equipe equipe) {
        this.equipes.add(equipe);
    }
}
