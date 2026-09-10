// 1. Define the Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// 2. Define the Voter Verification Class
class VoterVerifier {
    // Method that throws the custom exception if the user is underage
    public void verifyEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access Denied! You must be 18 or older to cast your vote.");
        }
        System.out.println("Access Granted! Welcome to the Online Voting Dashboard.");
    }
}

// 3. Main class named OnlineVoting
public class OnlineVoting {
    public static void main(String[] args) {
        VoterVerifier verifier = new VoterVerifier();

        // Test Case 1: Underage User (Triggers Exception)
        try {
            int userAge1 = 16;
            System.out.println("Checking eligibility for age: " + userAge1);
            verifier.verifyEligibility(userAge1);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("\n------------------------------------\n");

        // Test Case 2: Eligible User
        try {
            int userAge2 = 21;
            System.out.println("Checking eligibility for age: " + userAge2);
            verifier.verifyEligibility(userAge2);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
