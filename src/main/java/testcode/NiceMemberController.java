package testcode;

import java.util.List;
import java.util.stream.Collectors;

import testcode.MemberControler.Type;
import testcode.item.Item;
import testcode.rental.RentalManager;

public class NiceMemberController {
    
    public enum Type {
        Adult,
        Child
    }

    // メンバーコンテナ
    private IMemberContainer container;

    /**
     * コンストラクタです。
     * 
     * @param container メンバーコンテナ
     */
    public NiceMemberController(IMemberContainer container) {
        this.container = container;
    }
    
    /**
     * 指定された会員種別のメンバー名を取得します。
     * 
     * @param type 会員種別
     * @return メンバー名のリスト
     */
    public List<String> getMember(Type type) {
        
        if(type == Type.Adult) {
            return container.getAdultMembers().stream().map(item -> item.name).collect(Collectors.toList());
        } else if (type == Type.Child) {
            return container.getChildMembers().stream().map(item -> item.name).collect(Collectors.toList());
        }

       throw new IllegalStateException();
    }
    
    /**
     * 会員がレンタルしている作品名を取得します。
     */
    public List<String> getRentalItemTitles(RentalManager rentalManager, Member member) {
        
        List<Item> items = rentalManager.getRentaledItems(member);
        return items.stream().map(item -> item.getName()).collect(Collectors.toList());
    }

}
