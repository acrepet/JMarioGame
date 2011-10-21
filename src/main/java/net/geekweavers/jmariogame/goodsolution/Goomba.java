package net.geekweavers.jmariogame.goodsolution;

/**
 * Goomba Landable
 * @author agnes007
 */
public class Goomba extends Character implements Killable,Landable {

    @Override
    public void onLanded(JMario jumper) {
        die();
        jumper.increaseScore();
    }

    public void die() {
        setAlive(false);
        // playSound();
    }
}
