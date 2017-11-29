package testcode;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import testcode.NiceMemberController.Type;
import testcode.item.DvdItem;
import testcode.item.Item;

public class NiceMemberControllerTest2 {

    private NiceMemberController sut;
    
    @Mock
    private IMemberContainer containerMock;
    
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetMember_アダルト会員の場合正常に取得できること() {
        // Setup
        when(containerMock.getAdultMembers()).thenReturn(createAdultMember());
        
        // Exercise
        
        // Verify
    }

    @Test
    public void testGetMember_子供会員の場合正常に取得できること() {
        // Setup
        
        // Exercise
        
        // Verify
    }

    @Test
    public void testGetRentalItemTitles_レンタル中の商品の名前が取得できること() {
        // Setup
        
        // Exercise
        sut.getRentalItemTitles(null, Member.of("前田", 12));
        
        // Verify
    }
    
    private static List<Member> createChildMember() {
        return Arrays.asList(Member.of("前田", 12), Member.of("伊藤", 11), Member.of("佐藤", 10));
    }

    private static List<Member> createAdultMember() {
        return Arrays.asList(Member.of("高橋", 55), Member.of("石田", 33));
    }
    
    private static List<Item> createItems() {
        return Arrays.asList(DvdItem.of("Gifted", 400), DvdItem.of("湯を沸かすほどの熱い愛", 330));
    }
    
}
