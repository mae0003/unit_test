package testcode;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.yaml.snakeyaml.Yaml;

/**
 * メンバーの情報を管理します。
 */
public class MemberContainer implements IMemberContainer {
    
    List<Member> members;
    
    public MemberContainer(List<Member> members) {
        this.members = members;
    }
    
    /* (非 Javadoc)
     * @see testcode.IMemberContainer#getAdultMembers()
     */
    public List<Member> getAdultMembers() {
        return this.members.stream()
            .filter(item -> item.age >= 20 )
            .collect(Collectors.toList());
    }

    /* (非 Javadoc)
     * @see testcode.IMemberContainer#getChildMembers()
     */
    public List<Member> getChildMembers() {
        return this.members.stream()
            .filter(item -> item.age <= 8)
            .collect(Collectors.toList());
    }
}
