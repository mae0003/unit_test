package unit_test.lesson2;

import java.util.Date;

public class ListScreenParameter {
    public String userName;
    public String lastScreenName;
    public Date displayDate;
    public String sessionString;

    public ListScreenParameter(String userName, String lastScreenName, Date displayDate, String sessionString) {
        this.userName = userName;
        this.lastScreenName = lastScreenName;
        this.displayDate = displayDate;
        this.sessionString = sessionString;
    }
    
    
}