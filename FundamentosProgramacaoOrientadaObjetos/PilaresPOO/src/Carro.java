public class Carro {
    public void ligar() {
        this.confereCombustivel();
        this.confereCambio();
        System.out.println("Carro ligado");
    }
    
    private void confereCombustivel()
    {
        System.out.println();
    }
    private void confereCambio()
    {
        System.out.println("conferindo cambio em P");
    }
}
