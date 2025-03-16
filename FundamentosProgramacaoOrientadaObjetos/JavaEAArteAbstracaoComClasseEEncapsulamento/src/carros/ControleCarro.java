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

    private void ligarCarro()
    {
        this.setLigado(true);
    }

    private void desligarCarro()
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

    private void acelerarCarro()
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

    private void frearCarro()
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

    private void trocarMarcha()
    {
        if(this.isLigado())
        {
            if (this.getVelocidade() == 0)
            {
                System.out.println("Trocando marcha para ponto morto");
                this.setMarcha("Ponto morto");
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

    private void trocarDirecao()
    {
        if(this.isLigado())
        {
            System.out.println("1 - Para frente");
            System.out.println("2 - Para trás");
            System.out.println("3 - Para a direita");
            System.out.println("4 - Para a esquerda");

            int opcao = Integer.parseInt(System.console().readLine());

            switch (opcao)
            {
                case 1:
                    this.setSenditoCarro("Frente");
                    break;
                case 2:
                    this.setSenditoCarro("Trás");
                    break;
                case 3:
                    if(this.getVelocidade() >= 0 && this.getVelocidade() <= 40)
                    {
                        this.setSenditoCarro("Direita");
                    }
                    else
                    {
                        System.out.println("Velocidade muito alta para virar a direita");
                    }
                    break;
                case 4:
                if(this.getVelocidade() >= 0 && this.getVelocidade() <= 40)
                {
                    this.setSenditoCarro("Esquerda");
                }
                else
                {
                    System.out.println("Velocidade muito alta para virar a direita");
                }
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public void status()
    {
        System.out.println("Ligado: " + this.isLigado());
        System.out.println("Velocidade: " + this.getVelocidade());
        System.out.println("Marcha: " + this.getMarcha());
        System.out.println("Frente: " + this.getSenditoCarro());
        System.out.println("Acelerar: " + this.isAcelerar());
        System.out.println("Frear: " + this.isFrear());
    }

    public void menu()
    {
        System.out.println("1 - Ligar Carro");
        System.out.println("2 - Desligar Carro");
        System.out.println("3 - Acelerar Carro");
        System.out.println("4 - Frear Carro");
        System.out.println("5 - Status");
        System.out.println("6 - Sair");

        int opcao = Integer.parseInt(System.console().readLine());

        switch (opcao)
        {
            case 1:
                this.ligarCarro();
                break;
            case 2:
                this.desligarCarro();
                break;
            case 3:
                this.acelerarCarro();
                break;
            case 4:
                this.frearCarro();
                break;
            case 5:
                this.status();
                break;
            case 6:
                this.trocarDirecao();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
