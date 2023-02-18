public class smartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("O volume foi aumentado para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("O volume foi diminuido para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
