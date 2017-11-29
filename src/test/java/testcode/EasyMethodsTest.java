package testcode;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.hasItem;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EasyMethodsTest {

    private EasyMethods sut;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        sut = new EasyMethods();
    }

    @Test
    public void testGet100() {
        // Setup
        int expected = 100;
        // Exercise
        int actual = sut.get100();
        // Verify
        assertThat(actual, is(expected));
    }

    @Test
    public void testGetMaedaName() {
        // Setup
        List<String> expected = Arrays.asList("Maeda","Hiroyuki");
        // Exercise
        List<String> actual = sut.getMaedaName();
        // Verify
        assertThat(actual, is(expected));

    }

    @Test
    public void testCreateThreeNumbersGreaterThan100() {
        // Setup
        List<Integer> input = Arrays.asList(10,2333,3444);
        List<Integer> expectedList = Arrays.asList(2333,3444);
        
        // Exercise
        List<Integer> actual = sut.createThreeNumbersGreaterThan100(input);
        
        // Verify
        actual.forEach(value -> {
            assertThat(value >= 100, is(true));
        });
    }

    @Test
    public void testGetGreaterThanAverage() {
        fail("まだ実装されていません");
    }

}
