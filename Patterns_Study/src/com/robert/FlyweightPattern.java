package com.robert;

/**
 * 单纯享元模式 1、抽象享元角色：为具体享元角色规定必须实现的方法。而外蕴状态就是以参数的形式通过此方法传入。在Java中可以由抽象类、接口来担当。
 * 2、具体享元角色：实现抽象角色规定的方法。如果存在内蕴状态，就负责为内蕴状态提供存储空间。
 * 3、享元工厂角色：负责创建和管理享元角色。要想达到共享的目的，这个角色的实现是关键！
 * 4、客户端角色：维护对所有享元对象的引用，而且还需要存储对应的外蕴状态。
 * 
 * 复合享元模式 1、抽象享元角色：为具体享元角色规定了必须实现的方法，而外蕴状态就是以参数的形式通过此方法传入。在Java中可以由抽象类、接口来担当。
 * 2、具体享元角色：实现抽象角色规定的方法。如果存在内蕴状态，就负责为内蕴状态提供存储空间。
 * 3、复合享元角色：它所代表的对象是不可以共享的，并且可以分解成为多个单纯享元对象组合。
 * 4、享元工厂角色：负责创建和管理享元角色。要想达到共享的目的，这个角色的实现是关键！
 * 5、客户端角色：维护对所有享元对象的引用，而且还需要存储对应的外蕴状态。
 * 
 * @author robert
 * 
 */

class ExternalizedData {
	static final int size = 5000000;
	static int[] id = new int[size];
	static int[] i = new int[size];
	static float[] f = new float[size];
	static {
		for (int i = 0; i < size; i++)
			id[i] = i;
	}
} // 这个类

class FlyPoint {
	private FlyPoint() {
	}

	public static int getI(int obnum) {
		return ExternalizedData.i[obnum];
	}

	public static void setI(int obnum, int i) {
		ExternalizedData.i[obnum] = i;
	}

	public static float getF(int obnum) {
		return ExternalizedData.f[obnum];
	}

	public static void setF(int obnum, float f) {
		ExternalizedData.f[obnum] = f;
	}

	public static String str(int obnum) {
		return "id:" + ExternalizedData.id[obnum] + ", i = "
				+ ExternalizedData.i[obnum] + ", f = "
				+ ExternalizedData.f[obnum];
	}

}

// 客户程序

public class FlyweightPattern {
	public static void main(String[] args) {
		for (int i = 0; i < ExternalizedData.size; i++) {
			FlyPoint.setI(i, FlyPoint.getI(i) + 1);
			FlyPoint.setF(i, 47.0f);
		}
		System.out.println(FlyPoint.str(ExternalizedData.size - 1));
	}
} //

