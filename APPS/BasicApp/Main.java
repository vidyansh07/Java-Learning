package BasicApp;
import java.util.Scanner;

import BasicApp.general.Wish;
import BasicApp.general.Math;
public class Main {
    @Test
    public static void main(String[] args) {
        int i =0;
        while (i<10){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an option to browse our app :");
            System.out.println("1 : Wisher");
            System.out.println("2 : Maths");
            String  choice = scanner.nextLine();
            if (choice.equals("1")){
                Wish.Welcome();
            }
            else if (choice.equals("2")){Math.value();}
            else
                System.out.println("Invalid Option Please Try Again");
            scanner.close();
        }
    }
}
