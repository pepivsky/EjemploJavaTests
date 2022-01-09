package cardUtils;

public class CardUtil {
    // identificar las tarjetas

    public static boolean isVisa(String cardNumber) {
        // A Visa card starts with 4 and has the length of 16 digits.
        //4235234565431234;
        String visaRegex = "4\\d{3}\\d{4}\\d{4}\\d{4}";

        return cardNumber.matches(visaRegex);

    }
    // A MasterCard starts with the numbers from 51 to 55, or the numbers 2221 to 2720. All have 16 digits
    public static boolean isMasterCard(String cardNumber) {
        //2221234123451234
        String masterCardRegex = "(2221|2720)\\d{12}";
        return cardNumber.matches(masterCardRegex);
    }


    //American Express card numbers start with 34 or 37 and have 15 digits.
    //375987654321001
    public static boolean isAmericanExpress(String cardNumber) {

        String americanRegex = "3[47]\\d{13}";
        return cardNumber.matches(americanRegex);
    }
}
