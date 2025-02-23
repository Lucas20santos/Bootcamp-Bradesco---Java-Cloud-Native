import java.util.concurrent.ThreadLocalRandom;

public class SistemaCandidaturaAprimorado
{
    public static void main(String[] args) 
    {

    }
    public static void selecaoCandidatos()
    {
        String [] candidatos = {"Lucas", "Marcos", "João", "Ana", "Maria", "Luiz", "Andre", "Marcone", "Fernando", "Monica", "Joana", "Luiza", "Mario"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5)
        {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = salarioPretendidoCandidatos();

            System.out.println("Candidato: " + candidato + " Salario Pretendido: " + salarioPretendido);
            if(salarioBase > salarioPretendido && candidatoAtual < candidatos.length)
            {
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    public static void analisar(double salarioPretendido)
    {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido)
        {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(salarioBase == salarioPretendido)
        {
            System.out.println("LIGAR PARA O CANDIDATO COM OUTRA PROPOSTA");
        }
        else
        {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
    public static double salarioPretendidoCandidatos() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}