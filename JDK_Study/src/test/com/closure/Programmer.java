package test.com.closure;

public class Programmer {
	
	private String name;
	
	public Programmer(){}
	
	public Programmer(String name) {
		this.setName(name);
	}
	
	public void work() {
		System.out.println(getName() + "在灯下认真敲键盘...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
