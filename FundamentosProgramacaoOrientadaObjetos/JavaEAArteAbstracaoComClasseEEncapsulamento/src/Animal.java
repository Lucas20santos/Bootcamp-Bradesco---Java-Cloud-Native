import petshop.Banho;

public class Animal 
{
    public static void main(String[] args) 
    {
        Banho banho = new Banho();
        while(true)
        {

            String verificarStatus = System.console()
            .readLine("Deseja verificar o status do petshop[s/n]: ").toLowerCase();

            if(verificarStatus.equals("s"))
            {
                banho.statusPetShop();
            }
            else
            {
                System.out.println("O status do petshop não foi verificado.");
            }
            
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
