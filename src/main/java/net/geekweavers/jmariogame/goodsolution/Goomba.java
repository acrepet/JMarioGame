package net.geekweavers.jmariogame.goodsolution;

/**
 * Goomba Enemy
 * @author agnes007
 */
public class Goomba extends Enemy implements Killable {

    @Override
    public void onLanded(JMario jumper) {
        die();
        jumper.increaseScore(3);
    }

    public void die() {
        setAlive(false);
        // playSound();
    }
}
