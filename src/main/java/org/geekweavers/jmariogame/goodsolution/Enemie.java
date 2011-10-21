package org.geekweavers.jmariogame.goodsolution;



/**
 *
 * @author agnes007
 */
public abstract class Enemie extends Character{
        /**
     * this method describes what happens when the character be jumped by
     * another character : the jumper
     * @param jumper 
     */
    public abstract void beJumped(Character jumper);
    
     /** this method describes what happens when the character gets in touch with
     *  another character : the contact
     */
    public abstract void getTouched(Character contact);
    
}
