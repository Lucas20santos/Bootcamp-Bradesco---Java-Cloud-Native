public class PlanoTelefonico {
    public static void main(String[] args) {
        String planos = "MIDIA";

        switch (planos) 
        {
            case "BASIC" -> System.out.println("Você tem 100 minutos de ligação");
            case "MIDIA" -> System.out.println("Você tem 100 minutos de ligação mais Whatsapp e Instagram grátis");
            case "TURBO" -> System.out.println("Você tem 100 minutos de ligação mais Whatsapp e instagram grátis mais 5Gb Youtube.");
            default -> System.out.println("Você não escolheu nenhum dos três planos.");
        }
    }
    
}
