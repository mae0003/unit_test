package unit_test.rental.model.media;

import java.util.Date;

public class Dvd {

	/** ID */
	private int id;
	/** タイトル */
	private String title;
	/** リリース日 */
	private Date rereaseDate;
	
	public Dvd(int price, String title, Date rereaseDate) {
		this.id = id;
		this.title = title;
		this.rereaseDate = rereaseDate;
	}
	
	public String getTitle() {
		return title;
	}

	public Date getRereaseDate() {
		return rereaseDate;
	}	
}
