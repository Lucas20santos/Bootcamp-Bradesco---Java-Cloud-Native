/**
 * <h1>Conta Terminal</h1>
 * A conta terminal receberá dados via terminal
 * <p>
 * <b> Note:</b> Leia atentamente a documetançaõ desta classes para desfrutar dos recurso oferecidos 
 * pelo autor
 * 
 * @author Lucas de Souza Santos
 * @version 1.0
 * @since 04/02/2025
 * */

public class ContaTerminal {
    String agencia = "";
    int numeroConta = 0;
    String nomeCliente = "";
    double saldoCliente = 0.0;
     
    /**
     * Este método é utilizado para receber o valor da conta do usuario
     * @param numeroAgencia recebe um valor como inteiro referente ao numero da conta do usuario do banco
     * @return a função não retorna nenhuma valor.
     * */ 

    public void pegarNumeroConta(int conta)
    {
        this.numeroConta = conta;
    }

    /**
     * Este método é utilizado para receber o numero da agencia do usuario do banco
     * e atualiza o atributo agencia da classe.
     * @param numeroAgencia é uma string que se refere ao número da conta
     * @return a função não retorna nenhum valor
     */
    public void pegarNumeroAgencia(String numeroAgencia)
    {
        this.agencia = numeroAgencia;
    }

    /**
     * Este método é usado para pegar e atualizar o valor da variável interna
     * nomeCliente.
     * @param nome parametro usado para passar o nome do cliente para o atributo de classe
     * @return o método não retorna nenhum valor.
     */
    public void pegarNomeCliente(String nome)
    {
        this.nomeCliente = nome;
    }

    /**
     * método usado para atualizar valor do saldo do cliente
     * @param valor valor utilizado para atualizar o valor do saldo do cliente
     * @return a função não retorna nenhum valor só atualiza.
     */

    public void atualizarValorDoSaldo(double valor)
    {
        this.saldoCliente += valor;
    }
    
    /**
     * método utilizado para visualizar o valor do saldo atual
     * @return não é retornado nenhum valor, só apenas é visualizado.
     * 
     */

    public void visualizarSaldo()
    {
        System.out.println("Saldo atual: " + this.saldoCliente);
    }
}
