package unit_test.rental.model.accounting;

import java.util.List;
import java.util.Map;

import unit_test.rental.model.media.Dvd;
import unit_test.rental.model.media.Media;
import unit_test.rental.model.member.Member;

public class RentalReceipt {

	private int Point;
	
	private Map<Media, Integer> detail;
	
	private RentalReceipt(Member member, List<Dvd> dvds, List<Integer> prices) {
	}
	
	public static RentalReceipt create(Member member, List<Dvd> dvds, List<Integer> prices) {
		return new RentalReceipt(member, dvds, prices);
	}
}
