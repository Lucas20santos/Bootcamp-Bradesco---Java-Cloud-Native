public class App
{
    public static void main(String[] args) {
        System.err.println("Iniciou o programa no método main");
        a();
        System.err.println("Finalizou o programa no método main.");
    }

    public static void a() 
    {
        System.err.println("Iniciou o programa no método a");
        b();
        System.err.println("Finalizou o programa no método a.");
    }

    public static void b() 
    {
        System.err.println("Iniciou o programa no método b");
        c();
        System.err.println("Finalizou o programa no método b.");
    }

    public static void c()
    {
        System.err.println("Iniciou o programa no método c");
        // b();
        System.err.println("Finalizou o programa no método c.");
    }
}