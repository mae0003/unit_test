package unit_test.lesson1.p2;

public class Controller {
	private OneMethodInterface methodInterface;
	private TestInterface testInterface;
	private TestInterface2 testInterface2;
	
	// コンストラクタ１
	private Controller(OneMethodInterface methodInterface) {
		super();
		this.methodInterface = methodInterface;
	}

	// コンストラクタ２
	private Controller(TestInterface testInterface) {
		super();
		this.testInterface = testInterface;
	}

	// コンストラクタ３
	private Controller(TestInterface2 testInterface1) {
		super();
		this.testInterface2 = testInterface1;
	}

	static Controller createController() {
		OneMethodInterface temp = new OneMethodInterface() {
			@Override
			public void logout(String value) {
				System.out.println("OneMethodInterface" + value);
			}
		};

		return new Controller(temp);
	}
	
	static Controller createController1() {
		// ラムダ式をつかってコンストラクタ２を呼び出し
		return null;
	}
	
	static Controller createController2() {
		// ラムダ式をつかってコンストラクタ３を呼び出し
		return null;
	}
	
}
