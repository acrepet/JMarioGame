package org.geekweavers.jmariogame.goodsolution;

import java.lang.Math;

/**
 * JMario character
 * @author agnes007
 */
public class JMario extends Character{
    
    private int score;


    public void run() {
        // TODO code application logic here
    }
    public void walk() {
        // TODO code application logic here
    }
    public void jumpOn(Enemie other) {
        other.beJumped(other);
    }

    public void increaseScore(int nbpoints) {
        score = score + nbpoints;
    }


    
    
}
