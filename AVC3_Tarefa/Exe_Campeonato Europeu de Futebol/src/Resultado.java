import java.util.Date;

/**
 * Classe que representa um Resultado de jogo.
 */
public class Resultado {
    private Date data;
    private Equipe equipeCasa;
    private Equipe equipeVisitante;
    private int placarCasa;
    private int placarVisitante;

    public Resultado(Date data, Equipe equipeCasa, Equipe equipeVisitante, int placarCasa, int placarVisitante) {
        this.data = data;
        this.equipeCasa = equipeCasa;
        this.equipeVisitante = equipeVisitante;
        this.placarCasa = placarCasa;
        this.placarVisitante = placarVisitante;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    public int getPlacarCasa() {
        return placarCasa;
    }

    public void setPlacarCasa(int placarCasa) {
        this.placarCasa = placarCasa;
    }

    public int getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }
}