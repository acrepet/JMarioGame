package net.geekweavers.jmariogame.uglysolution;

/**
 * an Enemy : a Koopa
 * @author agnes007
 */
public class Koopa extends Character {

    private boolean hasShell = true;

    public boolean hasShell() {
        return hasShell;
    }

    public void setHasShell(boolean hasShell) {
        this.hasShell = hasShell;
    }
    
       /**
     * When JMario jumps on a Koopa
     * It dies only it hasn't shell and then JMario wins 1 points
     * @param other 
     */
    public void react(JMario jumper) {
        // if koopa has a shell, it loses it!
        if (hasShell()) {
           setHasShell(false);
        } // if koopa hasn't a shell, it dies!
        else {
            die();
            jumper.score++;
        }
    }
}




//            if ((jumper.score % 10) == 0) {
//                jumper.nbLives++;
//            }