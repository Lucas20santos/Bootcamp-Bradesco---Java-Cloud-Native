package modulos;

public class Variaveis {
    // tipos de variáveis int e double que são o padrão do java
    double salarioMinimo = 1500.45;
    int anoNascimento = 1992;

    // outros tipos de variaveis que não são o padrão do java
    byte idade = 32;
    short anoAtual = 2025;
    long cpf = 12345678901L;
    float pi = 3.14F;

    public void apresentarValor()
    {
        System.out.println("Salario Minimo tipo double: " + this.salarioMinimo);
        System.out.println("Ano de Nascimento tipo int: " + this.anoNascimento);
        System.out.printf("idade tipo byte: %d \n", idade);
        System.out.printf("Ano atual tipo short: %d \n", anoAtual);        
        System.out.printf("CPF tipo long: %d \n", cpf);
        System.out.printf("PI tipo float: %f \n", pi);
    }
}
