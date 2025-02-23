import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SistemaCandidaturaAprimorado
{
    public static void main(String[] args) 
    {
        String [] candidatos = {"Lucas", "Marcos", "João", "Ana", "Maria"};
        for(String candidato: candidatos)
        {
            entrarEmContato(candidato);
        }
    }
    static void entrarEmContato(String candidato)
    {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do
        {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            {
                tentativasRealizadas++;
            }
            else
            {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        }
        while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
        {
            System.out.println("CONSEGUIMOS CONTA COM " + candidato);
        }

    }
    static boolean atender()
    {
        return new Random().nextInt(3) == 1;
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
    static void imprimirSelecionados() 
    {
        String [] candidatos = {"Lucas", "Marcos", "João", "Ana", "Maria"};
        System.out.println("Imprimindo lista de candidados selecionados");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de indice: "+ i+1 + " é o " + candidatos[i]);
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