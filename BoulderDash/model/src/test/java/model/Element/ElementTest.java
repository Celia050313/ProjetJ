package model.Element;

import  org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

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

	/**
	 * tests if getX sends back x
	 */
	
	@Test
	public void testGetX() {
		Element.x =3;
		assertEquals(Element.x,Element.getX());
	}

	/**
	 * tests if setX affects the right number to x
	 */

	@Test
	public void testSetX() {
		int expectedX = 40;
	    Element.setX(expectedX);
	    assertEquals(expectedX, Element.getX());
	}

	/**
	 * tests if getY sends back y
	 */
	
	@Test
	public void testGetY() {
		Element.y =32;
		assertEquals(Element.y,Element.getY());
	}

	/**
	 * tests if setY affects the right number to y
	 */
	
	@Test
	public void testSetY() {
		int expectedY = 16;
	    Element.setY(expectedY);
	    assertEquals(expectedY, Element.getY());
	}

}
