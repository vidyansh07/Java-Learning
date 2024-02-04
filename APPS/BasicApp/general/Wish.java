package BasicApp.general;
import java.time.LocalTime;

public class Wish {
    public static  void Welcome() {
        LocalTime time = LocalTime.now();
        if  (time.isBefore(LocalTime.NOON)){
            System.out.println("Good Morning");
        }

        else if (time.isBefore(LocalTime.of(16,0))){
            System.out.println(  "Good Afternoon" + "\nHow can I help you?");}
        else if (time.isAfter(LocalTime.of (18,0))){
            System.out.println("Good Night");
        }
        else{
            System.out.println( 
                "Good Evening"
            );
        }
    }
}

