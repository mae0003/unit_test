package unit_test.lesson;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HogeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getHogeTest_正常() {
		Hoge sut =new Hoge();
		
		String actual = sut.getHuga("Hoge");
		String expected = "Huga";
		
		assertThat(actual, is(expected));
	}

	@Test
	public void getHogeTest_異常() {
		Hoge sut =new Hoge();
		
		String actual = sut.getHuga("Hoga");
		String expected = "";
		
		assertThat(actual, is(expected));
	}
	
}
