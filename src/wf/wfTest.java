package wf;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class wfTest {

	wf wwf = new wf();
	@Before
	public void setUp() throws Exception {
		wwf = new wf();
	}

	@Test
	public void testAdd() {
		//fail("尚未实现");
	   int x;
	   x=wwf.add(2, 3);
	   assertEquals(5, x);
	}

	@Test
	public void testJian() {
		//fail("尚未实现");
		int x;
		x=wwf.jian(4, 2);
		assertEquals(2, x);
	}

	@Test
	public void testJian1() {
		//fail("尚未实现");
		int x;
		x=wwf.jian(4, 2);
		assertEquals(2, x);
	}

}
