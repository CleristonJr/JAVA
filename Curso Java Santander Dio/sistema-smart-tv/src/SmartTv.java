public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("Ligando Tv!");
    }
    public void desligar(){
        System.out.println("Desligando Tv!");
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume!");
        System.out.println("Volume atual: " + volume);
    }
    public void diminuirVolume(){
        if (volume > 1) {
            volume--;
            System.out.println("Diminuindo o volume!");
            System.out.println("Volume atual: " + volume);
        }else{
            System.out.println("Não é possível diminuir o volume!");
            System.out.println("Volume atual: " + volume);
        }
        
    }

    public void subirCanal(){
        canal++;
        System.out.println("Alterando canal!");
        System.out.println("Canal atual: " + canal);
    }
    public void descerCanal(){
        if (canal > 1) {
            canal--;
            System.out.println("Alterando canal!");
            System.out.println("Canal atual: " + canal);
        }else{
            System.out.println("Impossível concluir ação!");
        }
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void imprimir(){
        System.out.println("Canal atual: " + canal);
        System.out.println("Volume atual: " + volume);
    }

}
