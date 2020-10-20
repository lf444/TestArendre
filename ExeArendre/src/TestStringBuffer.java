import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.StringBuffer;

public class TestStringBuffer  {
	
	private StringBuffer sb;

	@Before
	public void setUp() throws Exception {
		this.sb = new StringBuffer("abc");

	}

	@After
	public void tearDown() throws Exception {
		this.sb= null;
	}

	@Test
	public void testCharAtZero() {	
		assertEquals('a',sb.charAt(0));

	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testNegativeCharAt() {
		sb.charAt(-1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testOverCharAt() {
		sb.charAt(500);
	}
	
	@Test
	public void testSetCharAtZero() {
		sb.setCharAt(0, 'l');
		assertEquals('l',sb.charAt(0));

	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testSetNegativeCharAt() {
		sb.setCharAt(-1,'y');
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testSetOverCharAt() {
		sb.setCharAt(500,'y');
	}
	
	@Test
	public void testAppend() {
		sb.append("defg");
		assertEquals('g',sb.charAt(6));

	}
	
	@Test
	public void testAppendWithNullString () {
		sb.append((String)null);
	}
	
	
	
	
}
