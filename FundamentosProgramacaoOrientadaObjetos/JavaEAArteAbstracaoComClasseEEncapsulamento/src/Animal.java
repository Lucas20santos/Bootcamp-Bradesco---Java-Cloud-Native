import petshop.Banho;

public class Animal 
{
    public static void main(String[] args) 
    {
        while(true)
        {
            Banho banho = new Banho();
            System.out.println("Deseja ir para o menu interativo[s/n]: ");
            String opcao = System.console().readLine().toLowerCase();
            if(opcao.equals("s"))
            {
                banho.menuPetShop();
            }
            else
            {
                break;
            }
        }        
    }
}
