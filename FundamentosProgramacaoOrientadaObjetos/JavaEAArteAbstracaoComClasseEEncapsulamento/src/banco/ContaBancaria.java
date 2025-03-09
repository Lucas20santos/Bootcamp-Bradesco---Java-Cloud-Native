package banco;

public class ContaBancaria 
{   
    //TODO:criar atributos privados para a classe ContaBancaria.
    private double saldo = 0;
    private boolean usandoChequeEspecial = false;
    private double pagarBoleto = 0;
    private double valorBoleto = 0;
    private double chequeEspecial = 0;
    private int numeroContaBancaria = 0;
    private boolean contaAtiva = false;

    /**
    *   TODO:criar #3 um construtor para a classe ContaBancaria.
    */
    public ContaBancaria()
    {
        this.numeroContaBancaria++;
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

    public void setContaAtiva(boolean contaAtiva) 
    {
        this.contaAtiva = contaAtiva;
    }



    public void setNumeroContaBancaria(int numeroContaBancaria) 
    {
        this.numeroContaBancaria = numeroContaBancaria;
    }
    
    public double getSaldo() 
    {
        return saldo;
    }
    
    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }
 
    public boolean isUsandoChequeEspecial() 
    {
        return usandoChequeEspecial;
    }
    
    public void setUsandoChequeEspecial(boolean usandoChequeEspecial) 
    {
        this.usandoChequeEspecial = usandoChequeEspecial;
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
    
    public void setValorBoleto(double valorBoleto) 
    {
        this.valorBoleto = valorBoleto;
    }
    
    public double getChequeEspecial() 
    {
        return chequeEspecial;
    }
    
    public void setChequeEspecial(double chequeEspecial) 
    {
        this.chequeEspecial = chequeEspecial;
    }
}
