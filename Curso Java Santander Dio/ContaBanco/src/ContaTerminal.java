/**
 * <h1> ContaTerminal </h1>
 * 
 * Realiza a criação de uma conta bancária.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Cleriston Jr.
 * @version 1.0
 * @since 29/04/2024
 */

//Importação 
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * Este é o método principal que inicia a execução do programa.
     * Ele solicita ao usuário que insira detalhes da conta, como número da conta, número da agência, nome do titular e saldo.
     * Em seguida, imprime uma mensagem de boas-vindas ao titular da conta.
     *
     * @param args Uma matriz de argumentos de linha de comando passados para este método
     */
    public static void main(String[] args){


        /** Inicialização do Scanner*/
        Scanner scanner = new Scanner(System.in, "UTF-8").useLocale(Locale.US);

        /** Solicitando ao usuário para que ele informe o número da conta e armazenando em numeroConta*/
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        /** Solicitando ao usuário para que ele informe o número da agência e armazenando em agencia*/
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        /** leitura da tecla ENTER para que ela não seja armazenada no próximo */
        scanner.nextLine();
        /** Solicitando ao usuário para que ele informe o nome do titular da conta e armazenando em nomeCliente, veja que não foi utilizado o scanner.next() e sim o scanner.nextLine(), isso foi necessário para que o usuário possa informar o nome completo, mas para isso é necessário utilizar o scanner.nextLine() anteriormente para que ele leia a tecla ENTER.*/
        System.out.println("Por favor, digite o nome do titular da conta: ");
        String nomeCliente = scanner.nextLine();

        /** Solicitando ao usuário para que ele informe o saldo da conta e armazenando em saldo*/
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        /** Imprimindo todas as informações da conta*/
        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta de número " + numeroConta + ". Seu saldo de R$" + saldo +" já está disponível para saque!");
        
    }
}
