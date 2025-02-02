import modulos.Declaracao;
import modulos.Identacao;
import modulos.Tipagem;

public class MinhaClasse {

    public  static void main(String [] args)
    {
        System.out.println("Olá Mundo");
        // a palavra reservada "final" impende que a variável BR sofra alterações
        final String BR = "Brasil";

        System.out.println(BR);

        // Declarações de variáves
        Declaracao d1 = new Declaracao();
        d1.DeclaracaoInvalidas();
        d1.DeclaracaoValida();

        // Tipagem
        Tipagem t1 = new Tipagem();
        t1.TipagemVariaveis("Lucas", "Santos");

        // identação
        Identacao I1 = new Identacao();
        I1.Indentar();
        I1.publicarMedia();
    }
}
