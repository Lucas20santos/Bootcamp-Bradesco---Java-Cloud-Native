public class SistemaIbge {
    public static void main(String[] args) {
        
        for (EstadoBrasileiro estado: EstadoBrasileiro.values()) 
        {
            System.out.println(estado.getNome() + " - " + estado.getSigla() + " - " + estado.getNomeMaiusculo());
        }
    }
}
