package modulos;

public class Declaracao {

    public void DeclaracaoInvalidas(){
        String texto = """
         * Declaração invalida de variávies

         *  int numero&um = 1
         *  int 1numero = 1
         *  int numero um = 1
         *  int long = 1 """;

        System.out.println(texto);
    }

    public void DeclaracaoValida(){
        System.out.println("""
        * Declarações validas
        
        * int numero$um = 1;
        * int numero1 = 1;
        * int numeroUm = 1;
        """);
    }
}