package carros;

public class ControleCarro {
    boolean ligado = false;
    boolean acelerar = false;
    boolean frear = false;

    public boolean isFrear()
    {
        return frear;
    }
    public void setFrear(boolean frear) 
    {
        this.frear = frear;
    }

    int velocidade = 0;
    String senditoCarro = "Frente";
    String marcha = "Neutro";

    public ControleCarro() 
    {
        this.ligado = false;
        this.senditoCarro = "Ponto morto";
        this.velocidade = 0;
    }
    public boolean isLigado() 
    {
        return ligado;
    }
    public void setLigado(boolean ligado) 
    {
        this.ligado = ligado;
    }
    public boolean isAcelerar() 
    {
        return acelerar;
    }
    public void setAcelerar(boolean acelerar) 
    {
        this.acelerar = acelerar;
    }
    public int getVelocidade() 
    {
        return velocidade;
    }
    public void setVelocidade(int velocidade) 
    {
        this.velocidade = velocidade;
    }
    public String getSenditoCarro() 
    {
        return senditoCarro;
    }
    public void setSenditoCarro(String senditoCarro) 
    {
        this.senditoCarro = senditoCarro;
    }
    public String getMarcha() 
    {
        return marcha;
    }
    public void setMarcha(String marcha) 
    {
        this.marcha = marcha;
    }

    public void acelerarCarro()
    {
        this.setAcelerar(true);

        if (this.isLigado() == true)
        {
            if (this.isAcelerar() == true && this.velocidade < 120)
            {
                this.velocidade = this.velocidade + 1;
            }
        }
        else
        {
            this.velocidade = 0;
        }
    }

    public void frearCarro()
    {
        this.setFrear(true);

        if (this.isLigado() == true)
        {
            if (this.isFrear() == true && this.velocidade > 0)
            {
                this.velocidade = this.velocidade - 1;
            }
        }
        else
        {
            this.velocidade = 0;
        }
    }

    public void status()
    {
        System.out.println("Ligado: " + this.isLigado());
        System.out.println("Velocidade: " + this.getVelocidade());
        System.out.println("Marcha: " + this.getMarcha());
        System.out.println("Sentido: " + this.getSenditoCarro());
        System.out.println("Acelerar: " + this.isAcelerar());
        System.out.println("Frear: " + this.isFrear());
    }
}
