import java.util.concurrent.ThreadLocalRandom;
public class FazerComWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            System.out.println("Doce de valor " + valorDoce + " adicionado no carrinho");

            mesada -= valorDoce;
            
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Gastou toda a mesada");


    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
