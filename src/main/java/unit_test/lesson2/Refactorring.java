package unit_test.lesson2;

import java.util.Date;

/**
 * リファクタリング研修用クラスです
 */
public class Refactorring {
	private User user = new User();

	// 説明用変数の導入
	public void 説明用変数の導入(ShoppingCart shoppingcart) {
		
		// 会員の場合
		if(user.MemberId != null && new Date().after(user.expirationDate)) {
			shoppingcart.SetMemberDiscount(true);
			//...
		}
		
		// ....
		// ....
		String message;
		// 会員の場合
		if(user.MemberId != null && new Date().after(user.expirationDate)) {
			int totalAmount = shoppingcart.calculateAmount();
			message = "合計金額: XXXX円";
			
		} else {
			message = "このお客様は会員ではありません。";
			return;
		}
	}
	
	
	// インターフェースの抽出
	public class Player {
		
		private Video video;

		public Player() {
			super();
			video = new Video();
		}
				
		public void play() {
			video.play();
		}
	}
	
	public class Video {
		
		public void play() {
			System.out.println("映像でも流します。");
		}
		
		public void stop() {
			System.out.println("映像でも停止します。");
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
	}
}
