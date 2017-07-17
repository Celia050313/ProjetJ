package model.Element.Mobile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IMap;
import model.Element.Permeability;
import model.Element.Sprite;

public class MobileTest {
	
	private Mobile mobile;
	
	private Sprite sprite = new Sprite('E', "Enemy.png");
	
	private IMap map;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.mobile = new Mobile(sprite, Permeability.BLOCKING, map);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMoveUp() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveDown() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveRight() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveLeft() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoNothing() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMap() {
		final IMap expected = map;
		assertEquals(expected, this.mobile.getMap());
	}

	@Test
	public void testIsAlive() {
		assertTrue(this.mobile.isAlive());
	}

	@Test
	public void testDie() {
		assertFalse(this.mobile.isAlive());
	}

	@Test
	public void testHasWon() {
		assertFalse(this.mobile.hasWon());
	}

	@Test
	public void testWin() {
		//this.mobile.win();
		assertTrue(this.mobile.hasWon());
	}

}
