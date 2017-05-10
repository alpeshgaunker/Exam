import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LightBulbTest {
	
	LightBulb LightBulb1;
	@Before
	public void setUp() throws Exception {
		LightBulb1= new LightBulb(1000);
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(1000,LightBulb1.getEnergy());
	}

}
