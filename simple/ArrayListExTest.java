package simple;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ArrayListExTest {
	ArrayListEx a=null;
	@Before
	public void setUp() throws Exception {
		a=new ArrayListEx();
	}
	
	@After
	public void tearDown() throws Exception {
		a=null;
	}

	@Test
	public void testMain() {
		assertEquals(2, a.check());
	}

}
