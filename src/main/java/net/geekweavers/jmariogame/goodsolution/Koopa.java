package net.geekweavers.jmariogame.goodsolution;

/**
 * Koopa Landable
 * @author agnes007
 */
public class Koopa extends Character implements Killable,Landable {

    private boolean hasShell = true;

    public boolean hasShell() {
        return hasShell;
    }

    public void setHasShell(boolean hasShell) {
        this.hasShell = hasShell;
    }

    @Override
    public void onLanded(JMario jumper) {
        // if koopa has a shell, it loses it!
        if (this.hasShell()) {
            this.setHasShell(false);
        } // if koopa hasn't a shell, it dies!
        else {
            die();
            jumper.increaseScore();
        }
    }

    public void die() {
        setAlive(false);
    }
}
