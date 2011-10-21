/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.geekweavers.jmariogame.goodsolution;

/**
 * The default suit : the very famous one!
 * @author agnes007
 */
public class BlueSuit implements Suit{


    public void execute(JMario jmario) {
        // Nothing unless one step!
        jmario.setMovestatus(MoveStatus.RUNNING);
    }
    
}
