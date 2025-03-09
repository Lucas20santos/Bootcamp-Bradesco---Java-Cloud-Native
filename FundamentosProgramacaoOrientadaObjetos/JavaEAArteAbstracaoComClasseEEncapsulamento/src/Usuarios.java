import banco.ContaBancaria;

public class Usuarios
{
    public static void main(String[] args) 
    {
        var us1 = new ContaBancaria();
        var us2 = new ContaBancaria();
        var us3 = new ContaBancaria();

        System.out.println(us1.getNumeroContaBancaria());
        System.out.println(us2.getNumeroContaBancaria());
        System.out.println(us3.getNumeroContaBancaria());
    }

}
