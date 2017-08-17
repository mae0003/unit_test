package unit_test.lesson1.e1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import unit_test.lesson1.e1.Hoge;

public class HogeTest {

	@Test
	public void getHogeTest_hogeの場合() {
		Hoge sut =new Hoge();
		
		String actual = sut.getHuga("hoge");
		String expected = "huga";
		
		assertThat(actual, is(expected));
	}

	@Test
	public void getHogeTest_hoge以外の場合() {
		Hoge sut =new Hoge();
		
		String actual = sut.getHuga("Hoge");
		String expected = "";
		
		assertThat(actual, is(expected));
	}

	@Test
	public void getHogeTest_nullの場合() {
		Hoge sut =new Hoge();
		
		String actual = sut.getHuga(null);
		String expected = "";
		
		assertThat(actual, is(expected));
	}
}
