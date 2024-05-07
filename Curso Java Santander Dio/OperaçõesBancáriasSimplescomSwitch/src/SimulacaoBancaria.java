import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            System.out.println(" 1. Depositar");
            System.out.println(" 2. Sacar");
            System.out.println(" 3. Consultar Saldo");
            System.out.println(" 4. Encerrar");
            int opcao = scanner.nextInt();
            
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
        switch (opcao){
          case 1:{
            
            System.out.println("Informe o valor a ser depositado:");
            double valorDepositar = scanner.nextDouble();
            saldo = depositar(saldo, valorDepositar);
            System.out.println("Saldo atual: " + saldo);
            break;
            
          }
          case 2:{
            
            System.out.println("Informe o valor a ser sacado:");
            double valorSacar = scanner.nextDouble();
            saldo = sacar(saldo, valorSacar);
            System.out.println("Saldo atual: " + saldo);
            break;
            
          }
          case 3:{
            
            System.out.println("Saldo atual: " + saldo);
            break;
            
          }
          case 4:{
            System.out.println("Programa encerrado.");
            System.exit(0);
          }
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
          default:{
            System.out.println("Opção inválida. Tente novamente."); 
            }
          }
          }
          
      }
        
        
    
    public static double depositar(double saldo, double valorDepositar){
          
        saldo = saldo + valorDepositar;
        return saldo;
          
    }
        
    public static double sacar(double saldo, double valorSacar){
          
        if(saldo > valorSacar){
              saldo = saldo - valorSacar;
        }else{
          System.out.println("Saldo Insuficiente.");
        }
        
        return saldo;
          
    }
}