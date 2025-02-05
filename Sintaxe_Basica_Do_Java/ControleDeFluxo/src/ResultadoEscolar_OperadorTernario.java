public class ResultadoEscolar_OperadorTernario {
    public static void main(String[] args) {
        System.out.println("Estrutura de Controle Composta");

        double nota = 6.0;

        String resultado = nota >= 7 ? "Aprovado": (nota >= 5) && (nota < 7) ? "Recuperação": "Reprovado";

        System.out.println(resultado);
    }
}
