import java.util.Scanner;

// public class Main {
//     public static void main(String [] args){
        // Sorthand condition example
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please Enter the name : " );
//         String name = sc.nextLine();   
//         String result = (10 ==10) ? "Passed" : "failed";
//         System.out.println(name + " You "+ result + " The exam." );    
//         sc.close();
//     }
// }
// conditions is java

// if condition 

// switch condition 

// sorthand conditions 

// syntax of sorthand condition 
    // String result = (expression) ? true : false 

// public class Main{
//     public static void main(String [] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Please Enter your name : ");
//         String name = scanner.nextLine();
        
//         String result =(name.equals("vaibhav"))? "Success":  "Failed";
//         System.out.println("Success");

//         scanner.close();

//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Plese Enter a number : ");
//         int num = sc.nextInt();
//         String result = (num%2 == 0)? "Modulus is equals to the zero": "Modulus is not equals to the zero";
//         System.out.println(result);
//     }
// }



/*
 * Write a program to check the large number between two numbers.
 */

// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Plese Enter the first number :");
//         int num1 = sc.nextInt();
//         System.out.println("Plese Enter the second number : ");
//         int num2 = sc.nextInt();
//         String result = (num1> num2)? String.valueOf(num2) + "is smaller number" : num1 + "is larger number";
//         System.out.println(result);
//     }
// }



/*
 * Array in java
 * loops in java 
 */

// public class Main{
//     public static void main(String[] args) {
//         String value[]= {"23","vidya","vibhav","a"};
//         for (int i =0 ; i < value.length; i ++){
//             System.out.println(value[i]);
//         }
//     }
// }

/*
 * for each loop in java
 */

// public class Main{
//     public static void main(String[] args) {
        
//         String  subjects[]= {
//             "DBMS",
//             "OS",
//             "Azile",
//             "DA",
//             "CN"
//         };
//         for(String subject : subjects){
//             if (subject.equals("DBMS")){
//                 System.out.println(subject +": In this subject you got your faviorate Teacher.");
//             }
//             else if(subject.equals("Azile")){
//                 System.out.println("I think you are interested in learning Azile.");
//             }
//             else if(subject.equals("CN")){
//                 System.out.println("Your are going to write a research paper in this subject");
//             }
//             else if (subject.equals("DA")){
//                 System.out.println(subject  + " You will be bour in this subject.");
//             }
//             else{
//                 System.out.println("Os is also a important subject.");
//             }
//         }
//     }
// }


/*Write a java code to print the hello world according to the user input*/

// public class Main{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Plese Enter the number : ");
//         int num = scanner.nextInt();
//         for (int i = 1; i<= num; i ++){
//             System.out.println("Hello world.");
//         }
//         scanner.close();
//     }
// }




/* 
 * Number adding in java
 */
// public class Main{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("How much number you want to add : ");
//         int num = scanner.nextInt();
//         int add = 0;
//         for (int i = 0 ; i <=num ;i ++){
//             add = add + i;
//         }
//         System.out.println(add);
//     }
// }



/*
 * LOOPS IN JAVA
 * 
 * 1. for
 * 2. for each
 * 3. while
 * 4. do while
 */

public class Main {
    static int love,coding;
    Main(){

    }
    public static void main(String[] args) {
        love=coding;
        coding = love;
        System.out.println(love);

    }
}