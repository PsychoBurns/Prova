public class Quarto {
    int numero;
    
    Paciente paciente01 = new Paciente("Mateus", 10, "Pedro", 1);
    Paciente paciente02 = new Paciente("Camila", 15, "Pedro", 2);
    Paciente paciente03 = new Paciente("Gustavo", 20, "Pedro", 1);

    public int retornarMaxDiasInternado() {
        if((paciente01.diasInternado > paciente02.diasInternado) || paciente01.diasInternado > paciente03.diasInternado)){
            return paciente01.diasInternado
        }else if ((paciente02.diasInternado > paciente01.diasInternado) || paciente02.diasInternado > paciente03.diasInternado)){
            return paciente02.diasInternado
        }else if((paciente02.diasInternado > paciente01.diasInternado) || paciente02.diasInternado > paciente03.diasInternado)){
            return paciente03.diasInternado
        }
    }

    public int retornarMinDiasInternado() {
        if((paciente01.diasInternado < paciente02.diasInternado) || paciente01.diasInternado < paciente03.diasInternado)){
            return paciente01.diasInternado
        }else if ((paciente02.diasInternado < paciente01.diasInternado) || paciente02.diasInternado < paciente03.diasInternado)){
            return paciente02.diasInternado
        }else if((paciente02.diasInternado < paciente01.diasInternado) || paciente02.diasInternado < paciente03.diasInternado)){
            return paciente03.diasInternado
        }
    }

    public int diasPorPaciente(int dias) {
        
        return dias;
    }

    public void verificarQuartoVazio() {
        if(numero <= 0){
            return String = "Sim";
        }else
            return String = "Nao"
    }
}
