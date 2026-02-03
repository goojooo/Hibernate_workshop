package assignment;

class LoginValidator {

    static String[] attempts = {
        "SUCCESS", "FAIL", "FAIL", "SUCCESS",
        "FAIL", "FAIL", "FAIL", "SUCCESS"
    };

    public static void main(String[] args) {
        displayAttempts();
        countFailures();
        checkAccountLock();
    }

    static void displayAttempts() {
        // Task 1
    }

    static void countFailures() {
        // Task 2
    }

    static void checkAccountLock() {
        // Task 3 (3 consecutive FAIL → LOCK)
    }
}
