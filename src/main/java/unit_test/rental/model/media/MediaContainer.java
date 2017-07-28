package unit_test.rental.model.media;

import java.util.List;

public class MediaContainer {
	
	private List<Media> mediaList;
	
	/**
	 * すべてのメディアのリストを取得します。
	 * @return メディアリスト
	 */
	public List<Media> getAll(){
		return mediaList;
	}
	
	/**
	 * レンタル中のメディアのリストを取得します。
	 * @return
	 */
	public List<Media> getRentaled() {
		// todo:
		return null;
	}
	
	/**
	 * 指定の名前と種別のメディアを取得します。
	 * @return
	 */
	public Media get(String name) {
		return null;
	}
}
