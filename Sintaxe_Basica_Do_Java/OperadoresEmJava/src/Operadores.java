import modulos.OperadorAritmetrico;
import modulos.OperadorAtribuicao;

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
    }
    
}