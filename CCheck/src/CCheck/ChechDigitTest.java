package CCheck;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChechDigitTest {

	
	@Test
	public void test() {
	assertTrue("Valid for Credit Card #",ChechDigit.check("4388576018410707"));
	assertFalse("Not valid for Credit Card #",ChechDigit.check("4246345689049834"));

	}



	
	
}
