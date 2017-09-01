package unit_test.lesson2;

import java.util.Date;

/**
 * リファクタリング研修用クラスです
 */
public class Refactorring {
    private User user = new User();

    // 説明用変数の導入
    public void 説明用変数の導入(ShoppingCart shoppingcart) {
        
        if(user.isMember()) {
            shoppingcart.SetMemberDiscount(true);
            //...
        }
        
        // ....
        // ....
        String message;
        outputResult(shoppingcart);
    }

    private void outputResult(ShoppingCart shoppingcart) {
        String message;
        if(user.isMember()) {
            int totalAmount = shoppingcart.calculateAmount();
            message = "合計金額: XXXX円";
            
        } else {
            message = "このお客様は会員ではありません。";
            return;
        }
    }

    // 型を新規ファイルに移動
    private class User {
        /** ID */
        public String MemberId;
        /** 有効期限 */
        public Date expirationDate;
        /** ランク */
        public String rank; 
        /** ポイント */
        public int point = 0;
        
        public boolean isMember() {
            return user.MemberId != null && new Date().after(user.expirationDate);
        }
    }
}
