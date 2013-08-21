package test.com.closure;

public class TeachableProgrammer extends Programmer {

	public TeachableProgrammer() {
	}

	public TeachableProgrammer(String name) {
		super(name);
	}

	private void teach() {
		System.out.println(getName() + "教师在讲台上讲解...");
	}

	private class Closure implements Teachable {
		public void work() {
			teach();
		}
	}

	public Teachable getCallbackReference() {
		return new Closure();
	}
}
