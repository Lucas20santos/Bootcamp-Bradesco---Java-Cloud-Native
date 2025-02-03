package modulos;

public class OperadoresUnario {

    public void operarUnarioValorPositivo(int numero)
    {
        System.out.printf("Seu numero era %d agora é %d \n", numero, +numero);
    }
    
    public void operarUnarioValorNegativo(int numero)
    {
        System.out.printf("Seu numero era %d agora é %d \n", numero, -numero);
    }
    public void incrementarUsandoOperadorUnarioIncremento(int numero)
    {
        System.out.printf("Seu numero era %d agora é %d \n", numero, ++numero);
    }
    public void incrementarUsandoOperadorUnarioDecremento(int numero)
    {
        System.out.printf("Seu numero era %d agora é %d \n", numero, --numero);
    }
}
