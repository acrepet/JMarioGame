package net.geekweavers.jmariogame.goodsolution;

/**
 * Character
 * @author agnes007
 */
public abstract class Character {

    private String name;
    private boolean alive = true;

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }
}
