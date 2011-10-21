package net.geekweavers.jmariogame.goodsolution;

/**
 * JMario character : good design
 * @author agnes007
 */
public class JMario extends Character {

    private int score;
    private int nbLifes;
    private Suit suit;
    private MoveStatus movestatus;

    public JMario(int score) {
        this.score = score;
    }

    public void jumpOn(Enemy other) {
        other.onLanded(this);
    }
    
    public void walk(){
        setMovestatus(MoveStatus.WALKING);
        suit.execute(this);   
    }

    public MoveStatus getMovestatus() {
        return movestatus;
    }

    public void setMovestatus(MoveStatus movestatus) {
        this.movestatus = movestatus;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    

    public void increaseScore(int gain) {
        while (gain > 0) {
            score++;
            if ((score % 10) == 0) {
                nbLifes++;
            }
            gain--;
        }
    }

    public int getNbLifes() {
        return nbLifes;
    }

    public int getScore() {
        return score;
    }
    
}
