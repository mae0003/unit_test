package unit_test.rental.controller.media;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.Media;

import org.apache.commons.lang3.time.DateUtils;

import unit_test.rental.model.media.DvdContainer;
import unit_test.rental.model.accounting.RentalReceipt;
import unit_test.rental.model.media.Dvd;


/**
 * レンタル業務のコントローラクラスです。
 */
public class RentalController {
	
	/** レンタル 情報 */
	private class RentalInfo {
		Calendar rentalDate;
		Member member;
		int rentalDay;
		
		/**
		 * コンストラクタ
		 * 
		 * @param rentalDate レンタル日
		 * @param member メンバー
		 * @param rentalDay 泊数
		 */
		public RentalInfo(Member member, int rentalDay) {
			super();
			this.member = member;
			this.rentalDay = rentalDay;
		}
	}
	
	List<Date> campaineDate;
	Map<Dvd, RentalInfo> rentalMap = new HashMap<>();
	
	/**
	 * DVD をレンタルしてレシートを発行します。
	 */
	public RentalReceipt rentalDvd(Member member, List<Dvd> dvds, int rentalDay) {
		
		List<Integer> prices = new ArrayList<>();
		
		// 合計料金を計算
		for(Dvd dvd : dvds) {
			
			// DVD がレンタル中の場合は中止
			if (rentalMap.containsKey(dvd)) continue;
			
			Date rereaseDate = DvdContainer.getInstance().get(dvd.getTitle()).getRereaseDate();

			int price = 0;
			
			if (rentalDay == 0) {
				price = 150;
			} else if (rentalDay == 1) {
				price = 200;
			} else {
				price = 250;
			}
			
			// 新作の場合
			if (new Date().compareTo(DateUtils.addDays(rereaseDate, 30)) < 0) {
				price =+ 100;
			}
			
			// ポイントの付与
			if () {
				
			} else {
				
			}
			
			prices.add(price);
			
			// レンタル情報の登録
			rentalMap.put(dvd, new RentalInfo(member, rentalDay));
		}
		
		return RentalReceipt.create(member, dvds, prices);
	}
}
