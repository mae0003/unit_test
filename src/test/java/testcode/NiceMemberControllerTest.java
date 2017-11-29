package testcode;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NiceMemberControllerTest {

    private NiceMemberController sut;
    private IMemberContainer containerStub;
    
    @Before
    public void setUp() throws Exception {
        // テスト開始毎に sut を初期化します。
        // しかし sut の生成には member コンテナが必要です。
        // しかも member コンテナの実装はよくわからないしわかりたくもありません。
        // sut = new NiceMemberController();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetMember_アダルト会員の場合正常に取得できること() {
        fail("まだ実装されていません");
    }

    @Test
    public void testGetMember_子供会員の場合正常に取得できること() {
        fail("まだ実装されていません");
    }
    
    private static List<Member> createChildMember() {
        return Arrays.asList(Member.of("前田", 12), Member.of("伊藤", 11), Member.of("佐藤", 10));
    }

    private static List<Member> createAdultMember() {
        return Arrays.asList(Member.of("高橋", 55), Member.of("石田", 33));
    }
}
