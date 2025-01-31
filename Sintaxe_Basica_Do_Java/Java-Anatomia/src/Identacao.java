public class Identacao {

    int valor = 10;
    float nota1 = 10f;
    float nota2 = 7.9f;
    float media;

    public void publicarMedia()
    {

        this.media = (this.nota1 + this.nota2) / 2;

        System.out.println("Sua média é: " + this.media);
    }

    public void Indentar(){
        System.out.println(this.valor);
    }
}
