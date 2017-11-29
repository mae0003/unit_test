package testcode;

import java.util.function.DoubleToLongFunction;

@FunctionalInterface
public interface MyFunctionable {

    public int getHoge();
    
    MyFunctionable q1_1 = new MyFunctionable() {
        @Override
        public int getHoge() {
            return 1;
        }
    };
    
    MyFunctionable q1_2 = () -> 1;
    
    class Q1_3 implements MyFunctionable {
        @Override
        public int getHoge() {
            return 0;
        }
    }
    
    DoubleToLongFunction dtl = (d) -> (long)d;
}
