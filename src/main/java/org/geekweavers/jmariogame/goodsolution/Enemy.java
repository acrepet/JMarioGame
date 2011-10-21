package org.geekweavers.jmariogame.goodsolution;

/**
 *
 * @author agnes007
 */
public abstract class Enemy extends Character {

    /**
     * this method describes what happens when the character be jumped by
     * another character : the jumper
     * @param jumper 
     */
    public abstract void onLanded(JMario jumper);
}
