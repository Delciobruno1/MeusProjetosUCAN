import java.util.ArrayList;

/**
 * Classe que representa um Jogo.
 */
public class Jogo {
    private Equipe equipeCasa;
    private Equipe equipeVisitante;
    private ArrayList<Gol> gols;
    private ArrayList<Cartao> cartoes;
    private ArrayList<Substituicao> substituicoes;

    public Jogo(Equipe equipeCasa, Equipe equipeVisitante) {
        this.equipeCasa = equipeCasa;
        this.equipeVisitante = equipeVisitante;
        this.gols = new ArrayList<>();
        this.cartoes = new ArrayList<>();
        this.substituicoes = new ArrayList<>();
    }

    public Equipe getEquipeCasa() {
        return equipeCasa;
    }

    public void setEquipeCasa(Equipe equipeCasa) {
        this.equipeCasa = equipeCasa;
    }

    public Equipe getEquipeVisitante() {
        return equipeVisitante;
    }

    public void setEquipeVisitante(Equipe equipeVisitante) {
        this.equipeVisitante = equipeVisitante;
    }

    public ArrayList<Gol> getGols() {
        return gols;
    }

    public void setGols(ArrayList<Gol> gols) {
        this.gols = gols;
    }

    public ArrayList<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(ArrayList<Cartao> cartoes) {
        this.cartoes = cartoes;
    }

    public ArrayList<Substituicao> getSubstituicoes() {
        return substituicoes;
    }

    public void setSubstituicoes(ArrayList<Substituicao> substituicoes) {
        this.substituicoes = substituicoes;
    }
}
