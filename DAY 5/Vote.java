package regexe;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class Vote {

    public static void main(String[] args) {

        int age = 16;  

        try {
            if (age < 18) {
                throw new InvalidAgeException("Candidate is not eligible to vote");
            } else {
                System.out.println("Candidate is eligible to vote");
            }
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
