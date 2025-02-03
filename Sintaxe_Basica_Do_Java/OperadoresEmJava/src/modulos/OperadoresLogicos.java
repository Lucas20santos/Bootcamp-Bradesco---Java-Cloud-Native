package modulos;

public class OperadoresLogicos 
{
    String resultado = "";
    
    public void verificarMaiorQue(int num1, int num2)
    {
        this.resultado = num1 > num2 ? "Verdadeiro": "Falso";
        System.out.printf("O número %d é maior que %d ? %s", num1, num2, this.resultado);
    }
}
