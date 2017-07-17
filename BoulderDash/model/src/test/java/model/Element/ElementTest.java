package model.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElementTest {
	
	private Element element;
	
	private static final Sprite SPRITE = new Sprite ('D', "Dirt.png");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.element = new Element(SPRITE, Permeability.PENETRABLE);
	}

	@Test
	public void testGetPermeability() {
		final Permeability expected = Permeability.PENETRABLE;
		assertEquals(expected, this.element.getPermeability());
	}

	@Test
	public void testSetPermeability() {
		assertEquals(Permeability.PENETRABLE, this.element.getPermeability());
	}

	@Test
	public void testGetSprite() {
		final Sprite expected = SPRITE;
		assertEquals(expected, this.element.getSprite());
	}

	@Test
	public void testSetSprite() {
		assertEquals(SPRITE,this.element.getSprite());
	}

	@Test
	public void testGetImage() {
		assertNotNull(this.element.getImage());
	}

	@Test
	public void testGetX() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetX() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetY() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetY() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPosition() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPosition() {
		fail("Not yet implemented");
	}

}
