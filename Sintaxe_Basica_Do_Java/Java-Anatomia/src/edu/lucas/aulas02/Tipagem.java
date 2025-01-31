package edu.lucas.aulas02;

public class Tipagem {

    // tipagem de variável
    String primeiroNome = "Lucas";
    String segundoNome = "Santos";
    int idade = 32;
    float altura = 1.65f;
        
    public void TipagemVariaveis(String primeiroNome, String segundoNome) {
        String nomeCompleto =  this.primeiroNome + " " + this.segundoNome;
        System.out.println(nomeCompleto + "-> String ");
        System.out.println(idade + "-> Inteira  ");
        System.out.println(altura + "-> float ");
    }
   
}