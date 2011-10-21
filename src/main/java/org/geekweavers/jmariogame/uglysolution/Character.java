package org.geekweavers.jmariogame.uglysolution;

/**
 *
 * @author agnes007
 */
public abstract class Character {
    
    public String name;
    
    public boolean isAlive = true;

    public void die() {
        isAlive = false;
    }
    
   
    
}
