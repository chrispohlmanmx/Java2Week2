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
public class CheeseTest {
	
	Cheese whiteCheddar = new Cheese("White Cheddar", "Cheddar", 2);
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testName() {
		whiteCheddar.setName("Praire Breeze");
		assertTrue("Praire Breeze" == whiteCheddar.getName());
	}
	
	@Test
	public void testAgeNotNull() {
		assertNotNull(whiteCheddar.getAge());
	}

}
