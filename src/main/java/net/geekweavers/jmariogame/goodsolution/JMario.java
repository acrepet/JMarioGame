package net.geekweavers.jmariogame.goodsolution;

/**
 * JMario character : good design
 * @author agnes007
 */
public class JMario extends Character {

    private int score;
    private int nbLives;
   // private BlueSuit bluesuit = new BlueSuit();
    private Suit suit;
    private MoveStatus movestatus = MoveStatus.WALKING;

    public JMario(int score) {
        this.score = score;
    }

    public void jumpOn(Landable other) {
        other.onLanded(this);
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public void onActionButton(){
        suit.execute(this);
    }

    public MoveStatus getMovestatus() {
        return movestatus;
    }

    public void setMovestatus(MoveStatus movestatus) {
        this.movestatus = movestatus;
    }


    public void increaseScore() {
        score++;
        if ((score % 10) == 0) {
            nbLives++;
        }
    }

    public int getNbLives() {
        return nbLives;
    }

    public int getScore() {
        return score;
    }
}
