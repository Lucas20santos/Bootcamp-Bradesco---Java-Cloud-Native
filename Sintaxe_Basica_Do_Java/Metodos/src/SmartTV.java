public class SmartTV
{
        /*
         * Exemplo prático:
         * Vamos criar um exemplo de uma classe para representar uma SmartTV onde: 
         * 1. Ela tem as caracteristicas: ligada (boolean), canal (int) e volume (int)
         * 2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada.
         * 3. Nossa TV aumentará e mininuirá o volume sempre em +1 e -1.
         * 4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número.
        */
        private boolean ligada = false;
        private int canal = 0;
        private int volume = 0;

        public void ligarTV()
        {
            if(!this.ligada)
            {
                this.ligada = true;
                this.mostrarStatus();
            }
        }
        public void desligarTV()
        {
            if(this.ligada)
            {
                this.ligada = false;
            }
        }
        public void trocarCanalMais()
        {
            this.canal = this.canal + 1;
            this.mostrarStatus();
        }
        public void trocarCanalMenos()
        {
            this.canal -= 1;
            this.mostrarStatus();
        }
        public void aumentarVolume()
        {
            if((this.volume != 100))
            {
                this.volume += 1;
                this.mostrarStatus();
            }
        }
        public void diminuirVolume()
        {
            if(!(this.volume != 0))
            {
                this.volume -= 1;
                this.mostrarStatus();
            }
        }
        public void mostrarStatus()
        {
            if(this.ligada)
            {
                System.out.println("Ligada: " + this.ligada);
                System.out.println("Volume: " + this.volume);
                System.out.println("Canal: " + this.canal);
            }
            else
            {
                System.out.println("TV Desligada");
            }
        }

}
