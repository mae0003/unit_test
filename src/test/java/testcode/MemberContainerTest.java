package testcode;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import com.google.common.collect.LinkedHashMultiset;

public class MemberContainerTest {

    private IMemberContainer sut;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        List<Member> members = createMembers();
        sut = new MemberContainer(members);
    }

    private List<Member> createMembers() {
        InputStream ios = this.getClass().getResourceAsStream("member.yaml");
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
    public void test() {
        sut.getAdultMembers().forEach(item -> System.out.println(item.name));
    }

}
