// short hand condition
// the name matcher

// import java.util.*;
// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int x = scanner.nextInt();
//         int y = 10;
//         String result = (x!=y)? "Succes":"Failed";
//         System.out.println(result);
//     }
// }



// Number comparision tool
// import java.util.*;
// public class main{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Please Enter the number One : ");
//         int num_1 = scanner.nextInt();

//         System.out.println("Please Enter the second Number : ");
//         int num_2 = scanner.nextInt();
        
//         String result = (num_1>num_2)? "Yes first number is greater then second number": "Second number is greater then first number";
//         System.out.print(result);
//         scanner.close();
//     }
// }



// Arrey in Java
// Loops in java


// public class main{
//     public static void main(String[] args){
//         String[] arr_1 = {"Hello","i","am", "Vidyansh","Tripathi","From","mmdu"};
//         // for (int i = 0; i<arr_1.length; i++){
//         //     System.out.println(arr_1[i]);
//         // }

//         // For Each loop in java
//         for (String x: arr_1){
//             System.out.println(x);
//         }
//     }
// }


import java.util.*;

public class main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese Enter a Number");
        int input = scanner.nextInt();
        int x = 15;
        for (int i =1; i<=x; i++){
            if (i==11) continue;
            System.out.println(input+"*"+ i + "=" +input*i);
        }
    }
}