package model.Element;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpriteTest {
	
	private Sprite sprite;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.sprite = new Sprite('W', "Wall.png" );
		
		this.sprite.loadImage();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoadImage() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetImage() {
		assertNotNull(this.sprite.getImage());
	}

	@Test
	public void testGetConsoleImage() {
		final char expected ='W';
		assertEquals(expected, this.sprite.getConsoleImage());
	}

	@Test
	public void testGetImageName() {
		final String expected ="Wall.png";
		assertEquals(expected, this.sprite.getImageName());
	}

}
