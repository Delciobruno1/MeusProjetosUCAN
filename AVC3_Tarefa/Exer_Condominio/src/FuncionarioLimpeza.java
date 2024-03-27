
/**
 * Classe para os funcionários de limpeza da empresa de gestão de condomínios.
 */
public class FuncionarioLimpeza implements Funcionario {
   private String nome;
   private String areaLimpeza;

   // Métodos construtores, getters e setters

   public FuncionarioLimpeza(String nome, String areaLimpeza) {
      this.nome = nome;
      this.areaLimpeza = areaLimpeza;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getAreaLimpeza() {
      return areaLimpeza;
   }

   public void setAreaLimpeza(String areaLimpeza) {
      this.areaLimpeza = areaLimpeza;
   }

   @Override
   public void realizarTarefa() {
      // Implementação da tarefa de limpeza
   }
}

