package unit_test.lesson2;

import java.util.Date;

// 型を新規ファイルに移動
class Customer {

    Customer() {
    }

    /** ID */
	public String MemberId;
	/** 有効期限 */
	public Date expirationDate;
	/** ランク */
	public String rank;	
	/** ポイント */
	public int point = 0;
	
    boolean isMember() {
        return this.MemberId != null && new Date().after(this.expirationDate);
    }
}