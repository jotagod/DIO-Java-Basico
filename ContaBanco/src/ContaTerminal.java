import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência!");
        String Agencia = scanner.next();        
        
        System.out.println("Por favor, digite o número da conta!");
        int Numero = scanner.nextInt();        
        
        System.out.println("Por favor, digite o nome do cliente!");
        String NomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o saldo");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + 
        ", conta " + Numero + 
        " e seu saldo " + Saldo + 
        " já está disponível para saque.");

    }
}
