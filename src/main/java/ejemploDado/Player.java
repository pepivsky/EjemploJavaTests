package ejemploDado;

public class Player {

    private Dice dice;
    private int minNumberToWin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    // metodo para que el jugador juegue lanzando el dado, el jugador gana cuando saca un numero mayor que el minNumberToWin
    public boolean play() {
        int diceNumber = dice.roll();
        return diceNumber >= minNumberToWin;
    }
}
