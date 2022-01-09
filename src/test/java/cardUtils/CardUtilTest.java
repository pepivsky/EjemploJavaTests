package cardUtils;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardUtilTest {

    @Test
    public void true_when_is_visa() {
        // A Visa card starts with 4 and has the length of 16 digits.
        //String cardNumber = "4235 2345 6543 1234";
        String cardNumber = "4235234565431234";


        assertTrue(CardUtil.isVisa(cardNumber));
    }

    @Test
    public void true_when_is_masterCard() {
        // A Visa card starts with 4 and has the length of 16 digits.
        String cardNumber = "2221234123451234";

        assertTrue(CardUtil.isMasterCard(cardNumber));
    }

    @Test
    public void true_when_is_americanExpress() {
        //American Express card numbers start with 34 or 37 and have 15 digits.
        //375987654321001
        String cardNumber = "375987654321001";

        assertTrue(CardUtil.isAmericanExpress(cardNumber));
    }


}