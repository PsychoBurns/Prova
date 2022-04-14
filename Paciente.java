import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import javax.swing.text.StyledEditorKit.AlignmentAction;

public class Paciente {
    String nome;
    int diasInternado;
    Ala ala;
    Quarto quarto;

    Medico medico = new Medico();
    Quarto quarto = new Quarto();
    
    Paciente(String nome, int diasInternados, Medico medico, Quarto quarto, Ala novaAla){
        nome = nome;
        diasInternados = diasInternados;
        medico = medico;
        quarto = quarto;
        ala = ala;
    }

    public void exibirRelatorioPac(){
      System.out.println("Nome pacinete: "+nome);
      System.out.println("Medico responsavel: " +medico.nome);
      System.out.println("Dias internados: " +diasInternado);

      return;
    }

    public int retornarDiasInternado(){

        return diasInternado;
    }
}
