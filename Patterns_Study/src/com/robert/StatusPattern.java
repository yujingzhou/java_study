package com.robert;

/**
 * 允许一个对象在其内部状态改变时改变它的行为。这个对象看起来似乎修改了它的类。
 * 看起来,状态模式好像是神通广大——居然能够“修改自身的类”!
 * 
 * 状态模式的角色组成吧:
 * 1) 使用环境(Context)角色:客户程序是通过它来满足自己的需求。它定义了客户程序
 * 需要的接口;并且维护一个具体状态角色的实例,这个实例来决定当前的状态。
 * 2) 状态(State)角色:定义一个接口以封装与使用环境角色的一个特定状态相关的行为。
 * 3) 具体状态(Concrete State)角色:实现状态角色定义的接口。
 * 
 * 状态模式的适用情况:
 * 1) 一个对象的行为取决于它的状态, 并且它必须在运行时刻根据状态改变它的行为。
 * 2) 一个操作中含有庞大的多分支的条件语句,且这些分支依赖于该对象的状态。
 * 
 * @author robert
 *
 */
public class StatusPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
