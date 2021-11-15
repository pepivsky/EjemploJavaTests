package util;

import org.junit.Test;
import util.PasswordUtil.SecurityLevel;

import static org.junit.Assert.*;
import static util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {

    // comprobando varios casos

    @Test
    public void weak_when_has_less_8_letters() {
        assertEquals(WEAK, PasswordUtil.checkPasswordSecurity("abc"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.checkPasswordSecurity("abcdefgh"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.checkPasswordSecurity("abcdefg1"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, PasswordUtil.checkPasswordSecurity("12345as_"));
    }

    // ejemplo de test que prueba que una funcion lance una exepcion
    @Test(expected = IllegalArgumentException.class)
    public void negative_number() {
        PasswordUtil.printAPositiveNumber(-2); // llamando a la funcion que lanza una exepcion, si la lanza el test pasa
    }
}