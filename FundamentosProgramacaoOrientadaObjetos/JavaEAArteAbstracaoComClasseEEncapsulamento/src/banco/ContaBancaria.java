package banco;

public class ContaBancaria 
{   
    private static int contador = 1;

    private double saldo = 0;
    private double depositar = 0;
    private boolean usandoChequeEspecial = false;
    private double pagarBoleto = 0;
    private double valorBoleto = 0;
    private double chequeEspecial = 0;
    private int numeroContaBancaria = 0;
    private boolean contaAtiva = false;

    public ContaBancaria(double valorDeposito)
    {
        this.numeroContaBancaria = contador++;
        this.contaAtiva = true;
        this.setDepositar(valorDeposito);
        if (valorDeposito < 500)
        {
            this.chequeEspecial = 50 + this.saldo;
        }
        else
        {
            this.chequeEspecial = 0.5 * valorDeposito + this.saldo;
        }
        this.saldo = this.getChequeEspecial();
    }

    private double getDepositar()
    {
        return this.depositar;
    }

    private void setDepositar(double depositar)
    {
        this.saldo +=  depositar;
    }

    private double getSaldo()
    {
        return this.saldo;
    }

    private void setSaldo(double valor)
    {
        this.saldo -= valor;
    }

    private double getPagarBoleto() 
    {
        return this.pagarBoleto;
    }
    
    private void setPagarBoleto(double pagarBoleto) 
    {
        this.pagarBoleto = pagarBoleto;
    }

    public int getNumeroContaBancaria()
    {
        return this.numeroContaBancaria;
    }

    public boolean isContaAtiva() 
    {
        return this.contaAtiva;
    }

    public boolean isUsandoChequeEspecial() 
    {
        return this.usandoChequeEspecial;
    }

    public void setUsandoChequeEspecial(boolean usandoChequeEspecial) 
    {
        this.usandoChequeEspecial = usandoChequeEspecial;
    }

    public double getValorBoleto() 
    {
        return this.valorBoleto;
    }

    public double getChequeEspecial() 
    {
        return this.chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) 
    {
        this.chequeEspecial = chequeEspecial;
    }

    // Métodos para realizar operações bancárias...
    public String depositar(double valor)
    {   this.depositar = valor;
        
        if(valor >= 0)
        {
            this.setDepositar(valor);
            return "Depósito de R$" + this.getDepositar() + " realizado com sucesso!";
        }
        else
        {
            return "Valor inválido!";
        }
    }

    public String sacar(double valor)
    {
        if(this.getSaldo() >= valor)
        {
            this.setSaldo(valor);
            return "Saque de R$" + valor + " realizado com sucesso!";
        }
        else
        {
            System.out.println("Deseja usar o cheque especial? (s/n)");
            String resposta = System.console().readLine().toLowerCase();

            if(resposta == "s")
            {
                this.isUsandoChequeEspecial();
                
                return "Cheque especial de R$" + this.getChequeEspecial() + " utilizado com sucesso!";
            }
            return "Saldo insuficiente! Seu saldo é de R$" + this.getSaldo();

        }
    }

    public void pagarBoleto()
    {
        System.out.println("O valor do boleto é de R$" + this.getPagarBoleto());
        System.out.println("O seu saldo é: " + this.getSaldo());

        if(this.getSaldo() >= this.getPagarBoleto())
        {
            this.setSaldo(this.getPagarBoleto());
            System.out.println("Boleto pago com sucesso!");
        }
        else
        {
            System.out.println("Saldo insuficiente! Favor realizar um depósito ou use o cheque especial");
        }
    }

    public String usarChequeEspecial()
    {
        this.setUsandoChequeEspecial(true);
        if(this.getChequeEspecial() >= this.getValorBoleto())
        {
            this.setChequeEspecial(this.getValorBoleto());
            return "Cheque especial de R$" + this.getChequeEspecial() + " utilizado com sucesso!";
        }
        else
        {
            return "Cheque especial insuficiente! Seu cheque especial é de R$" + this.getChequeEspecial();
        }
    }

    public void menu(int opcao)
    {
        if(opcao == 1)
        {
            System.out.println("Digite o valor do depósito:");
            double valor = Double.parseDouble(System.console().readLine());
            System.out.println(this.depositar(valor));
        }
        else if(opcao == 2)
        {
            System.out.println("Digite o valor do saque:");
            double valor = Double.parseDouble(System.console().readLine());
            System.out.println(sacar(valor));
        }
        else if(opcao == 3)
        {
            System.out.println("Digite o valor do boleto:");
            valorBoleto = Double.parseDouble(System.console().readLine());
            this.setPagarBoleto(valorBoleto);
            this.pagarBoleto();
        }
        else if(opcao == 4)
        {
            System.out.println("Digite o valor do cheque especial:");
            chequeEspecial = Double.parseDouble(System.console().readLine());
            System.out.println(usarChequeEspecial());
        }
        else if(opcao == 5)
        {
            System.out.println("Saldo: R$" + getSaldo());
            System.out.println("Cheque especial: R$" + getChequeEspecial());
        }
        else if(opcao == 6)
        {
            System.out.println("Conta bancária encerrada com sucesso!");
            contaAtiva = false;
        }
    }
}
