package testcode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static testcode.TestSingleton.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSingletonTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void kakunin_test1() {
        assertThat(getInstance().getCallNumber(), is(1));
    }

    @Test
    public void test2() {
        assertThat(getInstance().getCallNumber(), is(2));
    }

    @Test
    public void test3() {
        assertThat(getInstance().getCallNumber(), is(3));
    }
}
