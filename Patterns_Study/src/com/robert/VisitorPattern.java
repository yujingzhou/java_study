package com.robert;

/**
 * 访问者模式,
 * 顾名思义使用了这个模式后就可以在不修改已有程序结构的前提下,
 * 通过添加额外的“访问者”来完成对已有代码功能的提升。
 * 
 * 访问者模式的组成结构:
 * 1、访问者角色(Visitor):为该对象结构中具体元素角色声明一个访问操作接口。
 * 该操作接口的名字和参数标识了发送访问请求给具体访问者的具体元素角色。
 * 这样访问者就可以通过该元素角色的特定接口直接访问它。
 * 2、具体访问者角色(Concrete Visitor):实现每个由访问者角色(Visitor)声明的操作。
 * 3、元素角色(Element):定义一个 Accept 操作,它以一个访问者为参数。
 * 4、具体元素角色(Concrete Element):实现由元素角色提供的 Accept 操作。
 * 5、对象结构角色(Object Structure):这是使用访问者模式必备的角色。
 * 它要具备以下特征:
 * 能枚举它的元素;可以提供一个高层的接口以允许该访问者访问它的元素;
 * 可以是一个复合(组合模式)或是一个集合,如一个列表或一个无序集合。
 * 
 * @author robert
 *
 */
public class VisitorPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
