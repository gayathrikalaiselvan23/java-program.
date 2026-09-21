import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class LoginSystem {

    public static void login(String username, String password)
            throws InvalidUsernameException, InvalidPasswordException {

        String correctUsername = "admin";
        String correctPassword = "password123";

        if (!username.equals(correctUsername)) {
            throw new InvalidUsernameException("Invalid username");
        }

        if (!password.equals(correctPassword)) {
            throw new InvalidPasswordException("Invalid password");
        }

        System.out.println("Login successful!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {

            try {
                System.out.print("Enter Username: ");
                String username = sc.nextLine();

                System.out.print("Enter Password: ");
                String password = sc.nextLine();

                login(username, password);

                break;

            } catch (InvalidUsernameException e) {

                System.out.println(e.getMessage());
                attempts--;

                if (attempts > 0) {
                    System.out.println("Attempts remaining: " + attempts);
                }

            } catch (InvalidPasswordException e) {

                System.out.println(e.getMessage());
                attempts--;

                if (attempts > 0) {
                    System.out.println("Attempts remaining: " + attempts);
                }
            }
        }

        if (attempts == 0) {
            System.out.println("Account locked");
        }

        sc.close();
    }
}