package model.Element;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElementTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetX() {
		Element.x =3;
		assertEquals(Element.x,Element.getX());
	}


	@Test
	public void testSetX() {
		int expectedX = 40;
	    Element.setX(expectedX);
	    assertEquals(expectedX, Element.getX());
	}

	@Test
	public void testGetY() {
		Element.y =32;
		assertEquals(Element.y,Element.getY());
	}

	@Test
	public void testSetY() {
		int expectedY = 16;
	    Element.setY(expectedY);
	    assertEquals(expectedY, Element.getY());
	}

}
