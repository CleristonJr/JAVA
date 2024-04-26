public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada? "  + smartTv.ligada);
        System.out.println("Qual o canal atual? " + smartTv.canal);
        System.out.println("Qual o volume atual? " + smartTv.volume);

        smartTv.ligar();

        smartTv.aumentarVolume();

        smartTv.mudarCanal(14);

        smartTv.imprimir();
    }
}
