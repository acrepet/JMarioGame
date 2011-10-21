package org.geekweavers.jmariogame.goodsolution;



/**
 * Goomba Enemy
 * @author agnes007
 */
public class Goomba extends Enemy{

    @Override
    public void beJumped(JMario jumper) {
        super.die();
        jumper.increaseScore(3);
    }


    
}
