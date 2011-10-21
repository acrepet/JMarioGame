package net.geekweavers.jmariogame.goodsolution;

/**
 *
 * @author agnes007
 */
public interface Landable{

    /**
     * this method describes what happens when the character be jumped by
     * another character : the jumper
     * @param jumper 
     */
    public abstract void onLanded(JMario jumper);
}
