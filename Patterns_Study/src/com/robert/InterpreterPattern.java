package com.robert;

import java.util.HashMap;
import java.util.Map;

/**
 * 解释器模式的定义如下：定义语言的文法，并且建立一个解释器来解释该语言中的句子。
 * 
 * 解释器模式的组成： 
 * 1) 抽象表达式角色：声明一个抽象的解释操作，这个接口为所有具体表达式角色（抽象语 法树中的节点）都要实现的。
 * 什么叫做抽象语法树呢？《 java 与模式》中给的解释为：抽象语法树的每一个节点都 代表一个语句，而在每个节点上都可以执行解释方法。
 * 这个解释方法的执行就代表这个 语句被解释。由于每一个语句都代表这个语句被解释。 由于每一个语句都代表一个常见
 * 的问题的实例，因此每一个节点上的解释操作都代表对一个问题实例的解答。 
 * 2) 终结符表达式角色：具体表达式。
 *  a) 实现与文法中的终结符相关联的解释操作
 *  b) 而且句子中的每个终结符需要该类的一个实例与之对应
 * 3) 非终结符表达式角色：具体表达式。
 *  a) 文法中的每条规则 R::=R1R2…Rn都需要一个非终结符表带式角色
 *  b) 对于从 R1 到 Rn 的每个符号都维护一个抽象表达式角色的实例变量
 *  c) 实现解释操作，解释一般要递归地调用表示从R1 到 Rn 的那些对象的解释操作
 * 4) 上下文（环境）角色：包含解释器之外的一些全局信息。
 * 5) 客户角色 
 *  a)构建（或者被给定）表示该文法定义的语言中的一个特定的句子的抽象语法树
 *  b) 调用解释操作
 * 
 * @author robert
 * 
 */
public class InterpreterPattern {

	private static Expression ex;
	private static Context con;

	public static void main(String[] args) {
		con = new Context();
		// 设置变量、常量
		Variable a = new Variable();
		Variable b = new Variable();
		Constant c = new Constant(2);
		// 为变量赋值
		con.addValue(a, 5);
		con.addValue(b, 7);
		// 运算，对句子的结构由我们自己来分析，构造
		ex = new Division(new Multiply(a, b), new Add(new Subtract(a, b), c));
		System.out.println("运算结果为：" + ex.interpret(con));
	}
}

//上下文角色，使用HashMap来存储变量对应的数值
class Context {
	@SuppressWarnings("rawtypes")
	private Map valueMap = new HashMap();

	@SuppressWarnings("unchecked")
	public void addValue(Variable x, int y) {
		Integer yi = new Integer(y);
		valueMap.put(x, yi);
	}

	public int LookupValue(Variable x) {
		int i = ((Integer) valueMap.get(x)).intValue();
		return i;
	}
} 

// 抽象表达式角色，也可以用接口来实现
abstract class Expression {
	public abstract int interpret(Context con);
}

// 终结符表达式角色
class Constant extends Expression {
	private int i;

	public Constant(int i) {
		this.i = i;
	}

	public int interpret(Context con) {
		return i;
	}
}

class Variable extends Expression {
	public int interpret(Context con) { // this 为调用 interpret 方法的 Variable 对象
		return con.LookupValue(this);
	}
}

// 非终结符表达式角色
class Add extends Expression {
	private Expression left, right;

	public Add(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public int interpret(Context con) {
		return left.interpret(con) + right.interpret(con);
	}
}

class Subtract extends Expression {
	private Expression left, right;

	public Subtract(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public int interpret(Context con) {
		return left.interpret(con) - right.interpret(con);
	}
}

class Multiply extends Expression {
	private Expression left, right;

	public Multiply(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public int interpret(Context con) {
		return left.interpret(con) * right.interpret(con);
	}
}

class Division extends Expression {
	private Expression left, right;

	public Division(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public int interpret(Context con) {
		try {
			return left.interpret(con) / right.interpret(con);
		} catch (ArithmeticException ae) {
			System.out.println("被除数为 0！");
			return -11111;
		}
	}
} //

