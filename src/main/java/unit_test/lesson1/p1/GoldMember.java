package unit_test.lesson1.p1;

public class GoldMember implements Member {
	
	@Override
	public int calculatePoint(int basePoint) {
		return basePoint * 3;
	}
}
