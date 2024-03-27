import java.util.ArrayList;

/**
 * Classe que representa um apartamento em um edificio.
 */
public class Apartamento {
  private int numero;
  private String proprietario;
  private double area;
  private double quota;
  private ArrayList<Despesa> despesas;
  private ArrayList<Pagamento> pagamentos;

  // Métodos construtores, getters e setters

  public Apartamento(int numero, String proprietario, double area, double quota) {
    this.numero = numero;
    this.proprietario = proprietario;
    this.area = area;
    this.quota = quota;
    this.despesas = new ArrayList<>();
    this.pagamentos = new ArrayList<>();
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getProprietario() {
    return proprietario;
  }

  public void setProprietario(String proprietario) {
    this.proprietario = proprietario;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public double getQuota() {
    return quota;
  }

  public void setQuota(double quota) {
    this.quota = quota;
  }

  public ArrayList<Despesa> getDespesas() {
    return despesas;
  }

  public void setDespesas(ArrayList<Despesa> despesas) {
    this.despesas = despesas;
  }

  public ArrayList<Pagamento> getPagamentos() {
    return pagamentos;
  }

  public void setPagamentos(ArrayList<Pagamento> pagamentos) {
    this.pagamentos = pagamentos;
  }

}
