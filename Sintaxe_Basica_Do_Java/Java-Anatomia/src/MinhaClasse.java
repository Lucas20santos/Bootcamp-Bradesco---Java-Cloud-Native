public class MinhaClasse {
    public  static void main(String [] args)
    {
        System.out.println("Olá Mundo");
        // a palavra reservada "final" impende que a variável BR sofra alterações
        final String BR = "Brasil";

        System.out.println(BR);

        
        /*
         * Declaração invalida de variávies
         *  int numero&um = 1;
         *  int 1numero = 1;
         *  int numero um = 1;
         *  int long = 1;
        */

        /*
        * Declarações validas
        * 
        */

        int numero$um = 1;
        int numero1 = 1;
        int numeroUm = 1;

        System.out.println(numero$um);
        System.out.println(numero1);
        System.out.println(numeroUm);
        
    }
}
