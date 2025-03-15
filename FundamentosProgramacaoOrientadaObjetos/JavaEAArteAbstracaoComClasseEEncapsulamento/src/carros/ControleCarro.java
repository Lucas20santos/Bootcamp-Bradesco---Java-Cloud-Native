package carros;

public class ControleCarro 
{
    boolean frear = false;
    boolean ligado = false;
    boolean acelerar = false;
    int velocidade = 0;
    String senditoCarro = "Frente";
    int marcha = 0;

    public ControleCarro() 
    {
        this.ligado = false;
        this.senditoCarro = "Ponto morto";
        this.velocidade = 0;
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

    public void setSenditoCarro(String senditoCarro) 
    {
        this.senditoCarro = senditoCarro;
    }

    public int getMarcha() 
    {
        return marcha;
    }

    public void setMarcha(int marcha)
    {
        this.marcha = marcha;
    }

    public void  ligarCarro()
    {
        this.setLigado(true);
    }

    public void desligarCarro()
    {
        this.setLigado(false);
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void acelerarCarro()
    {
        this.setAcelerar(true);

        if (this.isLigado() == true)
        {
            if (this.isAcelerar() == true && this.getVelocidade() < 120)
            {
                this.setVelocidade(this.getVelocidade() + 1);

                if (this.velocidade == 0) this.trocarMarcha();
                if (this.velocidade == 20) this.trocarMarcha();
                if (this.velocidade == 40) this.trocarMarcha();
                if (this.velocidade == 60) this.trocarMarcha();
                if (this.velocidade == 80) this.trocarMarcha();
                if (this.velocidade == 100) this.trocarMarcha();
                if (this.velocidade == 120) this.trocarMarcha();
            }
        }
        else
        {
            this.velocidade = 0;
            this.marcha = 0;
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

    public void trocarMarcha()
    {
        if(this.getVelocidade() == 1)
        {
            System.out.println("Trocando marcha para 1");
            this.marcha = 1;
        }
        else if (this.getVelocidade() == 21)
        {
            System.out.println("Trocando marcha para 2");
            this.marcha = 2;
        }
        else if (this.getVelocidade() == 41)
        {
            System.out.println("Trocando marcha para 3");
            this.marcha = 3;
        }
        else if (this.getVelocidade() >= 61)
        {
            System.out.println("Trocando marcha para 4");
            this.marcha = 4;
        }
        else if (this.getVelocidade() == 81)
        {
            System.out.println("Trocando marcha para 5");
            this.marcha = 5;
        }
        else if (this.getVelocidade() == 101)
        {
            System.out.println("Trocando marcha para 6");
            this.marcha = 6;
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
