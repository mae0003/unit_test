package unit_test.rental.model.media;

import java.util.List;

public class DvdContainer {

	private static DvdContainer instance = new DvdContainer();
	
	private List<Dvd> dvdList;
	
	private DvdContainer() {
	}
	
	public static DvdContainer getInstance() {
		return instance;
	}

	/**
	 * すべてのDVDを取得します
	 * @return DVDのリスト
	 */
	public List<Dvd> getAll(){
		return dvdList;
	}
	
	/**
	 * レンタル中のDVDのリストを取得します。
	 * @return DVDのリスト
	 */
	public List<Dvd> getRentaled() {
		// todo:
		return null;
	}
	
	/**
	 * 指定されたタイトルのDVDを取得します。
	 * @return DVD
	 */
	public Dvd get(String name) {
		return null;
	}
}
