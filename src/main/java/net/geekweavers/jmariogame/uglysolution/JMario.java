package net.geekweavers.jmariogame.uglysolution;

/**
 * JMario character : ugly design
 * @author agnes007
 */
public class JMario extends Character {

    public int score;
    public int nbLifes;

    public JMario(int score) {
        this.score = score;
    }


// ################### WITHOUT ENCAPSULATION ##########################
    /**
     * When JMario jumps on a Goomba, it dies and JMario wins 3 points
     * @param other 
     */
    public void jumpOn(Goomba goomba) {
        goomba.die();
        for (int i = 0; i < 3; i++) {
            score++;
            if ((score % 10) == 0) {
                nbLifes++;
            }

        }
    }

    /**
     * When JMario jumps on a Koopa
     * It dies only it hasn't shell and then JMario wins 1 points
     * @param other 
     */
    public void jumpOn(Koopa koopa) {
        // if koopa has a shell, it loses it!
        if (koopa.doesHaveShell()) {
            koopa.setHasShell(false);
        } // if koopa hasn't a shell, it dies!
        else {
            koopa.die();
            score++;
            if ((score % 10) == 0) {
                nbLifes++;
            }
        }
    }

//    // ################### WITH ENCAPSULATION ##########################
//    /**
//     * When JMario jumps on a Goomba, it dies and JMario wins 3 points
//     * @param other 
//     */
//    public void jumpOn(Goomba goomba) {
//        goomba.die();
//        increaseScore(3);
//    }
//
//    /**
//     * When JMario jumps on a Koopa
//     * It dies only it hasn't shell and then JMario wins 1 points
//     * @param other 
//     */
//    public void jumpOn(Koopa koopa) {
//        // if koopa has a shell, it loses it!
//        if (koopa.doesHaveShell()) {
//            koopa.setHasShell(false);
//        } // if koopa hasn't a shell, it dies!
//        else {
//            koopa.die();
//            increaseScore(1);
//        }
//    }
//
//    public void increaseScore(int gain) {
//        while (gain > 0) {
//            score++;
//            if ((score % 10) == 0) {
//                nbLifes++;
//            }
//            gain--;
//        }
//    }
}
