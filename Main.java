class Main {
   public static void main(String[] args) throws Exception 

        Ala ala01 = new Ala(01, "Cardiologia");
        Ala ala02 = new Ala(02, "Pediatria");
        Quarto quarto01 = new Quarto();
        Quarto quarto02 = new Quarto();
        Paciente paciente01 = new Paciente("Mateus", 10, "Pedro", 1, ala01);
        Paciente paciente02 = new Paciente("Camila", 15, "Pedro", 2, ala02);
        Paciente paciente03 = new Paciente("Gustavo", 20, "Pedro", 3, ala01);
        Paciente paciente04 = new Paciente("Fernanda", 18, "Pedro", 1, ala01);

        System.out.println(paciente01.exibirRelatorioPac);
        System.out.println(paciente02.exibirRelatorioPac);
        System.out.println("Paciente "+ paciente03.nome + "ficou internado" +paciente03.retornarDiasInternado+" dias");

        System.out.println("Paciente com maior tempo de internação: "+ quarto01.retornarMaxDiasInternado);
        System.out.println("Paciente com maior tempo de internação: "+ quarto01.retornarMinDiasInternado);

        System.out.println("Relatorio das Alas");
        System.out.println(ala01.exibirRelatorio);
        System.out.println(ala02.exibirRelatorio);
    }
}