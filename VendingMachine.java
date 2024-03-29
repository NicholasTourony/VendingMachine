import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args){
        System.out.println("Welcome to the Vending Machine ");
        Scanner scan = new Scanner(System.in);
        boolean pickingNumber = true;
        int num = 0;
        while(pickingNumber)
        {
            System.out.println("What would you like to order enter 1 for a chocolate bar ($1.50), 2 for a soda ($1.00), or 3 for chips ($0.75):");
            
            num = scan.nextInt();
            scan.nextLine();
            if(num == 1 || num == 2 || num == 3 ){
                pickingNumber = false;
            }
            else{
                System.out.println("You have entered an incorrect number");
            }
        
        }
        

        boolean enteringMoney = true;
        double balance = 0;
        while (enteringMoney)
        {
            System.out.println("Would you like to add a $1 (yes or no):");
            String userResponse = scan.nextLine();
            if (userResponse.toLowerCase().equals("yes"))
            {
                balance = balance + 1;
            }
            else
            {
                enteringMoney = false;
            }
            System.out.println("Your balance is: " + balance);
        }
        double cost = 0.0;
        boolean enoughBalance = false;
        String item = "";
        switch (num) {
            case 1:
                if (balance >= 1.50)
                {
                    enoughBalance = true;
                    cost = 1.50;
                    item = "chocolate bar";
                }
                break;
            case 2:
            if (balance >= 1.00)
                {
                  enoughBalance = true;
                  cost = 1.00;
                  item = "soda";
                }
                break;
            case 3:
                if (balance >= 0.75)
                {
                    enoughBalance = true;
                    cost = 0.75;
                    item = "chips";
                }
                break;
        
            default:
                System.out.println("That vending machine item does not exist");
                break;
        }
            System.out.println("Are you sure you want to purchase " + item + " (yes or no)" );
        
        String purchaseConfirmation = scan.nextLine();
        if (purchaseConfirmation.toLowerCase().equals("yes")){
            balance = balance - cost;
            if (enoughBalance)
            {
                System.out.println("Thank you for your purchace, enjoy your " + item + ", your change is: " + (balance));
            }
            else{
                System.out.println("Not enough money, please enter more.");
            }
        }
        else{
            System.out.println("Heres your money back $" + balance);
        }
            
    }
}