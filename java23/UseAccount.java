import bank.Account;
import mypkg.Util;

class UseAccount
{
    public static void main(String[]args)
    {
        Account a=new Account();
        a.setData(101);
        a.display();
    }
}