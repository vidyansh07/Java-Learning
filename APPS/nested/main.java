// import java.util.Scanner;

// public class main {
//     public static void main(String args[]){
//         // title
//         // name 
//         // age 
//         // mobile
//         // password
//         // repeat password
//         Scanner scanner  = new Scanner(System.in);
//         System.out.println("Please enter your Title Mr/Mrs/Miss/Shri:");
//         String title = scanner.nextLine();

//         System.out.println( "Please enter your Name : ");
//         String name = scanner.nextLine();

//         System.out.println("Please enter your Age : ");
//         int  age = scanner.nextInt();

//         System.out.println( "Please enter your Mobile Number :" );
//         String mob_num = scanner.nextLine();

//         System.out.println( "Please create a Password:" );
//         String pass1 = scanner.nextLine();

//         System.out.println( "Re-enter the Password to confirm:" );
//         String  pass2 = scanner.nextLine();

//         scanner.close();


//         // positive method

//         if (title.equals("Mr")
//         || title.equals("Mrs")
//         || title.equals("Miss")
//         || title.equals("Shri")){
//             if  (age >=18){
//                 if (pass1.equals(pass2)){
//                     System.out.println("Signup Successfull");
//                 }
//                 else{
//                     System.out.println( "Passwords do not match. Please try again." );
//                 }
            
//                 System.out.println( "Sorry, you must be at least 18 years old to register.");
//             }
//         else{
//             System.out.println("Invalid title entered. Please try again.");
//         }
//         }
//     }
        // negetive approch for performing the tasks and  validating the user inputs
        // if (
        //     !title.equals("Mr")
        //     && !title.equals("Mrs")
        //     && !title.equals( "Miss")
        //     && !title.equals("Shri")
        // ){
        //     System.out.println("Invalid Input! Please Enter Again.");
        //     return;
        // }

        // if (age<18 && age>0){
        //     System.out.println("Sorry, you are not eligible for registration as per Indian law.\nPlease contact Adminstrator for further assistance.");
        //     System.out.println("Sorry, you are not eligible for registration as per Indian law.");
        //     return;
        // }
        // if (!pass1.equals(pass2)){
        //     System.out.println("Password does not match. Please try again.");
        //     return;
        // }
        // System.out.println("Sign Up successfull");

//         }
// }


/**
 * main
 */
public class main {

    // Function to perform linear search
    public static int linearSearch(int[] arr, int target) {
        // Traverse through all elements of the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element equals the target, return its index
            if (arr[i] == target) {
                return i;
            }
        }
        // If the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 1, 9, 3, 6 };
        int target = 7;

        // Perform linear search
        int index = linearSearch(arr, target);

        // Check if the target element was found
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

