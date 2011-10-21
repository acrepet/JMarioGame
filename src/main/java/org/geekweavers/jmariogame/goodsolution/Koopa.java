package org.geekweavers.jmariogame.goodsolution;

/**
 * Koopa Enemy
 * @author agnes007
 */
public class Koopa extends Enemy {

    private boolean hasShell = true;

    public boolean doesHaveShell() {
        return hasShell;
    }

    public void setHasShell(boolean hasShell) {
        this.hasShell = hasShell;
    }

    @Override
    public void onLanded(JMario jumper) {
        // if koopa has a shell, it loses it!
        if (this.doesHaveShell()) {
            this.setHasShell(false);
        } // if koopa hasn't a shell, it dies!
        else {
            die();
            jumper.increaseScore(1);
        }
    }
}
