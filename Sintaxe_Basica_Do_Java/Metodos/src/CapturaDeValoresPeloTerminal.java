import java.util.Locale;
import java.util.Scanner;

public class CapturaDeValoresPeloTerminal {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá me chamo " + nome + " " + sobrenome +".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é: " + altura);
        
        System.out.println("Digite o seu Peso: ");
        double peso = scanner.nextDouble();
        System.out.println("O valor digitado foi: " + peso);
        
    }
}
