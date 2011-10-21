package net.geekweavers.jmariogame.uglysolution;

/**
 * JMario character : ugly design
 * @author agnes007
 */
public class JMario extends Character {

    public int score;
    public int nbLives;

    public JMario(int score) {
        this.score = score;
    }

    /**
     * what happens when JMario jumps on an enemy
     * @param other 
     */
    public void jumpOn(Character enemy) {
        // When JMario jumps on a Goomba, it dies and JMario wins 3 points
        if (enemy instanceof Goomba) {
            Goomba goomba = (Goomba) enemy;
            goomba.blowUp(this);
        }
        //When JMario jumps on a Koopa
        // It dies only it hasn't shell and then JMario wins 1 points
        else if (enemy instanceof Koopa) {
            Koopa koopa = (Koopa) enemy;
            koopa.react(this);
        }
    }
}
