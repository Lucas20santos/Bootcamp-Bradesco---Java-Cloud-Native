
import java.util.Scanner;

public class CalcularMedia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calcularMediaDaTurma(alunos, scanner);

        System.out.println(media);
    }

    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;

        for(String aluno: alunos)
        {
            System.out.printf("Nota do aluno %s \n", aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
