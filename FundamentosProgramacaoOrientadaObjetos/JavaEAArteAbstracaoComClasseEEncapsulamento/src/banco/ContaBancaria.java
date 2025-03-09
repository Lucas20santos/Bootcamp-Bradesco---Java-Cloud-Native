package banco;

public class ContaBancaria 
{   
    private static int contador = 1;

    private double saldo = 0;
    private boolean usandoChequeEspecial = false;
    private double pagarBoleto = 0;
    private double valorBoleto = 0;
    private double chequeEspecial = 0;
    private int numeroContaBancaria = 0;
    private boolean contaAtiva = false;

    public ContaBancaria()
    {
        this.numeroContaBancaria = contador++;
        this.contaAtiva = true;
    }
    
    public int getNumeroContaBancaria()
    {
        return numeroContaBancaria;
    }

    public boolean isContaAtiva() 
    {
        return contaAtiva;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public boolean isUsandoChequeEspecial() 
    {
        return usandoChequeEspecial;
    }
    
    public double getPagarBoleto() 
    {
        return pagarBoleto;
    }
    
    public void setPagarBoleto(double pagarBoleto) 
    {
        this.pagarBoleto = pagarBoleto;
    }
    
    public double getValorBoleto() 
    {
        return valorBoleto;
    }

    public double getChequeEspecial() 
    {
        return chequeEspecial;
    }
}
