import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        Atmoperationinterface op=new AtmoperationImpl();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter Atm NUmber: ");
        int atmNumber = sc.nextInt();
        System.out.print("Enter Pin: ");
        int pin = sc.nextInt();
        if ((atmnumber==atmNumber)&&(atmpin==pin)){
            while (true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch=sc.nextInt();
                if(ch==1){
                    op.ViewBalance();

                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw : ");
                    double withdrawAmount=sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    int depositAmount= (int) sc.nextDouble();//5000
                    op.depositAmount(depositAmount);
                }
                else if(ch==4){
                    op.ViewMiniStatement();
                }
                else if(ch==5){
                    System.out.println("Collect your ATM Card\n Thank You for using ATM Machine");
                    System.exit(0);
                }
                else{
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Number or Pin");
            System.exit(0);
        }
        sc.close();
    }
}
