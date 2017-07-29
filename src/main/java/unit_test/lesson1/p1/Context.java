package unit_test.lesson1.p1;

public class Context {
	
	/**
	 * ポイントを計算します。
	 * 
	 * @param instance メンバー
	 * @param isCampaine キャンペーン中かどうかをしめす値
	 * @param basePoint 基本ポイント
	 * @return ポイント
	 */
	static int culculatePoint(Member member, boolean isCampaine, int basePoint) {
		
		if (isCampaine) {
			return member.calculatePoint(basePoint);
		}
		
		return basePoint;
	}
}
