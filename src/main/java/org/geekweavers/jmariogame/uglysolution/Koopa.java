package org.geekweavers.jmariogame.uglysolution;

/**
 * an Enemie : a Koopa
 * @author agnes007
 */
public class Koopa extends Character {

    private boolean hasShell = true;

    public boolean doesHaveShell() {
        return hasShell;
    }

    public void setHasShell(boolean hasShell) {
        this.hasShell = hasShell;
    }


}
