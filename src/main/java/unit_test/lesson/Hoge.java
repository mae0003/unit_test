package unit_test.lesson;

public class Hoge {
	
	/**
	 * key が "huga" の場合 "hoge" を返します。
	 * @param key
	 * @return hoge の場合 huga
	 */
	public String getHuga(String key) {
		if (key.equals("h0ge")) {
			return "huga";
		}
		return "";
	}
}
