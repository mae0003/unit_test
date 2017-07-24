package unit_test.rental.model.media;

import java.util.Date;

public abstract class MediaBase implements Media{
	
	private int price;
	private String title;
	private Date rereaseDate;
	
	public MediaBase(int price, String title, Date rereaseDate) {
		super();
		this.price = price;
		this.title = title;
		this.rereaseDate = rereaseDate;
	}
	
	public int getPrice() {
		return price;
	}
	public String getTitle() {
		return title;
	}
	public Date getRereaseDate() {
		return rereaseDate;
	}
}
