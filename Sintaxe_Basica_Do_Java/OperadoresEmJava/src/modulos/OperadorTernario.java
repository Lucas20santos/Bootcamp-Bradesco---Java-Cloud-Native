package modulos;

public class OperadorTernario {

    String maiorIdade = "Falso";

    public void verificarMaiorIdade(int idade)
    {
        this.maiorIdade = idade >= 18 ? "Verdade": "Falso";
        System.out.println("O usuario é maior de idade: " + this.maiorIdade);
    }
}
