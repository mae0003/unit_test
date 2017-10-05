package testcode;

public class TestSingleton {
    
    private static TestSingleton instance = new TestSingleton(); 
    
    /**
     * 非公開にします。
     */
    private TestSingleton() {}
    
    private static int callNumber = 0;
    
    public int getCallNumber() {
        return callNumber;
    }

    public static TestSingleton getInstance() {
        callNumber++;
        return instance;
    }
}
