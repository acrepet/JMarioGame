package org.geekweavers.jmariogame.goodsolution;

/**
 * JMario character : good design
 * @author agnes007
 */
public class JMario extends Character {

    private int score;
    private int nbLifes;

    public JMario(int score) {
        this.score = score;
    }

    public void run() {
        // TODO code application logic here
    }

    public void walk() {
        // TODO code application logic here
    }

    public void jumpOn(Enemy other) {
        other.beJumped(this);
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
