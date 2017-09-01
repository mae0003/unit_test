package unit_test.lesson2.player;

import unit_test.lesson2.Refactorring;

// インターフェースの抽出
public class Player {
	
	private Video video;

	public Player() {
		super();
		video = new Video();
	}
			
	public void play() {
		video.play();
	}
}