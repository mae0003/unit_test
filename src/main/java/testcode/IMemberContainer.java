package testcode;

import java.util.List;

public interface IMemberContainer {

    /**
     * 20 さい以上のメンバーを取得します。
     * @return
     */
    List<Member> getAdultMembers();

    /**
     * 8 さい以下のメンバーを取得します。
     * @return
     */
    List<Member> getChildMembers();

}