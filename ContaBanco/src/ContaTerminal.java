import java.util.Scanner;

public class ContaTerminal {

     static int numero = 0;
     static String agencia ="";
     static String nomeCliente ="";
     static float saldo =0.0f;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        
        System.out.println("Por favor digite número da Agência !");
        numero = sc.nextInt();

        System.out.println("Agora informe a Agência !");
        agencia = sc.next();
       
        sc.nextLine();

        System.out.println("Agora informe Nome Cliente !");
        nomeCliente = sc.nextLine();

        sc.nextLine();

        System.out.println("Por último informe seu Saldo !");
        saldo = sc.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
         nomeCliente, agencia, numero, saldo);
        

    }
}
