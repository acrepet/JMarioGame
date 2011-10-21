/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geekweavers.jmariogame.goodsolution;

import org.geekweavers.jmariogame.goodsolution.*;
import junit.framework.TestCase;
import org.geekweavers.jmariogame.goodsolution.Goomba;
import org.geekweavers.jmariogame.goodsolution.JMario;
import org.geekweavers.jmariogame.goodsolution.Koopa;

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
        assertEquals(6, mario.getScore());
        assertFalse(goomba.isAlive());
        assertEquals(0,mario.getNbLifes());
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
        assertEquals(0,mario.getNbLifes());
    }
    public void testWinLife() {
        JMario mario = new JMario(3);
        Goomba goomba = new Goomba();
        mario.jumpOn(goomba);
        mario.jumpOn(goomba);
        mario.jumpOn(goomba);
        assertEquals(12, mario.getScore());
        assertEquals(1,mario.getNbLifes());
    }
}