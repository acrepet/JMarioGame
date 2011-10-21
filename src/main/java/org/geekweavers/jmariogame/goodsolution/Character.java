package org.geekweavers.jmariogame.goodsolution;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author agnes007
 */
public abstract class Character {
    
    private String name;
    
    private boolean isAlive = true;

    public void die() {
        isAlive = false;
    }
    

    
}
