package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Element.Mobile.IMobile;

public class BoulderDashModelTest {
	
	private BoulderDashModel model;

	private IMap map;
	
	private IMobile hero;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.model = new BoulderDashModel(1, 2, 2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMap() {
		final IMap expected = map;
		assertEquals(expected, this.model.getMap());
	}

	@Test
	public void testGetHero() {
		final IMobile expected = hero;
		assertEquals(hero, this.model.getHero());
	}

}
