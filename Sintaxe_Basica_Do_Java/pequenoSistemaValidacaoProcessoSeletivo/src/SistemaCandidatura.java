import java.util.Scanner;

public class SistemaCandidatura
{
    public static void main(String[] args) {
        final double SALARIOBASE = 2000;

        try (Scanner scanner = new Scanner(System.in)) 
        {        
            System.out.println("Qual é o salario pretendido: ");
            double salarioPretendido = scanner.nextDouble();
            String analiseFeita = analisarCandidatura(SALARIOBASE, salarioPretendido);
            System.out.printf("Analise do candidato: %s", analiseFeita);
        }
        catch(Exception err)
        {
            System.err.println("Erro: " + err.getMessage());
        }
        finally
        {
            System.out.println("Final do programa.");
        }

    }

    public static String analisarCandidatura(double SALARIOBASE, double salarioPretendido)
    {
        if(salarioPretendido < SALARIOBASE) return "LIGAR PARA O CANDIDATO";
        else if (salarioPretendido == SALARIOBASE) return "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.";
        else return "AGUARDANDO RESULTADO DEMAIS CANDIDATOS";
    }
}