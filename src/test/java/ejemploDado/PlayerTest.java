package ejemploDado;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    // test sin mockito
    @Test
    public void without_mockito_looses_when_dice_number_is_too_low() { // este test a veces pasa y a veces no porque trabaja con valores aleorios, para eso hay que crear un mock de la clase dice
        Dice dice = new Dice(6);
        Player player = new Player(dice, 4);
        assertEquals(false, player.play());
    }

    // test con mockito que prueba cuando el jugador pierde
    @Test
    public void looses_when_dice_number_is_too_low() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2); // cuando se llame al metodo entonces siempre debe retornar 2

        Player player = new Player(dice, 4);
        //assertEquals(false, player.play());
        assertFalse(player.play()); // forma simplificada
    }

    // test con mockito que prueba cuando el jugador gana
    @Test
    public void wins_when_dice_number_is_bigger() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(5);

        Player player = new Player(dice, 4);
        assertEquals(true, player.play());
    }
}