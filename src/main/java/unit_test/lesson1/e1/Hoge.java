package unit_test.lesson1.e1;

public class Hoge {
	
	/**
	 * key が "huga" の場合 "hoge" を返します。
	 * @param key
	 * @return hoge の場合 huga
	 */
	public String getHuga(String key) {
		if (key != null && key.equals("hoge")) {
			return "huga";
		}
		return "";
	}
}
