package task3;
import java.util.Scanner;
public class ATM 
{
    public static void main(String[] args) 
    {
        Scanner gp=new Scanner(System.in);
        BankAccount account = new BankAccount(5000);
        System.out.println("================================");
        System.out.println("          ATM INTERFACE");
        System.out.println("================================");
        while(true) 
        {
            System.out.println("\n----------- ATM MENU -----------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("--------------------------------");
            System.out.print("Enter your choice: ");
            int choice=gp.nextInt();
            switch(choice) 
            {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount=gp.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount=gp.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    System.out.println("Please collect your card.");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    System.out.println("Please select 1 to 4.");
            }
        }
    }
}