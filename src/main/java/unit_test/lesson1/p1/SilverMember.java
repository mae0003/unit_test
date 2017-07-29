package unit_test.lesson1.p1;

public class SilverMember extends Member {
	
	@Override
	public int calculatePoint(int basePoint) {
		return basePoint * 2;
	}
}
