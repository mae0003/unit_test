package unit_test.rental.model.media;

import java.util.List;

public class MediaContainer {
	
	private List<Media> mediaList;
	
	/**
	 * すべてのメディアを取得します
	 * @return メディアのリスト
	 */
	public List<Media> getAll(){
		return mediaList;
	}
	
	/**
	 * レンタル中のメディアのリストを取得します。
	 * @return メディアのリスト
	 */
	public List<Media> getRentaled() {
		// todo:
		return null;
	}
	
	/**
	 * 指定されたタイトルのメディアを取得します。
	 * @return メディア
	 */
	public Media get(String name) {
		return null;
	}
}
