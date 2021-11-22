package util;

import org.junit.Test;

import static org.junit.Assert.*;

/* ejercicio
Implementa esta función, y crea una clase StringUtilTest añadiendo tests que prueben varios escenarios:
Probar que un string cualquiera no es vacío
Probar que “” es un string vacío
Probar que null también es un string vacío
Extra: un string con espacios " " también lo queremos considerar como vacío (pista: puedes usar la función trim)
 */

public class StringUtilTest {

    @Test
    public void true_when_empty_string() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void true_when_null() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void true_when_whitespace() {
        assertTrue(StringUtil.isEmpty(" "));
    }
}