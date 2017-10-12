package class6;

import org.junit.Assert;
import org.junit.Test;

public class StringOperationTest {

	@Test
	public void test() {
		StringOperation so = new StringOperation();
		String input = "Siva";
		char expectedOutput = 'S';
		char output = so.getFirstCharacter(input);
		Assert.assertEquals(expectedOutput, output);
	}

	@Test
	public void testMiddleOccurence() {
		StringOperation so = new StringOperation();
		String input = "Cva";
		char eo = 'v';
		char output = so.getMiddleOccurence(input);
		Assert.assertEquals(eo, output);
		
		
		input = "C";
		eo = 'C';
		output = so.getMiddleOccurence(input);
		Assert.assertEquals(eo, output);
		
		input = "Siva";
		eo = 'C';
		output = so.getMiddleOccurence(input);
		Assert.assertEquals(eo, output);
		
				
	}

}
