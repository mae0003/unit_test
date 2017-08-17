package unit_test.lesson1.p1.bad;

public class BadContext {
	
	/**
	 * ポイントを計算します。
	 * 
	 * @param member メンバー
	 * @param isCampaine キャンペーン中かどうかをしめす値
	 * @param basePoint 基本ポイント
	 * @return ポイント
	 */
	static int culculatePoint(BadMember member, boolean isCampaine, int basePoint) {
		
		if (isCampaine) {
			if (member.type == "gold") {
				return basePoint * 3;
			} else if (member.type == "silver") {
				return basePoint * 2;
			}
 		}
		
		return basePoint;
	}
}
