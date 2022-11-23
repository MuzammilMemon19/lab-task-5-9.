import java.util.Scanner;

class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();

        String[][] userDetails = { 
            {"user1@gmail.com", "password1"},
            {"user2@gmail.com", "password2"},
            {"user3@gmail.com", "password3"},
            {"user4@gmail.com", "password4"},
            {"user5@gmail.com", "password5"}
        };

        boolean isUserRegistered = false;
        for (int i=0; i<userDetails.length; i++) {
            if (email.equals(userDetails[i][0]) && password.equals(userDetails[i][1])) {
                isUserRegistered = true;
                break;
            }
        }

        if (isUserRegistered) {
            System.out.println("Welcome!");
        } else {
            System.out.println("You are not registered.");
        }
    }
}