package test.com.closure;

public class TestTeachableProgrammer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TeachableProgrammer tp = new TeachableProgrammer("李刚");
		tp.work();
		
		tp.getCallbackReference().work();

	}

}
