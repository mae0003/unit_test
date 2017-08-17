package unit_test.lesson1.p1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import unit_test.lesson1.p1.Context;
import unit_test.lesson1.p1.GoldMember;
import unit_test.lesson1.p1.Member;

public class ContextTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void culculatePointTest() {
		Member member = new Member() {		
			@Override
			public int calculatePoint(int basePoint) {
				return 0;
			}
		};
		
		System.out.println(Context.culculatePoint(member, true, 1000));
		System.out.println(Context.culculatePoint(member, false, 1000));
	}

}
