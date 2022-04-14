public class Ala {
  int id;
  String especialidade;
  
  Quarto quarto = new Quarto();
  
  Ala(int id, String especialidade){
    id = id;
    especialidade = especialidade;
  }
  public void exibirRelatorio(){
    System.out.println("Relatorio:" + id + "Especialidade: "+ especialidade + "Quartos vazios: "+ quarto.verificarQuartoVazio);
  }
}