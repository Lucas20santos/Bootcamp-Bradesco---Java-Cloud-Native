import modulos.OperadorAritmetrico;
import modulos.OperadorAtribuicao;
import modulos.OperadorTernario;
import modulos.OperadoresUnario;

public class Operadores {

    public static void main(String[] args) {
        // Operador de atribuição
        System.out.println("            Operador de Atribuição                 ");

        OperadorAtribuicao Opa1 = new OperadorAtribuicao();
        Opa1.publicarValores();

        // Operador aritmétrico
        System.out.println("           Operador de Aritmétrico                   \n");
        OperadorAritmetrico Oa1 = new OperadorAritmetrico();
        Oa1.somar(10, 20);
        Oa1.publicar();
        Oa1.subtrair(20, 10);
        Oa1.publicar();
        Oa1.multiplicar(20, 10);
        Oa1.publicar();
        Oa1.dividir(20, 10);
        Oa1.publicar();

        // Operador Unario
        System.out.println("                 Operadores Unarios                ");
        OperadoresUnario Ou1 = new OperadoresUnario();
        Ou1.operarUnarioValorPositivo(5);
        Ou1.operarUnarioValorNegativo(9);
        Ou1.incrementarUsandoOperadorUnarioDecremento(10);
        Ou1.incrementarUsandoOperadorUnarioDecremento(10);

        // Operador ternario
        OperadorTernario Ot1 = new OperadorTernario();
        Ot1.verificarMaiorIdade(18);
    }
    
}