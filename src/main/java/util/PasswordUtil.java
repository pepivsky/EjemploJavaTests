package util;

public class PasswordUtil {

    enum SecurityLevel {
        WEAK,MEDIUM, STRONG;
    }

    public static SecurityLevel checkPasswordSecurity(String password) {
        if (password.length() <  8) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z]+")) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z0-9]+")) {
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }

    public static String printAPositiveNumber(int number) {
        if (number < 0 ) {
            throw new IllegalArgumentException("Negative number not allowed");
        }
        return String.valueOf(number);
    }
}
