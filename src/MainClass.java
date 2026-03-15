import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        bankoperatingInter op = new BankOperatingImpl();

        System.out.println("========Welcome To HDFC Bank=========");
        System.out.println("1. New Customer ?");
        System.out.println("OR");
        System.out.println("2. Want to Login in Your Account");

        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        sc.nextLine();
        if(userChoice == 1){
            System.out.println("Create Your Acc");
            System.out.println("Enter Your Name : ");
            String accHolder = sc.nextLine();
            System.out.println("Enter Your Age : ");
            int accAge =sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Your Aadhar Card No. ");
            long accAadhar = sc.nextLong();
            String pin = "";
            for(int i = 1; i<=4;i++){
                pin += (int) (Math.random()*10);
            }
            System.out.println("Your Account Created SuccessFully");
            System.out.println("Account Holder Name :"+accHolder);
            System.out.println("Account Holder Aadhar Number :"+accAadhar);
            System.out.println("Your Account Pin is : "+pin);
            System.out.println("Thank You !! For opening account in Our Bank ");
            System.exit(0);
        }
        else if(userChoice == 2){
            while(true){
                System.out.println("Select Your Choice");
                System.out.println("1.View Balance \n 2.Deposit Amount \n 3.WithDraw Amount \n 4.Exit");
                int choice = sc.nextInt();
                switch (choice){
                    case 1 :
                        op.viewBalance();
                        break;
                    case 2 :
                        System.out.print("Enter Amount to Deposit : ");
                        int deposit = sc.nextInt();
                        op.depositCash(deposit);
                        break;
                    case 3 :
                        System.out.print("Enter Amount to WithDraw : ");
                        int withDraw = sc.nextInt();
                        op.withDraw(withDraw);
                        break;
                    case 4 :
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice !!");
                }
            }
        }
        else{
            System.out.println("Invalid Choice !!");
        }

        sc.close();


    }
}
