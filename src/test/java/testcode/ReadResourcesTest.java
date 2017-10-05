package testcode;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.IsNot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReadResourcesTest {

    ReadResources sut;
    
    @Before
    public void setUp() throws Exception {
        sut = new ReadResources();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        sut.readYaml();
    }

    @Test
    public void matcherTest() {
        String actual = "actual";
        List<String> actualList = Arrays.asList("aaa","mae");

        assertThat(actual, is("actual"));
        assertThat(actual, is(not("bbb")));
        assertThat(actual, not("aasa"));
        assertThat(actualList, allOf(notNullValue()));
        assertThat(actualList, anyOf(notNullValue()));
    }

}
