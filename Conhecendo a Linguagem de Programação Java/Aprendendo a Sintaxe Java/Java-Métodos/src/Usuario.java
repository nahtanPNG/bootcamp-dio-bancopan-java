public class Usuario {
    public static void main(String[] args) {

        smartTv smartTv = new smartTv(); //Criando classes

        System.out.println("A TV está: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo Status -> A TV está: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> A TV está: " + smartTv.ligada);
    }
}
