package basic;

import java.util.Scanner;

public class GmailApplication {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a email");
        String email=sc.next();

        try {
            if(email.equals("ujjwal@gmail.com")){
                System.out.println("Enter Password");
                String password=sc.next();
                try{
                    if(password.equals("ujjwal@1234"))
                        System.out.println("Successfully login");
                    else throw new PasswordInvalidException("Password Invalid!");
                }
                catch (PasswordInvalidException e){
                    System.out.println(e.getMessage());
                }
                catch (Exception e){
                    System.out.println(e);
                }

            }else {
                throw new InvalidEmailException("Invalid Email!");
            }
        }catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }
}
