package test.com;

public class TestForTraining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new TestForTraining().foo());
	}
	
	private int foo(){
		int i = 1;
		try {
			i = Integer.parseInt("A");
			return i;
		} catch (NumberFormatException nfe) {
			i = 2;
			return i;
		}finally{
			i=3;
		}
	}

}
