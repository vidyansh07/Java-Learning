package src.basic;

public class Auth {
    public static void login( String username, 
    String password) {
        String saved_Username= "Vidyansh";
        String saved_password = "vt";

        if (!username.equals(saved_Username)){
            System.out.println("User doesn't exist");
            return;
        }
        if (!password.equals(saved_password)){
            System.out.println("Password Doesn't match");
            return;
        }
        System.out.println("Authetication Approved");        
    }
}
