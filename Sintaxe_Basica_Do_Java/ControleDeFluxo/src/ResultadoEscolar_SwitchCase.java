public class ResultadoEscolar_SwitchCase {
    public static void main(String[] args) {
        System.out.println("Estrutura de Controle Composta");

        String regiao = "NE";

        switch (regiao) 
        {
            case "NE" -> System.out.println("Nordeste");
            case "SE" -> System.out.println("Sudeste");
            case "N" -> System.out.println("Norte");
            case "S" -> System.out.println("Sul");
            default -> System.out.println("Centro-Oeste");
        }
        
    }
}
