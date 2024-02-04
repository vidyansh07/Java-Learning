package BasicApp.general;
import java.util.Scanner;

public class  math {
    static Scanner scanner = new Scanner(System.in);
    public static void add(){;
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        System.out.println("Your result is : "+(number1+number2));
        scanner.close();
    }
    public static void substract(){
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        System.out.println("Your result is : "+(number1-number2));
        scanner.close();
    }
    public static void multiply(){
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        System.out.println("Your result is : "+(number1*number2));
        scanner.close();
    }
    public static void divide(){
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        System.out.println("Your result is : "+(number1/number2));
        scanner.close();
    }
    public static void math() {
        System.out.println("Enter two numbers:");
        System.out.println("1: add");
        System.out.println("2: subtract");
        System.out.println("3 : multiply");
        System.out.println("4:  divide");

        String operation = scanner.nextLine(); //to read the \n character after input
        if (operation.equals("1")){
            add();
        }else if (operation.equals("2")){
            substract();
        }
        else if (operation.equals("3")){
            multiply();
        }
        else if (operation.equals("4")){
            divide();
        }
        else System.out.println("please Enter valid Input");
        scanner.close();
    }
}
