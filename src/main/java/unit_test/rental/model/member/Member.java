package unit_test.rental.model.member;

public class Member {
	
	public String name;
	public String id;
	public String rank;
	public int point = 0;
	
	/**
	 * 会員クラスです
	 * @param name 会員名
	 * @param id   ID 
	 */
	public Member(String name, String id, String rank) {
		super();
		this.name = name;
		this.id = id;
		this.rank = rank;
	}
}
