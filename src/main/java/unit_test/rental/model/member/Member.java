package unit_test.rental.model.member;

public class Member {
	
	public String name;
	public String id;
	public String rank;
	
	/**
	 * コンストラクタ
	 * @param name 名前
	 * @param id   ID 
	 */
	public Member(String name, String id, String rank) {
		super();
		this.name = name;
		this.id = id;
		this.rank = rank;
	}
}
