package net.geekweavers.jmariogame.goodsolution;

/**
 * JMario character : good design
 * @author agnes007
 */
public class JMario extends Character {

    private int score;
    private int nbLives;
    private BlueSuit bluesuit = new BlueSuit();
    private MoveStatus movestatus = MoveStatus.WALKING;

    public JMario(int score) {
        this.score = score;
    }

    public void jumpOn(Landable other) {
        other.onLanded(this);
    }


    public void onActionButton(){
        bluesuit.execute(this);
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
