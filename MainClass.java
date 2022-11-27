package VIJAY;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();
        Scanner id=new Scanner(System.in);
        System.out.println("Create Your New Account No !!!\n Enter Here¬>");
        int atmnumber=id.nextInt();
        System.out.println("Enter Your New Atm Pin ");
        int atmpin=id.nextInt();
        Scanner in=new Scanner(System.in);       
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter Atm Number : ");
        int atmNumber=in.nextInt();
        System.out.print("Enter Pin: ");
        int pin=in.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch=in.nextInt();
                if(ch==1){
                    op.viewBalance();

                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=in.nextDouble();//5000
                    op.depositAmount(depositAmount);


                }
                else if(ch==4){
                    op.viewMiniStatement();

                }
                else if(ch==5){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
        	for(int i=1;i<=3;i++) {
            System.out.println("Incorrect Atm Number or pin");
           
            System.out.println("Welcome to ATM Machine !!!");
            System.out.print("Enter Atm Number : ");
             atmNumber=in.nextInt();
            System.out.print("Enter Pin: ");
             pin=in.nextInt();
             
             if((atmnumber==atmNumber)&&(atmpin==pin)){
                 while(true){
                     System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                     System.out.println("Enter Choice : ");
                     int ch=in.nextInt();
                     if(ch==1){
                         op.viewBalance();

                     }
                     else if(ch==2){
                         System.out.println("Enter amount to withdraw ");
                         double withdrawAmount=in.nextDouble();
                         op.withdrawAmount(withdrawAmount);

                     }
                     else if(ch==3){
                         System.out.println("Enter Amount to Deposit :");
                         double depositAmount=in.nextDouble();//5000
                         op.depositAmount(depositAmount);


                     }
                     else if(ch==4){
                         op.viewMiniStatement();

                     }
                     else if(ch==5){
                         System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                         System.exit(0);
                     }
                     else
                     {
                         System.out.println("Please enter correct choice");
                     }
                    
                 }
                 
             }
             
            
            
        }
        	System.out.println("\nYour Limitation has been ended..\n Contact To Your Bank\nHelpline no-875483475");
        	System.out.println("Collect your ATM Card\n Thank You!!!");
        	System.exit(0);

        }
        
    }
}

