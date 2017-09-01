package unit_test.lesson2;

import java.util.Date;

public class ListScreen {
    String userName;
    String lastScreenName;
    Date displayDate;
    String SessionString;

    // 引数オブジェクトの導入
    public ListScreen(String userName, String lastScreenName, Date displayDate, String sessionString) {
        super();
        this.userName = userName;
        this.lastScreenName = lastScreenName;
        this.displayDate = displayDate;
        SessionString = sessionString;
    }

    public void display() {
        System.out.println(lastScreenName);
    }
}
