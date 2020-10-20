import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author graffion
 *
 */
public class MyDateTest extends TestCase {

    /**
     * Test method for {@link MyDate#getDay()}.
     */
	@Test
    public void testGetDay() {
        MyDate d = new MyDate(31, 12, 2006);
        assertEquals(31, d.getDay());
    }

    /**
     * Test method for {@link MyDate#getMonth()}.
     */
	@Test
    public void testGetMonth() {
    	MyDate d = new MyDate(31, 12, 2006);
       assertEquals( 12,d.getMonth());
    }

    /**
     * Test method for {@link MyDate#getYear()}.
     */
	@Test
    public void testGetYear() {
    	  MyDate d = new MyDate(31, 12, 2006);
    	  assertEquals(2006,d.getYear());
    }

    /**
     * Test method for {@link MyDate#checkData()} .
     */
	@Test
    public void testCheckData() {
    	MyDate d = new MyDate(31, 12, 2006);
    	assertTrue(d.checkData());
    	
    }

    /**
     * Test simple valid dates
     */
	@Test
    public void testSimpleValidDates() {
        boolean b = MyDate.isValidDate(1, 1, 2000);
        assertTrue(b);
        b = MyDate.isValidDate(25, 12, 2000);
        assertTrue(b);
    }

    /**
     * Test simple invalid dates
     */
	@Test
    public void testSimpleInvalidDateJours() {
        boolean b = MyDate.isValidDate(0, 1, 2000);
        assertFalse(b);
        b = MyDate.isValidDate(32, 12, 2000);
        assertFalse(b);
    }
    
    
    
    /**
     * Test simple invalid dates
     */	
	@Test
    public void testSimpleInvalidDateJoursMonth() {
        boolean b = MyDate.isValidDate(1, 0, 2000);
        assertFalse(b);
        b = MyDate.isValidDate(10, 13, 2000);
        assertFalse(b);
    }
    
    /**
     * Test simple invalid dates
     */
	@Test
    public void testSimpleInvalidDateAnnne() {
        boolean b = MyDate.isValidDate(10, 1, 2013);
        assertFalse(b);
        b = MyDate.isValidDate(12, 12, 1812);
        assertFalse(b);
    }
    

    /**
     * Test valid limit dates
     */
	@Test
    public void testValidLimitDates() {
        boolean b = MyDate.isValidDate(30, 4, 2000);
        assertTrue(b);
        b = MyDate.isValidDate(30, 6, 2000);
        assertTrue(b);
        b = MyDate.isValidDate(30, 9, 2000);
        assertTrue(b);
        b = MyDate.isValidDate(30, 11, 2000);
        assertTrue(b);
        
    }

    /**
     * Test invalid limit dates
     */
	@Test
    public void testInvalidLimitDates() {
        boolean b = MyDate.isValidDate(31, 4, 2000);
        assertFalse(b);
        b = MyDate.isValidDate(31, 6, 2000);
        assertFalse(b);
        b = MyDate.isValidDate(31, 9, 2000);
        assertFalse(b);
        b = MyDate.isValidDate(31, 11, 2000);
        assertFalse(b);
        
    }

    /**
     * Test February valid limit dates
     */
	@Test
    public void testFebruaryValidLimitDates() {
        boolean b =MyDate.isValidDate(28, 2, 2001);
        assertTrue(b);
        b = MyDate.isValidDate(29, 2, 2000);
        assertTrue(b);
        

    }

    /**
     * Test February invalid limit dates
     */
	@Test
    public void testFebruaryInvalidLimitDates() {
        boolean b = MyDate.isValidDate(29, 2, 2001);
        assertFalse(b);
        b = MyDate.isValidDate(30, 2, 2000);
        assertFalse(b);
    }

    /**
     * Test   Next dates
     */
	@Test
    public void testNextDay() {
    	MyDate b = new MyDate(30,1,2000);
    	b.nextDay();
    	assertEquals(31,b.getDay());
    	
    	b = new MyDate(31,1,2000);
    	b.nextDay();
    	assertEquals(1,b.getDay());
    	assertEquals(2,b.getMonth());
    	
    	b = new MyDate(28,2,2000);
    	b.nextDay();
    	assertEquals(29,b.getDay());
    	
    	b = new MyDate(29,2,2000);
    	b.nextDay();
    	assertEquals(1,b.getDay());
      	assertEquals(3,b.getMonth());
      	
    	b = new MyDate(28,2,2001);
    	b.nextDay();
    	assertEquals(1,b.getDay());
      	assertEquals(3,b.getMonth());
      	
    	b = new MyDate(29,4,2000);
    	b.nextDay();
    	assertEquals(30,b.getDay());
    	
       	b = new MyDate(30,4,2000);
    	b.nextDay();
    	assertEquals(1,b.getDay());
    	assertEquals(5,b.getMonth());
    	

      	
      	b = new MyDate(31,12,2000);
    	b.nextDay();
    	assertEquals(1,b.getDay());
      	assertEquals(1,b.getMonth());
      	assertEquals(2001,b.getYear());
    	
    }
	
	@Test
	public void testNextDayWithParam() {
	MyDate e = MyDate.nextDay(30, 1, 2000);
    assertEquals(31,e.getDay());
	
	MyDate e1 = MyDate.nextDay(31, 1, 2000);
    assertEquals(1,e1.getDay());
	assertEquals(2,e1.getMonth());
	
	MyDate e2 = MyDate.nextDay(28, 1, 2000);
    assertEquals(29,e2.getDay());
	
	MyDate e3 = MyDate.nextDay(29, 2, 2000);
    assertEquals(1,e3.getDay());
    assertEquals(3,e3.getMonth());
	
		
	}
	
	@Test
	public void testmaxDayOfMonth() {
   	assertEquals(30,MyDate.maxDayOfMonth(4));
   	assertEquals(28,MyDate.maxDayOfMonth(2));
   	assertEquals(29,MyDate.maxDayOfMonth(2,2000));
		
	}
}


