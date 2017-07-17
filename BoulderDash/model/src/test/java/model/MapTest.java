package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {
	
	private Map map;
	
	private int width = 15;
	

	private int height = 15;
	

	private int DiamondNumber = 8;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.map = new Map(1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetWidth() {
		assertEquals(width, this.map.getWidth());
	}

	@Test
	public void testGetHeight() {
		assertEquals(height, this.map.getHeight());
	}

	@Test
	public void testGetIDLevel() {
		final int expected = 1;
		assertEquals(expected, this.map.getIDLevel());
	}

	@Test
	public void testSetIDLevel() {
		final int expected = 1;
		this.map.setIDLevel(expected);
		assertEquals(expected, this.map.getIDLevel());
	}

	@Test
	public void testGetTheMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetElementByPosition() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetElementPosition() {
		fail("Not yet implemented");
	}


	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveEnemy() {
		fail("Not yet implemented");
	}

	@Test
	public void testStartMoveEnemy() {
		fail("Not yet implemented");
	}

	@Test
	public void testApplyGravity() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDiamondNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDiamondNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMobile() {
		fail("Not yet implemented");
	}

}
