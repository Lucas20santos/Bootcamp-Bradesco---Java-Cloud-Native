package carros;

public class ControleCarro 
{
    boolean frear = false;
    boolean ligado = false;
    boolean acelerar = false;
    int velocidade = 0;
    String senditoCarro = "Frente";
    String marcha = "Ponto morto";

    public ControleCarro()
    {
        this.ligado = false;
        this.marcha = "Ponto morto";
        this.velocidade = 20;
    }

    private boolean isFrear()
    {
        return frear;
    }

    private void setFrear(boolean frear)
    {
        this.frear = frear;
    }

    private boolean isLigado() 
    {
        return ligado;
    }

    private void setLigado(boolean ligado) 
    {
        this.ligado = ligado;
    }

    private boolean isAcelerar() 
    {
        return acelerar;
    }

    private void setAcelerar(boolean acelerar) 
    {
        this.acelerar = acelerar;
    }

    private int getVelocidade() 
    {
        return velocidade;
    }

    private void setVelocidade(int velocidade) 
    {
        this.velocidade = velocidade;
    }

    private String getSenditoCarro() 
    {
        return senditoCarro;
    }

    private void setSenditoCarro(String senditoCarro) 
    {
        this.senditoCarro = senditoCarro;
    }

    private String getMarcha() 
    {
        return marcha;
    }

    private void setMarcha(String marcha)
    {
        this.marcha = marcha;
    }

    public void ligarCarro()
    {
        this.setLigado(true);
    }

    public void desligarCarro()
    {
        if(this.getMarcha() == "Ponto morto" && this.getVelocidade() == 0)
        {
            this.setLigado(false);
        }
        else
        {
            System.out.println("Desligue o carro antes de descer");
        }
    }

    public void acelerarCarro()
    {
        if (this.isLigado() == true)
        {
            this.setAcelerar(true);
            if (this.isAcelerar() == true && this.getVelocidade() < 120)
            {
                this.setVelocidade(this.getVelocidade() + 1);
                this.trocarMarcha();
            }
        }
    }

    public void frearCarro()
    {
        if (this.isLigado() == true)
        {
            this.setFrear(true);
            if (this.isFrear() == true && this.velocidade > 0)
            {
                this.setVelocidade(this.getVelocidade() - 1);
                this.trocarMarcha();
            }
        }
    }

    public void trocarMarcha()
    {
        if(this.isLigado())
        {
            if (this.getVelocidade() == 0)
            {
                System.out.println("Trocando marcha para ponto morto");
                this.setMarcha("Ponto morto");
                this.setSenditoCarro("Ponto morto");
                this.setAcelerar(false);
                this.setFrear(false);
            }
            else if(this.getVelocidade() == 1)
            {
                System.out.println("Trocando marcha para 1");
                this.setMarcha("1");
            }
            else if (this.getVelocidade() == 21)
            {
                System.out.println("Trocando marcha para 2");
                this.setMarcha("2");
            }
            else if (this.getVelocidade() == 41)
            {
                System.out.println("Trocando marcha para 3");
                this.setMarcha("3");
            }
            else if (this.getVelocidade() >= 61)
            {
                System.out.println("Trocando marcha para 4");
                this.setMarcha("4");
            }
            else if (this.getVelocidade() == 81)
            {
                System.out.println("Trocando marcha para 5");
                this.setMarcha("5");
            }
            else if (this.getVelocidade() == 101)
            {
                System.out.println("Trocando marcha para 6");
                this.setMarcha("6");
            }
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
