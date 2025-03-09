package banco;

public class ContaBancaria 
{   
    private static int contador = 1;

    // TODO: #2criar atributos privados para a classe ContaBancaria.
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
        this.numeroContaBancaria = contador++;
        this.contaAtiva = true;
    }
    
    // TODO: #4 #4criar métodos getters e setters para a classe ContaBancaria.
    public int getNumeroContaBancaria()
    {
        return numeroContaBancaria;
    }

    //TODO: #5 #5criar métodos getters e setters para a classe ContaBancaria.
    public boolean isContaAtiva() 
    {
        return contaAtiva;
    }
    
    // TODO: #6 #6criar métodos getters e setters para a classe ContaBancaria.
    public double getSaldo() 
    {
        return saldo;
    }
 
    // TODO: #7 #7criar métodos getters e setters para a classe ContaBancaria.
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
