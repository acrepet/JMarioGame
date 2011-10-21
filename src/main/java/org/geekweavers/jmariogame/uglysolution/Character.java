package org.geekweavers.jmariogame.uglysolution;

/**
 *
 * @author agnes007
 */
public abstract class Character {
    
    public String name;
    
    public boolean alive = true;

    public void die() {
        alive = false;
    }
    
   
    
}
