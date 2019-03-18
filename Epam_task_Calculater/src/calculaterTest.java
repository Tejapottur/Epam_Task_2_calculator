import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculaterTest {

	@Test
	void testAdd_elements() {
		calculater a=new calculater();
		int a1[]= {3,3,2,1,1};
		assertEquals(10, a.add_elements(5,a1)) ;
	}

	@Test
	void testMultiply_elements() {
		calculater a=new calculater();
		int a1[]= {1,2,3,4,5};
		assertEquals( 120, a.multiply_elements(5, a1)) ;
	}

	@Test
	void testDivision() {
		calculater a=new calculater();
		assertEquals(2, a.division(6, 3)) ;
	}

}
