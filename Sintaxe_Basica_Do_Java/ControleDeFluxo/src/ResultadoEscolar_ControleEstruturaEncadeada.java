public class ResultadoEscolar_ControleEstruturaEncadeada {
    public static void main(String[] args) {
        System.out.println("Estrutura de Controle Composta");

        double nota = 6.0;

        if (nota >= 7)
        {
            System.out.println("Aprovado");
        }
        else if((nota >= 5) && (nota < 7))
        {
            System.out.println("Recuperação");
        }
        else
        {
            System.out.println("Reprovado");
        }
    }
}
