import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Account newAccount=new Account("12345",0.0,"Bimsara",
                "Bimsara@gmail.com","0781402190");

        for (int i=0;i<3;i++){
            System.out.println("Enter Deposited Money :");
            double depositMoney=scanner.nextDouble();
            newAccount.depositMoney(depositMoney);

            System.out.println("Enter Withdraw Amount :");
            double withdrawAmount=scanner.nextDouble();
            newAccount.withdraw(withdrawAmount);

        }






    }
    }
