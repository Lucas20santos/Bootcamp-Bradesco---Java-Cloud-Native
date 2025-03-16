import carros.ControleCarro;

public class Carro 
{
    public static void main(String[] args) 
    {
        while(true)
        {
            ControleCarro c1 = new ControleCarro();
            System.out.println("Entrar no Menu? (s/n)");
            String opcao = System.console().readLine();
            if (opcao.equals("s"))
            {
                c1.menu();
                c1.status();
            }
            else
            {
                break;
            }
        }
    }
}
