import java.util.*;
class Account
{
    int account_no;
    String name;
    int amount;
    
    void insert(String nm,int ac,int am)
    {
        name=nm;
        account_no=ac;
        amount=am;
    }
    
    void deposit(int  g)
    {
        amount=amount+g;
    }
    
    void withdrawl(int s)
    {
        if(s>amount)
        {
            System.out.println("Amount is unsufficent.");
        }
        else
        {
            amount=amount-s;
        }
    }
    
    void check_balance()
    {
        System.out.println("Total balance: "+amount);
    }
    
    void display()
    {
        System.out.println("Account no.: "+account_no);
        System.out.println("Name: "+name);
        System.out.println("Amount: "+amount);
    }
    
    public static void main(String args[])
    {
        Account obj=new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a= sc.nextLine();
        System.out.println("Entery your account no: ");
        int b= sc.nextInt();
        System.out.println("Enter amount: ");
        int s = sc.nextInt();
        System.out.println("Enter your amount you deposit: ");
        int g = sc.nextInt();
        System.out.println("Enter amount you want to withdrawl: ");
        int x = sc.nextInt();
        obj.insert(a,b,s);
        obj.deposit(g);
        obj.withdrawl(x);
        obj.check_balance();
        obj.display();
    }
}
