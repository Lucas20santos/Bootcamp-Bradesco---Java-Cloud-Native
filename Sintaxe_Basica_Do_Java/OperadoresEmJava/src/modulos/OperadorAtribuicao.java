package modulos;

public class OperadorAtribuicao {
    // Classe operadore de atribuição
    String nome = "Lucas";
    int idade = 22;
    double peso = 85.4;
    char sexo = 'M';
    boolean doadorOrgao = false;


    public void publicarValores()
    {
        System.out.printf("Nome: " + nome + " Idade: %d \nPeso: %f \nSexo: %c\n", idade, peso, sexo);
        System.out.println("Doador de orgão: " + doadorOrgao);
    }    
}
