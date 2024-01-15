import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
        double saldo = 350.50;
       System.out.println("Digite o seu nome: ");
       String nomeCliente = sc.nextLine();
       System.out.println("Digite sua agencia: ");
       int agencia = sc.nextInt();
       System.out.println("Digite sua conta: ");
       String contaBanco = sc.next();
       System.out.println("Seu saldo é: " + saldo);
       
       
       System.out.println();
       System.out.println("Deseja realizar alguma saque? (y/n)");
       String resposta = sc.next();

       if (resposta.equals("y")) {
            System.out.println("O valor do saque: ");
            double saque = sc.nextDouble();
            double novoSaldo = saldo - saque;
            System.out.println("Olá "+ nomeCliente + " sua agencia é " + agencia + " e sua conta é " + contaBanco + " com saldo de: " + novoSaldo);
            
       } else{

       System.out.println("Olá "+ nomeCliente + " sua agencia é " + agencia + " e sua conta é " + contaBanco + "com saldo de: " + saldo);

       }
    }

}
