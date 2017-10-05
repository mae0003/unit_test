package testcode;

import java.util.List;
import java.util.stream.Collectors;

public class MemberControler {
    
    public enum Type {
        Adult,
        Child
    }

    private MemberContainer container;

    public MemberControler(MemberContainer container) {
        super();
        this.container = container;
    }
    
    public List<String> getMember(Type type) {
        
        if(type == Type.Adult) {
            return container.getAdultMembers().stream().map(item -> item.name).collect(Collectors.toList());
        } else if (type == Type.Child) {
            return container.getChildMembers().stream().map(item -> item.name).collect(Collectors.toList());
        }

       throw new IllegalStateException();
    }
}
