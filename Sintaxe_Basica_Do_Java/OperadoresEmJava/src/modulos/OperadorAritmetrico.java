package modulos;

public class OperadorAritmetrico 
{
    double Resultado = 0;
    String operacao = "vazio";

    public void somar(double valor1, double valor2)
    {
        this.Resultado = valor1 + valor2;
        this.operacao = "soma";
    }
    
    public void subtrair(double valor1, double valor2)
    {
        this.Resultado = valor1 - valor2;
        this.operacao = "subtração";
    }
    public void multiplicar(double valor1, double valor2)
    {
        this.Resultado = valor1 * valor2;
        this.operacao = "multiplicação";
    }
    public void dividir(double valor1, double valor2)
    {
        this.Resultado = valor1 / valor2;
        this.operacao = "dividir";
    }

    public void publicar()
    {
        System.out.println("O resultado da operação de " +  this.operacao + " é " + this.Resultado);
        resertarValores();
    }

    public void resertarValores()
    {
        this.Resultado = 0;
        this.operacao = "Nenhum opeeracão";
    }
}
