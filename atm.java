import java.util.Scanner;
public class atm{
    public static void main(String args[])
    {
        int bal=100000,withdraw,deposit;
        Scanner obj=new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated teller machine");
            System.out.println("select the below options :");
            System.out.println(" 1. Withdraw ");
            System.out.println(" 2. Deposit");
            System.out.println(" 3. check balance ");
            System.out.println(" 4. Exit ");

            int choice=obj.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter money to be withdraw");
                    withdraw=obj.nextInt();
                    if(bal>=withdraw)
                    {
                        bal=bal-withdraw;
                        System.out.println("please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient balance");

                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money to be deposited");
                    deposit=obj.nextInt();
                    bal=bal+deposit;
                    System.out.println("your money has been successfully deposit");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("balance :"+bal);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);           
                    }
            }
            }
            }