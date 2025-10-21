package basic;

public class Bank {

    public static void withdraw(int amount) throws Exception{
        double balance=50000;
        if(amount<=balance)
            System.out.println("Amount Withdraw Successfully");
        else
            throw new InvalidEmailException("Insufficient Balance");
    }
    public static void main(String[] args){

        try {
            withdraw(60000);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }
    }
}
