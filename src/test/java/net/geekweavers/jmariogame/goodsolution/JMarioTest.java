/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.geekweavers.jmariogame.goodsolution;

import junit.framework.TestCase;

/**
 *
 * @author agnes007
 */
public class JMarioTest extends TestCase {

    public JMarioTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testJumpOnGoomba() {
        JMario mario = new JMario(3);
        Goomba goomba = new Goomba();
        mario.jumpOn(goomba);
        assertEquals(4, mario.getScore());
        assertFalse(goomba.isAlive());
        assertEquals(0, mario.getNbLives());
    }

    public void testJumpOnKoopa() {
        JMario mario = new JMario(3);
        Koopa koopa = new Koopa();
        mario.jumpOn(koopa);
        assertEquals(3, mario.getScore());
        assertTrue(koopa.isAlive());
        mario.jumpOn(koopa);
        assertEquals(4, mario.getScore());
        assertFalse(koopa.isAlive());
        assertEquals(0, mario.getNbLives());
    }

    public void testWinLife() {
        JMario mario = new JMario(3);
        Goomba goomba = new Goomba();
        for (int i = 0; i < 10; i++) {
            mario.jumpOn(goomba);
        }
        assertEquals(13, mario.getScore());
        assertEquals(1, mario.getNbLives());
    }

    public void testBlueSuit() {
        JMario mario = new JMario(3);
        Suit buesuit = new BlueSuit();
        mario.setSuit(buesuit);
        mario.onActionButton();
        assertEquals(mario.getMovestatus(), MoveStatus.RUNNING);
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public void testOtherSuit() {
//        JMario mario = new JMario(3);
//        Suit aSuit = mock(Suit.class);
//        mario.setSuit(aSuit);
//        mario.onActionButton();
//        // selective and explicit verification
//        verify(aSuit).execute(mario);
//        verify(aSuit);
//    }



}
