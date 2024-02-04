package BasicApp;
import java.util.Scanner;

import BasicApp.general.Wish;
import BasicApp.general.math;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option to browse our app :");
        System.out.println("1 : Wisher");
        System.out.println("2 : Maths");
        String  choice = scanner.nextLine();
        if (choice.equals("1")){
            Wish.Welcome();
        }
        else if (choice.equals("2"))
            math.math();
        
        else
            System.out.println("Invalid Option Please Try Again");
        
        scanner.close();


    }
}
