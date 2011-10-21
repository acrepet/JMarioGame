package org.geekweavers.jmariogame.goodsolution;



/**
 * Goomba Enemy
 * @author agnes007
 */
public class Goomba extends Enemy{

    @Override
    public void onLanded(JMario jumper) {
        die();
        jumper.increaseScore(3);
    }


    
}
