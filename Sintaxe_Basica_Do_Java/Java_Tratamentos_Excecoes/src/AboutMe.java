
import java.util.Locale;
import java.util.Scanner;


public class AboutMe
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.err.println("Digite seu nome: ");
        String nome = scanner.next();

        System.err.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.printf("Seu nome e sobrenome: %s %s", nome, sobrenome);
    }
}