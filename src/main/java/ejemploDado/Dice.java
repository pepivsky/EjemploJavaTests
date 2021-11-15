package ejemploDado;

import java.util.Random;

public class Dice {

    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    // metodo que lanza el dado y devuelve un numero aleatorio entre 1 y sides
    public int roll() {
        //
        return new Random().nextInt(sides) + 1;
    }
}
