package petshop;

public class Banho 
{
    private double volumeAgua = 0;
    private double volumeShampoo = 0;
    private double nivelAgua = 30;
    private double nivelShampoo = 10;
    private boolean banho = false;
    private boolean petNaMaquina = false;
    private boolean petForaMaquina = true;
    private boolean limparMaquina = false;

    public Banho()
    {
        System.out.println("Bem vindo ao PetShop");
    }

    private double getvolumeAgua()
    {
        return volumeAgua;
    }

    private void setvolumeAgua(double volumeAgua)
    {
        this.volumeAgua = volumeAgua;
    }

    private double getvolumeShampoo()
    {
        return volumeShampoo;
    }

    private void setvolumeShampoo(double volumeShampoo)
    {
        this.volumeShampoo = volumeShampoo;
    }

    private boolean isBanho()
    {
        return banho;
    }

    private void setBanho(boolean banho)
    {
        this.banho = banho;
    }

    private boolean isPetNaMaquina()
    {
        return petNaMaquina;
    }

    private void setPetNaMaquina(boolean petNaMaquina)
    {
        this.petNaMaquina = petNaMaquina;
    }

    private boolean isPetForaMaquina()
    {
        return petForaMaquina;
    }

    private void setPetForaMaquina(boolean petForaMaquina)
    {
        this.petForaMaquina = petForaMaquina;
    }

    private boolean isLimparMaquina()
    {
        return limparMaquina;
    }

    private void setLimparMaquina(boolean limparMaquina)
    {
        this.limparMaquina = limparMaquina;
    }

    private void colocarNaMaquinaBanho()
    {
        if(this.isPetNaMaquina())
        {
            System.out.println("Pet já está na máquina");
        }
        else
        {
            this.setPetNaMaquina(true);
            this.setPetForaMaquina(false);
            System.out.println("Pet colocado na máquina");

            if(this.nivelAgua >= 15 && this.nivelShampoo >= 5)
            {
                System.out.println("Banho liberado");
                this.setBanho(true);
            }
            else
            {
                System.out.println("Banho não liberado");
                this.setBanho(false);
                this.setvolumeAgua(30 - this.volumeAgua);
                this.setvolumeShampoo(10 - this.volumeShampoo);
            }
        }
    }

    private void retirarPetDaMaquina()
    {
        if(this.isPetForaMaquina())
        {
            System.out.println("Pet já está fora da máquina");
        }
        else
        {
            this.setPetForaMaquina(true);
            this.setPetNaMaquina(false);
            System.out.println("Pet retirado da máquina");
        }
    }

    private void limparMaquina()
    {
        if(this.isLimparMaquina())
        {
            System.out.println("Máquina já está limpa");
        }
        else
        {
            this.setLimparMaquina(true);
            System.out.println("Máquina limpa");
        }
    }

    public void statusPetShop()
    {
        System.out.println("Abastecimento Reservatório Água: " + this.getvolumeAgua());
        System.out.println("Abastecimento Reservatório Shampoo: " + this.getvolumeShampoo());
        System.out.println("Nível Água: " + this.nivelAgua);
        System.out.println("Nível Shampoo: " + this.nivelShampoo);
        System.out.println("Banho: " + this.isBanho());
        System.out.println("Pet na Máquina: " + this.isPetNaMaquina());
        System.out.println("Pet fora da Máquina: " + this.isPetForaMaquina());
        System.out.println("Limpar Máquina: " + this.isLimparMaquina());
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
                this.colocarNaMaquinaBanho();
                break;
            case 8:
                System.out.println("Retirar Pet da Máquina");
                this.retirarPetDaMaquina();
                break;
            case 9:
                System.out.println("Limpar Máquina");
                this.limparMaquina();
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