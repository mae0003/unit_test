package testcode;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;


public class MemberContainerTest {

    private MemberContainer sut;
    private static List<Member> members;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        members = createMembers();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        sut = new MemberContainer(members);
    }

    private static List<Member> createMembers() {
        InputStream ios = MemberContainerTest.class.getResourceAsStream("member.yaml");
        Yaml yaml = new Yaml();
        // YAMLから読み込んだドキュメント情報
        List<Member> members = new ArrayList<>();
        List<LinkedHashMap<?, ?>> list = yaml.loadAs(ios, List.class);
        
        list.forEach(map -> members.add(new Member((String)map.get("name"), (Integer)map.get("age"))));
        return members;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAdultTest() {
        List<Member> actual = sut.getAdultMembers();
        
        assertThat(actual, hasItems(new Member("ジョージ", 89)));
        assertThat(actual, hasItems(new Member("仲本", 20)));
        assertThat("AAA", anyOf(is("AAA"), not("BBB")));
        assertThat("AAA", anyOf(is("BBB"), not("BBB")));
        assertThat("AAA", anyOf(is("BBB"), not("AAA")));
        assertThat("AAA", anyOf(is("AAA")));
        assertThat("AAA", is("AAA"));
    }

    @Test
    public void getChildTest() {
        
    }

}
