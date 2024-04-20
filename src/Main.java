import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
        System.out.println("Entre com os dados da conta: ");
        System.out.println("Numero: ");
        int number = sc.nextInt();
        System.out.println("Nome: ");
        String holder = sc.next();
        System.out.println("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.println("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println(acc);

        System.out.println("Quanto quer depositar? ");
        double amount = sc.nextDouble();
        acc.deposit(amount);

        System.out.println(acc);

        System.out.println("Quanto quer sacar? ");
        amount = sc.nextDouble();
        acc.withdraw(amount);
        System.out.println(acc);

       }
        catch (InputMismatchException e){
            System.out.println("Você é burro");

        }
        catch (IllegalArgumentException i){
            System.out.println("Erro: " + i.getMessage());
        }


        }
    }
