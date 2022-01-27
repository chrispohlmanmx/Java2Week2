/**
 * @author Christopher Pohlman - cmpolhman
 * CIS175 - Spring 2022
 * Jan 27, 2022
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Cheese;

/**
 * 
 */
public class CheeseTest2 {

	String info = "Smoked Gouda is a Gouda and it was aged for 1 years.";
	Cheese gouda = new Cheese("Smoked Gouda", "Gouda", 1);
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInfo() {
		assertEquals(info, gouda.printCheeseInfo());
	}

}
