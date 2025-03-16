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
}