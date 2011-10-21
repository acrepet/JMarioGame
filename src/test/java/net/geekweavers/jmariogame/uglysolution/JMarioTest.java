/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.geekweavers.jmariogame.uglysolution;

import junit.framework.TestCase;
import net.geekweavers.jmariogame.uglysolution.Goomba;
import net.geekweavers.jmariogame.uglysolution.JMario;
import net.geekweavers.jmariogame.uglysolution.Koopa;

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
        assertEquals(6, mario.score);
        assertFalse(goomba.alive);
        assertEquals(0,mario.nbLifes);
    }

    public void testJumpOnKoopa() {
        JMario mario = new JMario(3);
        Koopa koopa = new Koopa();
        mario.jumpOn(koopa);
        assertEquals(3, mario.score);
        assertTrue(koopa.alive);
        mario.jumpOn(koopa);
        assertEquals(4, mario.score);
        assertFalse(koopa.alive);
        assertEquals(0,mario.nbLifes);
    }
    public void testWinLife() {
        JMario mario = new JMario(3);
        Goomba goomba = new Goomba();
        mario.jumpOn(goomba);
        mario.jumpOn(goomba);
        mario.jumpOn(goomba);
        assertEquals(12, mario.score);
        assertEquals(1,mario.nbLifes);
    }
}
