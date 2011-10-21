package net.geekweavers.jmariogame.uglysolution;

/**
 * a Goomba
 * @author agnes007
 */
public class Goomba extends Character {

    public void blowUp(JMario jumper) {
        die();
        jumper.score = jumper.score + 3;
    }
}








//        for (int i = 0; i < 3; i++) {
//            jumper.score++;
//            if ((jumper.score % 10) == 0) {
//                jumper.nbLifes++;
//            }
//
//        }