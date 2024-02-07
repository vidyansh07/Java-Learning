package MyrestOfLife;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class main {
   public  static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int DateYears = 2065;
      int DateMonth = 9;
      int  DateDays = 5;
      LocalDateTime Datetime= LocalDateTime.now();
    //    System.out.println("Current date and time is : " +Datetime);
      int Leftyears = DateYears-Datetime.getYear();
      int Leftmonth = Leftyears*12;
      double LeftDays = Leftyears*(365.25);
      int LeftHours = Leftyears*8760;
      long Leftminuts = Leftyears*525600;
      long Leftseconds = Leftyears*525600*60;
      System.out.println("The time you left " + (Leftyears)+" Years \n"+ (Leftmonth)+" Months \n"+(LeftDays)+ " Days \n"
         + LeftHours +" Hours \n" + Leftminuts + " Minutes \n" + Leftseconds + " Seconds"
         );
    }
}
