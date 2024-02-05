import java.util.Scanner;
import src.basic.Auth;

public class Main {
    
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Username : ");
        String username =scanner.nextLine(); 

        System.out.println("Enter your password : ");
        String password =scanner.nextLine();

        Auth.login(username, password);
    }
}
