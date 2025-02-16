import java.util.concurrent.ThreadLocalRandom;

public class SistemaCandidaturaAprimorado
{
    public static void main(String[] args) 
    {
        final double SALARIOBASE = 2000;
        String [] candidatos = {"Lucas", "Marcos", "João", "Ana", "Maria", "Luiz", "Andre", "Marcone", "Fernando", "Monica", "Joana", "Luiza", "Mario"};

        analisarCandidatura(SALARIOBASE, candidatos);

    }

    public static void analisarCandidatura(double SALARIOBASE, String [] candidatos)
    {
        
        for(String candidato: candidatos)
        {
            try
            {
                System.out.println("Candidato " + candidato + ", informe o salario pretendido: ");
                double salarioPretendido = salarioPretendidoCandidatos();

                if(salarioPretendido < SALARIOBASE) System.err.println("LIGAR PARA O CANDIDATO");
                else if (salarioPretendido == SALARIOBASE) System.err.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
                else System.err.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
                
            }
            catch(Exception err)
            {
                System.err.println("erro: " + err.getMessage());
            }
        }
    }
    private static double salarioPretendidoCandidatos() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}