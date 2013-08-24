package com.robert;

/**
 * 备忘录模式的组成部分:
 *  1) 备忘录(Memento)角色:备忘录角色存储“备忘发起角色”的内部状态。
 * “备忘发起角色”根据需要决定备忘录角色存储“备忘发起角色”的哪些内部状态。为了防止“备忘发起角色”以外的其他对象访问备忘录。 
 *   备忘录实际上有两个接口,
 *   “备忘录管理者角色”只能看到备忘录提供的窄接口——对于备忘录角色中存放的属性是不可见的。
 *   “备忘发起角色”则能够看到一个宽接口——能够得到自己放入备忘录角色中属性。
 * 
 * 2) 备忘发起(Originator)角色: “备忘发起角色”创建一个备忘录,用以记录当前时刻它的内部状态。在需要时使用备忘录恢复内部状态。
 * 
 * 3) 备忘录管理者(Caretaker)角色:负责保存好备忘录。不能对备忘录的内容进行操作或检查。
 * 
 * 第一种就是采用两个不同的接口类来限制访问权限。
 * 这两个接口类中,
 * 一个提供比较完备的操作状态的方法,我们称它为宽接口;
 * 而另一个则可以只是一个标示,我们称它为窄接口。
 * 
 * 备忘录角色要实现这两个接口类。
 * 这样对于“备忘发起角色”采用宽接口进行访问,而对于其他的角色或者对象则采用窄接口进行访问。
 * 这种实现比较简单,但是需要人为的进行规范约束——而这往往是没有力度的。
 * 
 * 第二种方法便很好的解决了第一种的缺陷:
 * 采用内部类来控制访问权限。
 * 将备忘录角色作为“备忘发起角色”的一个私有内部类。好处我不详细解释了,看看代码吧就明白了。
 * 
 * 下面的代码是一个完整的备忘录模式的教学程序。它便采用了第二种方法来实现备忘录模式。
 * 
 * @author robert
 * 
 */
public class MementoPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Originator o = new Originator();
		o.createMemento();
		o.modifyState4Test(80);
		o.setMemento();
	}

}

class Originator {
	// 这个是要保存的状态
	private int state = 90;
	// 保持一个“备忘录管理者角色”的对象
	private Caretaker caretaker = new Caretaker();

	// 读取备忘录角色以恢复以前的状态
	public void setMemento() {
		Memento memento = (Memento) caretaker.getMemento();
		state = memento.getState();
		System.out.println("the state is " + state + " now");
	}

	// 创建一个备忘录角色,并将当前状态属性存入,托给“备忘录管理者角色”存放。
	public void createMemento() {
		caretaker.saveMemento(new Memento(state));
	}

	// this is other business methods...
	// they maybe modify the attribute state
	public void modifyState4Test(int m) {
		state = m;
		System.out.println("the state is " + state + " now");
	}

	// 作为私有内部类的备忘录角色,它实现了窄接口,可以看到在第二种方法中宽接
	// 口已经不再需要
	// 注意:里面的属性和方法都是私有的
	private class Memento implements MementoIF {
		private int state;

		private Memento(int state) {
			this.state = state;
		}

		private int getState() {
			return state;
		}
	}
}

// 窄接口
interface MementoIF {
}

// “备忘录管理者角色”
class Caretaker {
	private MementoIF mementoIF;

	public void saveMemento(MementoIF m) {
		this.mementoIF = m;
	}

	public MementoIF getMemento() {
		return mementoIF;
	}
}

