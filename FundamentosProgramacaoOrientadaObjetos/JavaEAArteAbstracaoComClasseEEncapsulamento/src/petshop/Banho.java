package petshop;

public class Banho 
{
    private boolean banhoPet = false;
    private double abastecimentoResevatorioAgua = 0;
    private double abastecimentoResevatorioShampoo = 0;
    private double nivelAgua = 0;
    private double nivelShampoo = 0;
    private boolean banho = false;
    private boolean petNaMaquina = false;
    private boolean petForaMaquina = false;
    private boolean limparMaquina = false;

    public Banho()
    {
        this.banhoPet = false;
        this.abastecimentoResevatorioAgua = 0;
        this.abastecimentoResevatorioShampoo = 0;
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.banho = false;
        this.petNaMaquina = false;
        this.petForaMaquina = false;
        this.limparMaquina = false;
    }

    public boolean isBanhoPet()
    {
        return banhoPet;
    }

    public void setBanhoPet(boolean banhoPet)
    {
        this.banhoPet = banhoPet;
    }

    public double getAbastecimentoResevatorioAgua()
    {
        return abastecimentoResevatorioAgua;
    }

    public void setAbastecimentoResevatorioAgua(double abastecimentoResevatorioAgua)
    {
        this.abastecimentoResevatorioAgua = abastecimentoResevatorioAgua;
    }

    public double getAbastecimentoResevatorioShampoo()
    {
        return abastecimentoResevatorioShampoo;
    }

    public void setAbastecimentoResevatorioShampoo(double abastecimentoResevatorioShampoo)
    {
        this.abastecimentoResevatorioShampoo = abastecimentoResevatorioShampoo;
    }

    public double getNivelAgua()
    {
        return nivelAgua;
    }

    public void setNivelAgua(double nivelAgua)
    {
        this.nivelAgua = nivelAgua;
    }

    public double getNivelShampoo()
    {
        return nivelShampoo;
    }

    public void setNivelShampoo(double nivelShampoo)
    {
        this.nivelShampoo = nivelShampoo;
    }

    public boolean isBanho()
    {
        return banho;
    }

    public void setBanho(boolean banho)
    {
        this.banho = banho;
    }

    public boolean isPetNaMaquina()
    {
        return petNaMaquina;
    }

    public void setPetNaMaquina(boolean petNaMaquina)
    {
        this.petNaMaquina = petNaMaquina;
    }

    public boolean isPetForaMaquina()
    {
        return petForaMaquina;
    }

    public void setPetForaMaquina(boolean petForaMaquina)
    {
        this.petForaMaquina = petForaMaquina;
    }

    public boolean isLimparMaquina()
    {
        return limparMaquina;
    }

    public void setLimparMaquina(boolean limparMaquina)
    {
        this.limparMaquina = limparMaquina;
    }

    public void menuPetShop()
    {
        System.out.println("1 - Banho");
        System.out.println("2 - Abasteacer com Água");
        System.out.println("3 - Abastecer com Shampoo");
        System.out.println("4 - Verificar nível de Água");
        System.out.println("5 - Verificar nível de Shampoo");
        System.out.println("6 - Verificar se tem Pet na Máquina");
        System.out.println("7 - Colocar Pet na Máquina");
        System.out.println("8 - Retirar Pet da Máquina");
        System.out.println("9 - Limpar Máquina");
        System.out.println("10 - Sair");

        System.out.print("Digite a opção desejada: ");
        int opcao = Integer.parseInt(System.console().readLine());
        switch (opcao)
        {
            case 1:
                System.out.println("Banho");
                break;
            case 2:
                System.out.println("Abastecer com Água");
                break;
            case 3:
                System.out.println("Abastecer com Shampoo");
                break;
            case 4:
                System.out.println("Verificar nível de Água");
                break;
            case 5:
                System.out.println("Verificar nível de Shampoo");
                break;
            case 6:
                System.out.println("Verificar se tem Pet na Máquina");
                break;
            case 7:
                System.out.println("Colocar Pet na Máquina");
                break;
            case 8:
                System.out.println("Retirar Pet da Máquina");
                break;
            case 9:
                System.out.println("Limpar Máquina");
                break;
            case 10:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}