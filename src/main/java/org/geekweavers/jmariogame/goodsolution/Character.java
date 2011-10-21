package org.geekweavers.jmariogame.goodsolution;

/**
 * Character
 * @author agnes007
 */
public abstract class Character implements Killable {

    private String name;
    private boolean alive = true;

    @Override
    public void die() {
        alive = false;
    }

    public boolean isAlive() {
        return alive;
    }
}
